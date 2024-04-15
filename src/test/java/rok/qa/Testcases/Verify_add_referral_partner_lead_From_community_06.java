package rok.qa.Testcases;

import org.testng.annotations.Test;

import rok.qaPageObject.Add_referral_partner_lead_From_community;
import rok.qaPageObject.Community_Login;

public class Verify_add_referral_partner_lead_From_community_06 extends rok.qa.Utilities.BaseClass {
	@Test(priority = 1,groups = {"smoke"})
	public void Add_Referral_Partner_lead_From_community() throws InterruptedException {
		// openUrl
		driver.get(url);
		//logger.info("Url opened");
		Thread.sleep(5000);
		Community_Login pg = new Community_Login(driver);
		pg.logintocommunity(username, password);
		Thread.sleep(5000);
		Add_referral_partner_lead_From_community RPlead = new Add_referral_partner_lead_From_community(driver);
		Thread.sleep(5000);
		RPlead.RPleadfromportal();
	}

}
