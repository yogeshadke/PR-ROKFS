package rok.qaPageObject;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Wrapper.PageLoad;
import Wrapper.WaitForElement;
import rok.qa.Utilities.Wrappers;

public class Add_BF_New_Lead_From_Community {
	WebDriver ldriver;

	public Add_BF_New_Lead_From_Community(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// 2.identify WebElement
	@FindBy(xpath = "//div[@class='comm-navigation forceCommunityGlobalNavigation']//li//button[contains(text(),'Manage Deals')]")
	WebElement ManageDeals;
	@FindBy(xpath = "//span[.='Manage Leads']")
	WebElement Manageleads;
	@FindBy(xpath = "//*[contains(text(),'Add New Lead')]")
	WebElement AddNewLeads;
	@FindBy(xpath = "//*[contains(text(),'DEAL INFORMATION')]")
	WebElement clickondealinfo;
	@FindBy(xpath = "//*[contains(text(),'Select Lead Source')]")
	WebElement leadsource;
	@FindBy(xpath = "//div[@part='dropdown overlay']//span[contains(text(),'Paid Ads')]")
	WebElement leadsourceDropdownOptions;
	@FindBy(xpath = "//*[@title='COMPANY INFORMATION']")
	WebElement clickoncomp;
	@FindBy(xpath = "//input[@placeholder='Company Name']")
	WebElement compname;
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement compemail;
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement compfirstname;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement complastname;
	@FindBy(xpath = "//button[@aria-label=\"Annual Sales: - Current Selection: Annual Sales\"]")
	WebElement annualsales;
	@FindBy(xpath = "//*[@title='$1,800,000 - $3,000,000']")
	WebElement anualsaleamt;
	@FindBy(xpath = "//div[@class=\"slds-modal__footer\"]//button[contains(text(),'Save')]")
	WebElement clickonsave;

	// lightning-datatable[@data-id="table"]

	@FindBy(xpath = "//lightning-datatable[@data-id='table']")
	WebElement datatable;

	// lightning-datatable[@data-id="table"]//td[@tabindex="0"]

	@FindBy(xpath = "(//div[@class='slds-scrollable_y']//td[@data-label='Company'])[3]")
	WebElement comp1;

	public void creatnewlead() throws InterruptedException {

		PageLoad.setDriver(ldriver);

		Wrappers.clickJS(Manageleads);
		PageLoad.waitForPageToLoad();
		Wrappers.clickJS(AddNewLeads);
		Wrappers.clickJS(clickondealinfo);
		Wrappers.clickJS(leadsource);
		Wrappers.clickJS(leadsourceDropdownOptions);
		Wrappers.clickJS(clickoncomp);
		compname.sendKeys(Wrappers.generateUniqueString());
		compemail.sendKeys(Wrappers.generateUniqueString() + "@yopmail.com");
		compfirstname.sendKeys(Wrappers.generateUniqueString() + "1");
		complastname.sendKeys("Fanance2");
		Wrappers.clickJS(annualsales);
		Wrappers.clickJS(anualsaleamt);
		Wrappers.clickJS(clickonsave);

	}

}
