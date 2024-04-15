package rok.qaPageObject;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Wrapper.ClickButton;

public class Create_lead_from_salesforce_end {
	private static final String SHEET_NAME = "LoginSF1";
	public WebDriver ldriver;
	
	public Create_lead_from_salesforce_end(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

	// 2.identify WebElement
	@FindBy(xpath = "//input[@type='email']")
	WebElement sfemail;
	@FindBy(xpath = "//input[@type='password']")
	WebElement sfpassword;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement sfsubit;
	@FindBy(xpath = "//a[@class='slds-context-bar__label-action dndItem']//span[contains(text(),'Leads')]")
	WebElement ClickonLead;
	@FindBy(xpath = "//li[@class='slds-button slds-button--neutral']//div[contains(text(),'New')]")
	WebElement clickonnew;
	@FindBy(xpath = "//div[@class='forceChangeRecordTypeFooter']//span[contains(text(),'Next')]")
	WebElement clickonnex;
	@FindBy(xpath = "//input[@name='Company']")
	WebElement entercmp;
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement enter1stname;
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement enterlastname;
	@FindBy(xpath = "//input[@name='Email']")
	WebElement enteremailid;
	@FindBy(xpath = "//input[@name='MobilePhone']")
	WebElement entermobileno;
	@FindBy(xpath = "//span[contains(text(),'720+')]")
	WebElement selectscore;
	@FindBy(xpath = "//button[@class=\"slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value\"and@aria-label=\"Credit Score Range (Form) - Current Selection: --None--\"]")
	WebElement clcioncridit;
	@FindBy(xpath = "(//input[@placeholder='Search Accounts...'])[1]")
	WebElement selectRP;
	@FindBy(xpath = "//div[@class='center-align-buttons']//button[@name='SaveEdit']")
	WebElement clickonsave;
	@FindBy(xpath = "//li[@title='Form/Files']")
	WebElement clickonfiles;
	@FindBy(xpath = "//div[@class='slds-align_absolute-center cShowAllfiles']//div[@part='file-selector']")
	WebElement clickonuploadfiles;
	@FindBy(xpath = "//div[@class='modal-footer slds-modal__footer']//span[contains(text(),'Done')]	")
	WebElement clickonsavefiles;
	@FindBy(xpath = "//*[contains(text(),'roktesingRP')]")
	WebElement selectRPfromdp;
	@FindBy(xpath = "//a[@data-label='Notes']")
	WebElement clickonnotes;
	@FindBy(xpath = "(//div[@class='container forceRelatedListSingleContainer']//a[@role='button'])[2]")
	WebElement clickonnotesdrop;
	@FindBy(xpath = "//a[@data-target-selection-name='sfdc:StandardButton.AttachedContentNote.NewNote']")
	WebElement clickonnotesnew;
	@FindBy(xpath = "//input[@placeholder='Untitled Note']")
	WebElement clickonnotestitle;
	@FindBy(xpath = "//div[@aria-label='Compose text']//p")
	WebElement clickonnotesdscrip;
	@FindBy(xpath = "//button[contains(text(),'Done')]")
	WebElement clickonnotesdone;
	@FindBy(xpath = "//slot[@class='slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp']/lightning-formatted-name")
	WebElement title;

	public void createleadfromSF() throws InterruptedException, AWTException, IOException {
		        
	        
		ClickButton.clickon(ClickonLead);
		ClickButton.clickon(clickonnew);
		ClickButton.clickon(clickonnex);
		entercmp.sendKeys("roktest123");
	//	SendKeys.sendKeysToElement(entercmp, sfurl);
//		SendKeys.sendKeysToElement(enter1stname, Wrappers.generateUniqueString());
//		//enter1stname.sendKeys(Wrappers.generateUniqueString());
//		enterlastname.sendKeys("finance2");
//		enteremailid.sendKeys(Wrappers.generateUniqueString() + "@yopmail.com");
//		entermobileno.sendKeys("1234567890");
//		ClickButton.clickon(clcioncridit);
//		selectRP.sendKeys("roktestingRP");
//
//		Thread.sleep(5000);
//		ClickButton.clickon(selectRPfromdp);
//		ClickButton.clickon(selectscore);
//		ClickButton.clickon(clickonsave);
//		Thread.sleep(8000);
//		ClickButton.clickon(clickonfiles);
//		Thread.sleep(8000);
//		FileUploadUsingRobot obje = new FileUploadUsingRobot();
//		String fileP = "D:\\pdf test3.pdf";
//		obje.robotfileupload(clickonuploadfiles, fileP);
//		Thread.sleep(10000);
//		ClickButton.clickon(clickonsavefiles);
//		Thread.sleep(5000);
//		ClickButton.clickon(clickonnotes);
//		Thread.sleep(5000);
//		ClickButton.clickon(clickonnotesdrop);
//		Thread.sleep(5000);
//		ClickButton.clickon(clickonnotesnew);
//		Thread.sleep(6000);
//		clickonnotesdscrip.sendKeys(Wrappers.generateUniqueString());
//		Thread.sleep(6000);
//		clickonnotestitle.sendKeys(Wrappers.generateUniqueString());
//		ClickButton.clickon(clickonnotesdone);
//		Thread.sleep(6000);
//		titlesave = title.getText();
//		System.out.println(titlesave);
//
//	}
//	public void getdata() {
//
//		Wrappers.clickJS(ClickonLead);
//		//List<WebElement> tabledata=ldriver.findElements(By.xpath("//*[@id='brandBand_1']/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr/td[3]/span/span"));
//
//		List<WebElement> tabledata=ldriver.findElements(By.xpath("//div[@id='brandBand_1']//a[@data-refid='recordId']"));
//
//		System.out.println(tabledata.size());
//		for(WebElement clickonwebelement :tabledata) {
//			System.out.println(clickonwebelement.getText());
//			String savedata=clickonwebelement.getText();
//
//			if(savedata.equalsIgnoreCase("Test_04_15_46_22_2024 finance2")){
//
//				clickonwebelement.click();
//
//			}
//			else {
//				System.out.println("Not Match");
//			}
//		}
//
//	}
//
//	private void click() {
//		// TODO Auto-generated method stub
//
//	}

}}
