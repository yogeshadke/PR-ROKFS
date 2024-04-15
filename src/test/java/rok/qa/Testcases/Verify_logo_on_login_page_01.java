package rok.qa.Testcases;

import java.io.IOException;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Logo_verification_on_login_page;

public class Verify_logo_on_login_page_01 extends BaseClass {

	@Test
	public void VerfyLogo() throws InterruptedException, MalformedURLException, IOException {
		// openUrl
		driver.get(url);

		//logger.info("Url opened");
		Logo_verification_on_login_page logo = new Logo_verification_on_login_page(driver);
		logo.LogoVerification();
		logo.forgotpasswordlinkverification();

	}

}
