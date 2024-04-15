package Wrapper;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import rok.qa.Utilities.BaseClass;

public class SendKeys extends BaseClass {
	public static WebDriverWait wait;
	public static WebDriverWait waitdriver;
	public static Duration timeoutSeconds;

    // Method to send keys to a WebElement
    public static void sendKeysToElement(WebElement element, String text) {
        try {
        	timeoutSeconds =Duration.ofSeconds(5000);
            WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);
            wait.until(ExpectedConditions.visibilityOf(element));
            element.clear();
            element.sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace(); // Handle or log the exception as needed
        }
    }
}


