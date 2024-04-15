package rok.qa.Testcases;

import org.testng.annotations.Test;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Add_referral_partner_lead_from_landing_page;
import rok.qaPageObject.Community_Login;

public class Verify_add_referral_partner_lead_from_landing_page_10 extends BaseClass {
	@Test(priority = 4)
	public void Add_referral_partner_lead_from_landing_Page() throws InterruptedException {
		// openUrl
		driver.get(url);
		//logger.info("Url opened");
		Thread.sleep(5000);
		Community_Login pg = new Community_Login(driver);
		pg.logintocommunity(username, password);
		Thread.sleep(5000);
		Add_referral_partner_lead_from_landing_page ldRP = new Add_referral_partner_lead_from_landing_page(driver);
		ldRP.RPlndlead();
	}

}
