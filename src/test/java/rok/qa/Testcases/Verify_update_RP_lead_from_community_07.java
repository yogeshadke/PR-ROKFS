package rok.qa.Testcases;

import java.awt.AWTException;


import org.testng.annotations.Test;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Community_Login;
import rok.qaPageObject.Update_BF_lead_from_community;
import rok.qaPageObject.Update_RP_lead_from_community;

public class Verify_update_RP_lead_from_community_07 extends BaseClass {
	@Test(priority = 6)
	public void Update_Rp_lead_from_community() throws InterruptedException, AWTException {
		// openUrl
		driver.get(url);
		//logger.info("Url opened");
		Thread.sleep(5000);
		Community_Login pg = new Community_Login(driver);
		pg.logintocommunity(username, password);
		Thread.sleep(5000);
		Update_RP_lead_from_community updateRPleads = new Update_RP_lead_from_community(driver);
		updateRPleads.updateleadRPm();
	}
}
