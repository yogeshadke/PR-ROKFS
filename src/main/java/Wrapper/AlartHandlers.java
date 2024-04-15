package Wrapper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class AlartHandlers {
	private WebDriver driver;

    public void PopupHandlerWrapper(WebDriver driver) {
        this.driver = driver;
    }

    // Method to check if an alert is present
    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    // Method to accept (OK) an alert
    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    // Method to dismiss (cancel) an alert
    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    // Method to get the text of an alert
    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    // Method to enter text into a prompt (input) box in an alert
    public void sendKeysToPrompt(String inputText) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(inputText);
        alert.accept();
    }
}


