package rok.qa.Testcases;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;



import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Community_Login;



public class Verify_community_Login_02 extends BaseClass {

	@Test
	public void VerfyLogin() throws InterruptedException {

		driver.get(url);
		Community_Login community_login = new Community_Login(driver);
		community_login.logintocommunity(username, password);


	}
}