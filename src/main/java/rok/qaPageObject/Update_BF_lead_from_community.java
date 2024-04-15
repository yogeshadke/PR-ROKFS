package rok.qaPageObject;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Equivalence.Wrapper;

import Wrapper.WaitForElement;

import java.awt.event.KeyEvent;
import java.time.Duration;
import rok.qa.Utilities.FileUploadUsingRobot;
import rok.qa.Utilities.Wrappers;

public class Update_BF_lead_from_community {
	WebDriver ldriver;
	String filePath1 = "D:\\pdf test3.pdf";
Duration timeout;
	public Update_BF_lead_from_community(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

	// 2.identify WebElement
	@FindBy(xpath = "//button[contains(text(),'Manage Deals')]")
	WebElement clickmanageBFlead;
	@FindBy(xpath = "//span[.='Manage Leads']")
	WebElement clickManageleads;
	@FindBy(xpath = "(//a[contains(text(),'View')])[1]")
	WebElement clickManageleadsview;
	@FindBy(xpath = "//span[contains(text(),\"Edit Company\")]")
	WebElement clickoneditcomp;
	@FindBy(xpath = "//div[@class='slds-form-element__control slds-grow']//input[@name='Company']")
	WebElement Editcopname;
	@FindBy(xpath = "//div[@class=\"slds-form-element__control slds-grow\"]//input[@inputmode=\"email\"]")
	WebElement Editemail;
	@FindBy(xpath = "//div[@class=\"slds-form-element__control slds-grow\"]//input[@name=\"firstName\"]")
	WebElement Editfirstname;
	@FindBy(xpath = "//div[@class=\"slds-form-element__control slds-grow\"]//input[@name=\"lastName\"]")
	WebElement Editlastname;
	@FindBy(xpath = "//div[@class=\"slds-form-element__control slds-grow\"]//input[@name=\"Phone\"]")
	WebElement Editbsphone;
	@FindBy(xpath = "//button[@aria-label='Annual Gross Sales Range (Form) - Current Selection: --None--']")
	WebElement Editannualgross;
	@FindBy(xpath = "//a[contains(text(),'$120,000 - $360,000')]")
	WebElement Editselectannualgross;
	@FindBy(xpath = "//div[@class=\"footer-full-width\"]//button[@name=\"SaveEdit\"]")
	WebElement Editsave;
	// button[@class="slds-button slds-button--neutral ok desktop uiButton--default
	// uiButton--brand uiButton"]
	@FindBy(xpath = "//div[@class=\"slds-align_absolute-center\"]//span[contains(text(),'Or drop files')]")
	WebElement Editfilesave;
	// span[@class="slds-file-selector__button slds-button slds-button_neutral" and
	// @part="button"]
	@FindBy(xpath = "//div[@class='slds-align_absolute-center']//span[contains(text(),'Or drop files')]")
	WebElement uploadfilefromeditlead;

	// button[@class="slds-button slds-button--neutral ok desktop uiButton--default
	// uiButton--brand uiButton"]
	@FindBy(xpath = "//div[@class='modal-footer slds-modal__footer']//span[contains(text(),'Done')]")
	WebElement saved;

	// (//div[@class="form-element"])//a[@class="datePicker-openIcon display"]
	@FindBy(xpath = "(//div[@class='form-element'])//a[@class='datePicker-openIcon display']")
	WebElement clickoncalender;

	@FindBy(xpath = "(//a[@title='Go to previous month' ])//span[contains(text(),'Go to previous month')]")
	WebElement premonthselect;

	// *[@class="monthYear"]
	@FindBy(xpath = "//*[@class='monthYear']")
	WebElement mothselect;
	// select[@class="slds-select picklist__label"]
	@FindBy(xpath = "//select[@class='slds-select picklist__label']")
	WebElement yearselect;
	// span[@class="slds-day weekday todayDate selectedDate DESKTOP
	// uiDayInMonthCell--default"]

	@FindBy(xpath = "//td[@class='uiDayInMonthCell']/span[contains(text(),'2')]")
	WebElement dateselect;

//3.create method to operations
	public void updateleadbf() throws Exception {

	
		Wrappers.clickJS(clickmanageBFlead);
		Wrappers.clickJS(clickManageleads);
		Wrappers.clickJS(clickManageleads);
		Wrappers.clickJS(clickManageleadsview);
		Wrappers.windowhand();
		Thread.sleep(17000);
		Wrappers.executeScript("window.scrollTo(0, document.body.scrollHeight / 2)");
		Wrappers.clickJS(clickoneditcomp);
		//WaitForElement.visibilityOfElement(ldriver, clickoneditcomp, Duration.ofSeconds(5000));
		Editcopname.clear();
		WaitForElement.visibilityOfElement(ldriver, Editcopname, Duration.ofSeconds(5000));
		Editcopname.sendKeys(Wrappers.generateUniqueString());
		Editemail.clear();
		Editemail.sendKeys(Wrappers.generateUniqueString() + "@yopmail.com");
		Editfirstname.clear();
		Editfirstname.sendKeys(Wrappers.generateUniqueString() + "1");
		Editlastname.clear();
		Editlastname.sendKeys(Wrappers.generateUniqueString());
		Editbsphone.clear();
		Editbsphone.sendKeys("1234567898");
//    	Wrappers.clickJS(Editannualgross);
//    	Wrappers.clickJS(Editselectannualgross);
//    	Wrappers.selectcalenderdate();
//		Wrappers.clickJS(clickoncalender);
//		Wrappers.clickJS(premonthselect);
//		Wrappers.clickJS(yearselect);
//		Select selectyrs= new Select(yearselect);
//		selectyrs.selectByVisibleText("2023");
//		Wrappers.clickJS(dateselect);
		Wrappers.clickJS(Editsave);	

		Wrappers.uploadfrombottom("window.scrollTo(0, document.body.scrollHeight)");
		FileUploadUsingRobot obje = new FileUploadUsingRobot();
		String fileP = "D:\\pdf test3.pdf";
		obje.robotfileupload(uploadfilefromeditlead, fileP);
		Thread.sleep(15000);
		Wrappers.clickJS(saved);
		Assert.assertTrue(saved.isEnabled(), "Element is not clickable.");
		// Wrappers.clickJS(saved);
		System.out.println("Lead updated sucessfully");

	}

}
