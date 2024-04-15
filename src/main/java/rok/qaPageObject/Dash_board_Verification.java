package rok.qaPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Dash_board_Verification {
	WebDriver ldriver;

	public Dash_board_Verification(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//a[@class='cBrandingLogo']")
	WebElement dashboardlogo;

//span[@class=" profileName"]

	public void dashboardverify() {

		Assert.assertTrue(dashboardlogo.isDisplayed(), "Logo is not present");

	}

}
