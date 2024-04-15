package Wrapper;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowsHandles {
	 private WebDriver driver;

	    public void WindowHandlerWrapper(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Method to get the current window handle
	    public String getCurrentWindowHandle() {
	        return driver.getWindowHandle();
	    }

	    // Method to get all window handles
	    public Set<String> getAllWindowHandles() {
	        return driver.getWindowHandles();
	    }

	    // Method to switch to a specific window using its handle
	    public void switchToWindow(String windowHandle) {
	        driver.switchTo().window(windowHandle);
	    }

	    // Method to switch to the most recently opened window
	    public void switchToNewWindow() {
	        Set<String> handles = driver.getWindowHandles();
	        for (String handle : handles) {
	            driver.switchTo().window(handle);
	        }
	    }

	    // Method to close the current window
	    public void closeCurrentWindow() {
	        driver.close();
	    }
	}


