package rok.qa.Testcases;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Create_Opportunity_From_Salesforce;

public class Verify_created_Opportunity_From_Salesforce_13 extends BaseClass {

	public WebDriver ldriver;

	@Test(groups = { "group1" })
	public void Create_opportunity_from_salesforce() throws InterruptedException {
		// openUrl

		Create_Opportunity_From_Salesforce newleads1a = new Create_Opportunity_From_Salesforce(driver);
		newleads1a.SFlogin();
		newleads1a.Tocreateopportunity();
		newleads1a.addbankstatment();

	}

}
