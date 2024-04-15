package rok.qaPageObject;

import java.time.Duration;


import java.util.function.Supplier;

import org.apache.commons.lang3.function.Suppliers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Wrapper.ClickButton;
import Wrapper.WaitForElement;
import rok.qa.Utilities.Wrappers;


public class Create_Opportunity_From_Salesforce {

	public WebDriver ldriver;

	public Create_Opportunity_From_Salesforce(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@type='email']")
	WebElement sfemail;
	@FindBy(xpath = "//input[@type='password']")
	WebElement sfpassword;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement sfsubit;

	@FindBy(xpath = "//div[@class='slds-context-bar']//a[@title='Opportunities']")
	WebElement clickopportunity;
	@FindBy(xpath = "//div[@title='New']")
	WebElement clicknew;
	@FindBy(xpath = "//input[@class='slds-input' and@name='Name']")
	WebElement enteropportunityname;
	@FindBy(xpath = "(//input[@class='slds-combobox__input slds-input' and@placeholder='Search Accounts...'])[3]")
	WebElement enteraccountname;
	@FindBy(xpath = "//lightning-base-combobox-formatted-text[contains(text(),'roktesingRP')]")
	WebElement selectaccount;
	@FindBy(xpath = "//button[@class=\"slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value\"and@aria-label=\"Stage - Current Selection: --None--\"]")
	WebElement clickonstage;
	@FindBy(xpath = "//span[@title='1 - Prospecting']")
	WebElement selectstage1;
	@FindBy(xpath = "//input[@name='CloseDate']")
	WebElement clickondate;
	@FindBy(xpath = "//span[@class=\"slds-day\"][contains(text(),'20')]")
	WebElement selectdate;
	@FindBy(xpath = "//button[@name='SaveEdit']")
	WebElement clickonsave;

	@FindBy(xpath = "//span[.='Manage Leads']")
	WebElement clickManageleads;
	@FindBy(xpath = "(//a[contains(text(),'View')])[1]")
	WebElement clickManageleadsview;
	@FindBy(xpath = "//span[contains(text(),'Edit Lead Source')]")
	WebElement Editsource;
	@FindBy(xpath = "//button[@data-value=\"Unknown - Rep to Get Lead Source\"]")
	WebElement clickonsource;
	@FindBy(xpath = "//span[contains(text(),'APEX')]")
	WebElement selectsource;
	@FindBy(xpath = "//span[@class=\"slds-checkbox slds-checkbox_standalone\"]//input[@name=\"ROK_BypassPreQualRequirement__c\"]")
	WebElement checkboxcheck;
	@FindBy(xpath = "//button[@class=\"slds-button slds-button_brand\"]")
	WebElement clickonsaveedit;

	@FindBy(xpath = "//a[@data-tab-name=\"2 - Deal Packaging\"]")
	WebElement selectstage2;
	@FindBy(xpath = "//button[@class=\"slds-button slds-button--brand slds-path__mark-complete stepAction active uiButton\"]//span[contains(text(),'Mark as Current Stage')]")
	WebElement MarkStageasComplete;
	@FindBy(xpath = "//div[@class='modal-footer slds-modal__footer']//button[contains(text(),'Done')]")
	WebElement stagedone;
	@FindBy(xpath = "//a[@data-tab-name=\"3 - Deal Review\"]")
	WebElement selectstage3;
	@FindBy(xpath = "//a[@data-tab-name='4 - Underwriting']")
	WebElement selectstage4;
	@FindBy(xpath = "//a[@data-tab-name=\"5 - Offers Received\"]")
	WebElement selectstage5;
	@FindBy(xpath = "//a[@data-tab-name=\"6 - Presented Offer\"]")
	WebElement selectstage6;
	@FindBy(xpath = "//a[@data-tab-name=\"7 - Contracts Requested\"]")
	WebElement selectstage7;
	@FindBy(xpath = "//a[@data-tab-name=\"8 - Contracts Out\"]")
	WebElement selectstage8;
	@FindBy(xpath = "//a[@data-tab-name=\"9 - Final U/W\"]")
	WebElement selectstage9;

	@FindBy(xpath = "//a[contains(text(),'Financial Info')]")
	WebElement clickonfinatialinfo;
	@FindBy(xpath = "//div[@class='slds-align_absolute-center slds-m-top_medium slds-m-bottom_medium']//button[contains(text(),'New')]")
	WebElement clickonnewbankstatment;
	@FindBy(xpath = "//input[@name=\"ROK_TotalDeposits__c\"]")
	WebElement Entertotaldeposdit;
	@FindBy(xpath = "//input[@name=\"ROK_ofDeposits__c\"]")
	WebElement Enterdeposdit;
	@FindBy(xpath = "//input[@name=\"ROK_ofNegativeDays__c\"]")
	WebElement EnterNegativeDays;
	@FindBy(xpath = "//div[@class='footer-full-width']//button[@name='SaveEdit']")
	WebElement savebanistatment;

	@FindBy(xpath = "//a[@class='slds-tabs_default__link'][contains(text(),'Submissions/Offers')]")
	WebElement Clickonsubmissions;
	@FindBy(xpath = "//div[@class='slds-align_absolute-center slds-m-top_medium slds-m-bottom_medium cROK_Submission_Table']//button[contains(text(),'New')]")
	WebElement clickonnewsub;
	@FindBy(xpath = "//input[@name='ROK_HighestOffer__c']")
	WebElement EnterHighestOffer;
	@FindBy(xpath = "//div[@class='footer-full-width']//button[contains(text(),'Save')]")
	WebElement clickonsubsave;
	@FindBy(xpath = "//div[@class='slds-grid slds-size_1-of-1 label-inline undo']//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']")
	WebElement clickonstatus;
	@FindBy(xpath = "//span[@title='Additional Information Required']")
	WebElement selectaddinforequired;

	public void SFlogin() throws InterruptedException {

		ldriver.get("https://rok--rokcommqa.sandbox.lightning.force.com/");
		WaitForElement.visibilityOfElement(ldriver, sfemail, Duration.ofSeconds(500));
		sfemail.sendKeys("testaress12july@yopmail.com");
		WaitForElement.visibilityOfElement(ldriver, sfpassword, Duration.ofSeconds(500));
		sfpassword.sendKeys("Aress@123");
		WaitForElement.elementToBeClickable(ldriver, sfsubit, Duration.ofSeconds(500));
		sfsubit.click();
	}

	

	public void Tocreateopportunity() throws InterruptedException {

		Wrappers.clickJS(clickopportunity);
		Wrappers.clickJS(clicknew);
		enteropportunityname.sendKeys(Wrappers.generateUniqueString());
		enteraccountname.sendKeys("roktestingRP");
		Wrappers.clickJS(selectaccount);
		Wrappers.clickJS(clickonstage);
		Wrappers.clickJS(selectstage1);
		Wrappers.clickJS(clickondate);
		Wrappers.clickJS(selectdate);
		Wrappers.clickJS(clickonsave);
		Wrappers.clickJS(Editsource);
		WaitForElement.elementToBeClickable(ldriver, clickonsource, Duration.ofSeconds(500));
		clickonsource.click();
		WaitForElement.elementToBeClickable(ldriver, selectsource, Duration.ofSeconds(500));
		selectsource.click();
		Wrappers.clickJS(checkboxcheck);
		Wrappers.clickJS(clickonsaveedit);
		Wrappers.clickJS(selectstage2);
		Wrappers.clickJS(MarkStageasComplete);
		Wrappers.clickJS(stagedone);
		Wrappers.clickJS(selectstage3);
		Wrappers.clickJS(MarkStageasComplete);
		Wrappers.clickJS(stagedone);
		Thread.sleep(5000);
		Wrappers.clickJS(selectstage4);
		Wrappers.clickJS(MarkStageasComplete);
		Wrappers.clickJS(stagedone);
		Thread.sleep(5000);
		Wrappers.clickJS(selectstage5);
		Wrappers.clickJS(MarkStageasComplete);
		Wrappers.clickJS(stagedone);
		Thread.sleep(5000);
		Wrappers.clickJS(selectstage6);
		Wrappers.clickJS(MarkStageasComplete);
		Wrappers.clickJS(stagedone);
		Thread.sleep(5000);
		Wrappers.clickJS(selectstage7);
		Wrappers.clickJS(MarkStageasComplete);
		Wrappers.clickJS(stagedone);
		Thread.sleep(5000);
		Wrappers.clickJS(selectstage8);
		Wrappers.clickJS(MarkStageasComplete);
		Wrappers.clickJS(stagedone);
		Thread.sleep(5000);
		Wrappers.clickJS(selectstage9);
		Wrappers.clickJS(MarkStageasComplete);
		Wrappers.clickJS(stagedone);
	
	}

	public void addbankstatment() {
		Wrappers.clickJS(clickonfinatialinfo);
		Wrappers.clickJS(clickonnewbankstatment);
		Wrappers.clickJS(Entertotaldeposdit);
		Wrappers.clickJS(Enterdeposdit);
		Wrappers.clickJS(EnterNegativeDays);
		Wrappers.clickJS(savebanistatment);
	}

}
