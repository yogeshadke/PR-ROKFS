package rok.qaPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Wrapper.ClickButton;
import Wrapper.SendKeys;
import rok.qa.Utilities.Wrappers;

public class Community_Login {
	WebDriver ldriver;

	public Community_Login(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	// 2.identify WebElement

	@FindBy(id = "username")
	WebElement username1;
	@FindBy(id = "password")
	WebElement password1;
	@FindBy(id = "Login")
	WebElement Login;
	@FindBy(xpath = "//span[@class=' profileName']")
	WebElement Profile;
	@FindBy(xpath = "//a[contains(text(),'My Profile')]")
	WebElement MyProfile;
	@FindBy(xpath = "//a[@class='emailuiFormattedEmail']")
	WebElement CopyEmail;
	@FindBy(xpath = "//a[@data-type='home']")
	WebElement Home;

	// 3.identify action on webElement

	public void logintocommunity(String usernamecd, String passwordcd) throws InterruptedException {
		username1.sendKeys(usernamecd);
		SendKeys.sendKeysToElement(username1, usernamecd);
		password1.sendKeys(passwordcd);
		Login.click();
		ClickButton.clickon(Profile);
		ClickButton.clickon(MyProfile);
		Assert.assertEquals(CopyEmail.getText(), usernamecd);
		ClickButton.clickon(Home);
		System.out.println("Login With Valid User");




	}

}
