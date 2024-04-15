package Wrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import rok.qa.Utilities.BaseClass;

public class CheckboxCheck extends BaseClass {
	private WebDriver driver;

    public void CheckboxWrapper(WebDriver driver) {
        this.driver = driver;
    }

    // Method to check a checkbox by its locator
    public void checkCheckbox(By checkboxLocator) {
        WebElement checkbox = driver.findElement(checkboxLocator);

        // Check the checkbox only if it is not already checked
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    // Method to uncheck a checkbox by its locator
    public void uncheckCheckbox(By checkboxLocator) {
        WebElement checkbox = driver.findElement(checkboxLocator);

        // Uncheck the checkbox only if it is checked
        if (checkbox.isSelected()) {
            checkbox.click();
        }
}
}