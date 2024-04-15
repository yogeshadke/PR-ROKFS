package rok.qa.Testcases;

import org.testng.annotations.Test;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Community_Login;
import rok.qaPageObject.Convert_Lead_into_account;

public class Verify_convert_lead_into_account_08 extends BaseClass {
	@Test(priority = 1,groups = {"smoke"})
	public void Convert_lead_into_account() throws Exception {
		// openUrl
		driver.get(url);
		//logger.info("Url opened");
		Thread.sleep(5000);

		Community_Login pg = new Community_Login(driver);
		pg.logintocommunity(username, password);
		Thread.sleep(8000);
		Convert_Lead_into_account crt = new Convert_Lead_into_account(driver);
		crt.Convertleadtoaccount();

	}

}
