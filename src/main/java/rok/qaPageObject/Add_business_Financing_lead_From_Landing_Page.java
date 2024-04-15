package rok.qaPageObject;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import rok.qa.Utilities.Wrappers;

public class Add_business_Financing_lead_From_Landing_Page {

	WebDriver ldriver;

	public Add_business_Financing_lead_From_Landing_Page(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// 2.identify WebElement
	@FindBy(xpath = "//a[text()='https://go.mypartner.io/dev/business-financing/?ref=0017j00000yDVj0AAG']")
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
	@FindBy(id = "credit_score")
	WebElement plaidcscore;
	@FindBy(id = "industry")
	WebElement plaidindustry;
	@FindBy(id = "time_business")
	WebElement plaidtimebusiness;
	@FindBy(id = "annual_sales")
	WebElement plaidannualsales;
	@FindBy(id = "product")
	WebElement plaidproduct;
	@FindBy(xpath = "//span[@class='checkmark']")
	WebElement plaidcheckbox;
	@FindBy(xpath = "//button[@name='submit']")
	WebElement plaidsbbut;
	@FindBy(xpath = "//select[@id=\"time_business\"]")
	WebElement plaidtimeb;
	// input[@id="monthly_gross"]
	@FindBy(xpath = "//input[@id=\"monthly_gross\"]")
	WebElement plaidmgropss;
	@FindBy(xpath = "//button[@name='submit']")
	WebElement clickbt;

	public void landingpageleads() throws InterruptedException {

		// Wrappers.clickJS(cliclonhome);
		Thread.sleep(5000);
		Wrappers.executeScript("window.scrollTo(0, document.body.scrollHeight / 2)");
		Wrappers.clickJS(cliclBFurl);
		Wrappers.windowhand();
		Thread.sleep(5000);
		plaidusername.sendKeys("aress_dev");
		plaidpassword.sendKeys("4*Ceu7r5pU5II1Zs@qBAiU2I");
		plaidsubbt.click();
		Thread.sleep(5000);
		Wrappers.windowhand2();
		plaidldfirstname.sendKeys("aress_dev");
		plaidlastname.sendKeys("Wrappers.generateUniqueString()");
		plaidbname.sendKeys("rok");
		plaidemail.sendKeys(Wrappers.generateUniqueString() + "@yopmail.com");
		plaidbphone.sendKeys("1212121212");
		plaidmphone.sendKeys("6767676767");
		Select score = new Select(plaidcscore);
		score.selectByVisibleText("720 +");
		Select industry = new Select(plaidindustry);
		industry.selectByVisibleText("Auto Repair");
		Select annualsale = new Select(plaidannualsales);
		annualsale.selectByVisibleText("$360,000 - $1,000,000");
		Select product = new Select(plaidproduct);
		product.selectByVisibleText("SBA");
		Select timebs = new Select(plaidtimeb);
		timebs.selectByVisibleText("1 Year");
		plaidmgropss.sendKeys("1000");
		Thread.sleep(5000);
		Wrappers.uploadfrombottom("window.scrollTo(0, document.body.scrollHeight)");
		plaidcheckbox.isSelected();
		plaidcheckbox.click();
		Thread.sleep(2000);
		Wrappers.clickJS(clickbt);

	}

}
