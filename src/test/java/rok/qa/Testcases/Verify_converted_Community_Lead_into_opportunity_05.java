package rok.qa.Testcases;

import org.openqa.selenium.WebElement;



import org.testng.annotations.Test;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Community_Login;
import rok.qaPageObject.Convert_Community_Lead_into_opportunity;
import rok.qaPageObject.Logintosalesforce;

public class Verify_converted_Community_Lead_into_opportunity_05 extends BaseClass {

	@Test(groups = { "group1" })
	public void Convert_community_lead_into_opportunity() throws Exception {
		// openUrl
		driver.get(url);
		//logger.info("Url opened");
		Thread.sleep(5000);

		Community_Login pg = new Community_Login(driver);
		pg.logintocommunity(username, password);
		Thread.sleep(8000);
		Convert_Community_Lead_into_opportunity crt = new Convert_Community_Lead_into_opportunity(driver);
		crt.Convertleadtoopps();
		Logintosalesforce loginSF = new Logintosalesforce(driver);
		loginSF.sflogin();
		Convert_Community_Lead_into_opportunity crt2 = new Convert_Community_Lead_into_opportunity(driver);
		crt2.ConvertleadtooppsinSF();

	}
}
