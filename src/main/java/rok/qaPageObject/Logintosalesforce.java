package rok.qaPageObject;

import static org.testng.Assert.assertEquals;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Wrapper.Asert;
import Wrapper.ClickButton;
import Wrapper.Excelsheetread;
import Wrapper.SendKeys;
import Wrapper.WaitForElement;


public class Logintosalesforce {
	private static final String SHEET_NAME = "LoginSF1";
	WebDriver ldriver;

	public Logintosalesforce(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//input[@type='email']")
	WebElement sfemail;
	@FindBy(xpath = "//input[@type='password']")
	WebElement sfpassword;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement sfsubmit;

	public void sflogin() throws InterruptedException, IOException {

		Excelsheetread excelUtils = new Excelsheetread();
		excelUtils.excelsheetread();
		String sfurl = excelUtils.getSheet((String) SHEET_NAME).getRow(10).getCell(0).getStringCellValue();
		String username = excelUtils.getSheet((String) SHEET_NAME).getRow(10).getCell(1).getStringCellValue();
		String password = excelUtils.getSheet((String) SHEET_NAME).getRow(10).getCell(2).getStringCellValue();
        
		ldriver.get(sfurl);
		
		SendKeys.sendKeysToElement(sfemail, username);
		String actualuser = sfemail.getAttribute("value");
        String expecteduser = username;
        Asert.assertEquals(actualuser, expecteduser, "Verify username");
		SendKeys.sendKeysToElement(sfpassword, password);
		String actualpassword = sfpassword.getAttribute("value");;
        String expectedpassword = password;
        Asert.assertEquals(actualpassword, expectedpassword, "Verify password");
		ClickButton.clickon(sfsubmit);
		

	}

}
