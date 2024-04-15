package rok.qa.Utilities;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;



import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class FileUploadUsingRobot {
	// public WebElement uploadfilefromeditlead;

	public void robotfileupload(WebElement uploadfilefromeditlead, String fileP) throws AWTException {
		Objects.requireNonNull(uploadfilefromeditlead, "WebElement must not be null");

		// Create Robot reference variable
		Robot robot = new Robot();

		// Create string variable
		StringSelection stringselect = new StringSelection(fileP);

		// Copy file from location
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);

		// Click on the upload button
		uploadfilefromeditlead.click();

		robot.delay(2000);

		// Copy and paste the file in the open window
		// Hold
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Release
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.delay(2000);

		// Double Click on open
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}