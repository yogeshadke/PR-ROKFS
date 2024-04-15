package rok.qa.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadUtils {

    public static void waitForPageLoad(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Wait for the document to be ready
        js.executeScript("return document.readyState").toString().equals("complete");

        // Wait for jQuery to be active, if used on the page
        js.executeScript("return jQuery.active == 0");

        // Wait for Angular to be finished, if used on the page
        js.executeScript("return angular.element(document).injector().get('$http').pendingRequests.length === 0");
    }
    
    
}
