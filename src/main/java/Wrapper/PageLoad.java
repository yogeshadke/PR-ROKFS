package Wrapper;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import rok.qa.Utilities.BaseClass;

public class PageLoad extends BaseClass {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Duration timeout;

	public static void setDriver(WebDriver webDriver) {
		driver = webDriver; // Set the driver instance
	}

	public static void waitForPageToLoad() {
		if (driver == null) {
			throw new IllegalArgumentException("Input driver must be set before waiting for the page to load");
		}

		timeout = Duration.ofSeconds(15);
		wait = new WebDriverWait(driver, timeout);
		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
				.equals("complete"));
	}
}
