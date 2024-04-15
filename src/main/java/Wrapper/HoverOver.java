package Wrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {
	
	private WebDriver driver;
    private Actions actions;

    public void HoverOverWrapper(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    // Method to perform a hover-over action on a WebElement
    public void hoverOverElement(WebElement element) {
        actions.moveToElement(element).perform();
    }

    // Method to perform a hover-over action on an element identified by its locator
    public void hoverOverElement(By locator) {
        WebElement element = driver.findElement(locator);
        hoverOverElement(element);
    }

}
