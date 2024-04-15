package rok.qaPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import rok.qa.Utilities.Wrappers;

public class Convert_Lead_into_account {
	public WebDriver ldriver;
	WebDriverWait wait;

	public Convert_Lead_into_account(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// 2.identify WebElement
	@FindBy(xpath = "//button[contains(text(),'Manage Partner')]")
	WebElement clickRPtab;
	@FindBy(xpath = "//*[contains(text(),'Manage Partner Leads')]")
	WebElement Rpmanagelead;

	@FindBy(xpath = "(//a[contains(text(),'View')])[1]")
	WebElement clickManageleadsview;

	// td[@data-col-key-value="FirstName-text-4"]
	@FindBy(xpath = "//td[@data-col-key-value='FirstName-text-4']")
	WebElement gettext1;

	@FindBy(xpath = "//input[@type='email']")
	WebElement sfemail;
	@FindBy(xpath = "//input[@type='password']")
	WebElement sfpassword;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement sfsubit;
	// div[@class='slds-form-element__control slds-grow slds-input-has-icon
	// slds-input-has-icon_left-right']

	// input[@title="Search Users"]
	@FindBy(xpath = "//input[@title='Search Users']")
	WebElement searcheuser;

	@FindBy(xpath = "(//div[@class='primaryLabel slds-truncate slds-lookup__result-text'])[1]")
	WebElement changeuserselect;

	// button[@name="change owner"]

	@FindBy(xpath = " //button[@name='change owner']	")
	WebElement changeownersave;

	@FindBy(xpath = "//button[@name='Convert']")
	WebElement convert;

	// button[@class="slds-button slds-button_brand"]
	@FindBy(xpath = "//div[@class='modal-footer slds-modal__footer']//button[contains(text(),'Convert')]")
	WebElement convertconfirm;

	@FindBy(xpath = "//input[@type='search' and @placeholder='Search...']")
	WebElement searchop;
	@FindBy(xpath = "//a[@class='slds-context-bar__label-action dndItem']//span[contains(text(),'Leads')]")
	WebElement clickonopps;
	@FindBy(xpath = "//button[@aria-label='Search']")
	WebElement clickosrch;
	@FindBy(xpath = "(//input[@class='slds-input' and @part='input'])[2]")
	WebElement oppssearch;
	@FindBy(xpath = "(//div[@class='instant-results-list']//span[@part='formatted-rich-text'])[3]")
	WebElement selectopt1;

	@FindBy(xpath = "//span[contains(text(),'Change Owner')]")
	WebElement changeowner;

	// input[@title="Search Users"]
	@FindBy(xpath = "//input[@title='Search Users']")
	WebElement searcheuser1;

	@FindBy(xpath = "(//div[@class='primaryLabel slds-truncate slds-lookup__result-text'])[1]")
	WebElement changeuserselect1;

	// button[@name="change owner"]

	@FindBy(xpath = " //button[@name='change owner']	")
	WebElement changeownersave1;

	@FindBy(xpath = "//button[@name='Convert']")
	WebElement convert1;

	// button[@class="slds-button slds-button_brand"]
	@FindBy(xpath = "//div[@class='modal-footer slds-modal__footer']//button[contains(text(),'Convert')]")
	WebElement convertconfirm1;

	// div[@class="picklist uiMenu"]//a[@role="button"]

	@FindBy(xpath = "(//a[@class='select'])[1]")
	WebElement recordtype1;

	// a[@role="menuitemradio"and @title="Referral Partner"]
	@FindBy(xpath = "//a[@role='menuitemradio'and @title='Referral Partner']")
	WebElement selectRP;

	public void Convertleadtoaccount() throws InterruptedException {
		Wrappers.clickJS(clickRPtab);
		Thread.sleep(6000);
		Wrappers.clickJS(Rpmanagelead);
		String savetext = gettext1.getText();
		System.out.println(savetext);
		ldriver.switchTo().newWindow(WindowType.TAB);
		ldriver.get("https://rok--rokcommqa.sandbox.lightning.force.com/");
		sfemail.sendKeys("testaress12july@yopmail.com");
		sfpassword.sendKeys("Aress@123");
		sfsubit.click();
		Thread.sleep(6000);
		Wrappers.clickJS(clickonopps);
		Thread.sleep(6000);
		Wrappers.clickJS(clickosrch);
		Thread.sleep(4000);
		oppssearch.sendKeys(savetext);
		Thread.sleep(4000);
		Wrappers.clickJS(selectopt1);
		Wrappers.clickJS(changeowner);
		searcheuser.sendKeys("Test User");
		Thread.sleep(6000);
		Wrappers.clickJS(changeuserselect1);
		Wrappers.clickJS(changeownersave1);
		Thread.sleep(10000);
		Wrappers.clickJS(convert1);
		Thread.sleep(10000);
		Wrappers.clickJS(recordtype1);

//	       Select objSelect =new Select(recordtype1);
//	       objSelect.selectByVisibleText("Referral Partner");

		Thread.sleep(3000);
		Wrappers.clickJS(selectRP);

		Thread.sleep(12000);
		Wrappers.clickJS(convertconfirm1);
		Thread.sleep(6000);
		Wrappers.clickJS(convertconfirm1);

	}

}