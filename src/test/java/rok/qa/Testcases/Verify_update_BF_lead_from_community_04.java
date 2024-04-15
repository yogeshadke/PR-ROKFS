package rok.qa.Testcases;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import rok.qa.Utilities.BaseClass;
import rok.qa.Utilities.FileUploadUsingRobot;
import rok.qa.Utilities.Wrappers;
import rok.qaPageObject.Community_Login;
import rok.qaPageObject.Update_BF_lead_from_community;

public class Verify_update_BF_lead_from_community_04 extends BaseClass {
	WebElement uploadfilefromeditlead;

	@Test(groups = { "smoke" })
	public void Update_BF_lead_from_community() throws Exception {
		// openUrl

		driver.get(url);
		//logger.info("Url opened");
		Community_Login pg = new Community_Login(driver);
		pg.logintocommunity(username, password);
		Update_BF_lead_from_community updateRPleads = new Update_BF_lead_from_community(driver);
		updateRPleads.updateleadbf();

//		

	}

}
