package Wrapper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollDown {
	private WebDriver driver;

    public void ScrollWrapper(WebDriver driver) {
        this.driver = driver;
    }

    // Method to scroll halfway down the page
    public void scrollDownHalfway() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight/2)");
    }

    // Method to scroll to the bottom of the page
    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
	
