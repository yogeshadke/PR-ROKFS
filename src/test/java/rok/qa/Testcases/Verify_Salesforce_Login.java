package rok.qa.Testcases;

import java.io.IOException;
import org.testng.annotations.*;
import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Logintosalesforce;

public class Verify_Salesforce_Login extends BaseClass {
	String sfurl;

	@Test
	public void VerfysalesforceLogin() throws InterruptedException, IOException {

		Logintosalesforce loginSF = new Logintosalesforce(driver);
		loginSF.sflogin();

	}
}