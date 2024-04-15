package Wrapper;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import rok.qa.Utilities.BaseClass;




public class ClickButton extends BaseClass {

	public static WebDriverWait wait;
	public static Duration timeout;
	public static JavascriptExecutor executor;

	public static void clickon(WebElement element) {
		
		wait = new WebDriverWait(driver, timeout);
		timeout = Duration.ofSeconds(5000);
		executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",element);
	}
}
		
	