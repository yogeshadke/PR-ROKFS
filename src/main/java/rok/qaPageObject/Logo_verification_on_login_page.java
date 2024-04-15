package rok.qaPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Wrapper.WaitForElement;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Logo_verification_on_login_page {

	WebDriver ldriver;

	public Logo_verification_on_login_page(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//img[@id= 'logo']")
	WebElement logoElement;
	// a[@id="forgot_password_link"]

	@FindBy(xpath = "//a[@id='forgot_password_link']")
	WebElement forgotpassword;

	public void LogoVerification() throws MalformedURLException, IOException {

		if (logoElement.isDisplayed()) {
			System.out.println("Logo Is Present.");
		} else {
			System.out.println("Logo verification failed.");
		}

	}

	public void forgotpasswordlinkverification() {

		WaitForElement.visibilityOfElement(ldriver, forgotpassword, Duration.ofSeconds(5000));
		Assert.assertEquals(forgotpassword.getText(), "Forgot Your Password?");

	}
}
