package rok.qa.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameUtils {

    public static void switchToFrame(WebDriver driver, By frameLocator) {
        WebElement frameElement = driver.findElement(frameLocator);
        driver.switchTo().frame(frameElement);
    }
}
