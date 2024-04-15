package rok.qa.Testcases;

import org.testng.annotations.Test;




import com.github.dockerjava.api.model.Driver;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Add_business_Financing_lead_From_Landing_Page;
import rok.qaPageObject.Community_Login;

public class Verify_add_business_Financing_lead_From_Landing_Page_09 extends BaseClass {
	@Test(priority = 3)
	public void Add_business_financing_lead_From_landing_page() throws InterruptedException {
		// openUrl
		driver.get(url);
		Community_Login pg = new Community_Login(driver);
		pg.logintocommunity(username, password);
		Thread.sleep(5000);
		Add_business_Financing_lead_From_Landing_Page BFlead = new Add_business_Financing_lead_From_Landing_Page(driver);
		BFlead.landingpageleads();
	}
}
