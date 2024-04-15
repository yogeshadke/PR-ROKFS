package rok.qaPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rok.qa.Utilities.Wrappers;

public class Add_referral_partner_lead_from_landing_page {
	
	WebDriver ldriver;

	public Add_referral_partner_lead_from_landing_page(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// 2.identify WebElement
	@FindBy(xpath = "//a[text()='https://go.mypartner.io/dev/referral-partner/?ref=0017j00000yDVj0AAG']")
	WebElement cliclBFurl;
	@FindBy(xpath = "//input[@id='user_login']")
	WebElement plaidusername;	
	@FindBy(xpath = "//input[@id='user_pass']")
	WebElement plaidpassword;
	@FindBy(xpath = "//button[@id='wp-submit']")
	WebElement plaidsubbt;
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement plaidldfirstname;
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement plaidlastname;	
	@FindBy(xpath = "//input[@id='business_name']")
	WebElement plaidbname;
	@FindBy(xpath = "//input[@id='email']")
	WebElement plaidemail;
	@FindBy(xpath = "//input[@id='business_phone']")
	WebElement plaidbphone;
	@FindBy(xpath = "//input[@id='mobile_phone']")
	WebElement plaidmphone;
	@FindBy(xpath = "//input[@id='job_title']")
	WebElement plaidjbtitle;
	@FindBy(xpath = "//span[@class='checkmark']")
	WebElement plaidcheckbox1;
	@FindBy(xpath = "//button[@name='submit']")
	WebElement clickbt1;
	
	
	
	
	
	public void RPlndlead() throws InterruptedException {

		//Wrappers.clickJS(cliclonhome);
		Thread.sleep(5000);
		Wrappers.executeScript("window.scrollTo(0, document.body.scrollHeight / 2)");
		Wrappers.clickJS(cliclBFurl);
		Wrappers.windowhand();
		plaidusername.sendKeys("aress_dev");
		plaidpassword.sendKeys("4*Ceu7r5pU5II1Zs@qBAiU2I");
		plaidsubbt.click();
		Thread.sleep(5000);
		Wrappers.windowhand2();
		plaidldfirstname.sendKeys("aress_dev3");
		plaidlastname.sendKeys(Wrappers.generateUniqueString());
		plaidbname.sendKeys("rok3");
		plaidemail.sendKeys(Wrappers.generateUniqueString()+"@yopmail.com");
		plaidbphone.sendKeys("1212121213");
		plaidmphone.sendKeys("6767676763");
		plaidjbtitle.sendKeys("rokFinance3");
		plaidcheckbox1.isSelected();
		plaidcheckbox1.click();
		Thread.sleep(2000);
		Wrappers.clickJS(clickbt1);
		
		
	}

}
