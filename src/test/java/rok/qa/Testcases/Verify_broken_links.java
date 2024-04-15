package rok.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Brokenlinks;
import rok.qaPageObject.Logintosalesforce;

public class Verify_broken_links extends BaseClass {
	
	@Test
	
	public void testBrokenLinks() throws InterruptedException, IOException {
		
		Logintosalesforce loginSF = new Logintosalesforce(driver);
        loginSF.sflogin();
		Brokenlinks bklinks = new Brokenlinks(driver);
		bklinks.checkForBrokenLinks();
		
    }

}
