package Wrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	
	 private WebDriver driver;

	    public void DropdownWrapper(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Method to select dropdown option by visible text
	    public void selectByVisibleText(By dropdownLocator, String visibleText) {
	        WebElement dropdown = driver.findElement(dropdownLocator);
	        Select select = new Select(dropdown);
	        select.selectByVisibleText(visibleText);
	    }

	    // Method to select dropdown option by value
	    public void selectByValue(By dropdownLocator, String value) {
	        WebElement dropdown = driver.findElement(dropdownLocator);
	        Select select = new Select(dropdown);
	        select.selectByValue(value);
	    }

	    // Method to select dropdown option by index
	    public void selectByIndex(By dropdownLocator, int index) {
	        WebElement dropdown = driver.findElement(dropdownLocator);
	        Select select = new Select(dropdown);
	        select.selectByIndex(index);
	    }
	}


