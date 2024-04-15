package rok.qa.Utilities;

import java.awt.Robot;




import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;




public class Wrappers extends BaseClass {

	public static WebDriverWait wait;
	public static WebDriverWait waitdriver;
	public static Duration timeoutSeconds;
	public static JavascriptExecutor executor;

	public static void clickJS(WebElement element) {
		executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public static void executeScript(String string) {
		// TODO Auto-generated method stub
		executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight / 2)");
	}

	public static void windowhand() {
		Set<String> handle = driver.getWindowHandles();

		// Check if there are at least two window handles
		if (handle.size() < 2) {
			System.out.println("Not enough window handles");
			return;
		}

		java.util.Iterator<String> it = handle.iterator();
		String parentid = (String) it.next();
		String childid = (String) it.next();

		// Switch to the child window
		driver.switchTo().window(childid);
	}

	public static void windowhand2() {
		Set<String> handle1 = driver.getWindowHandles();

		// Check if there are at least two window handles
		if (handle1.size() < 2) {
			System.out.println("Not enough window handles");
			return;
		}

		java.util.Iterator<String> it = handle1.iterator();
		String parentid1 = (String) it.next();
		String childid1 = (String) it.next();

		// Switch to the child window
		driver.switchTo().window(childid1);
	}

	public static void uploadfrombottom(String string) {
		// TODO Auto-generated method stub
		JavascriptExecutor scrolldown = (JavascriptExecutor) driver;
		scrolldown.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

	public static void selectcalenderdate() {

		JavascriptExecutor clddate = (JavascriptExecutor) driver;
		clddate.executeScript("document.getElementsByClassName('datePicker-openIcon display')[1].value='03/12/2022';");
		// lddate.executeScript("document.getElementsByClassName('datePicker-openIcon
		// display')[1],value='03/12/2022'");
		// clddate.executeScript("arguments[0].click();", element);
	}

	public static String generateUniqueString() {
		// Get current date and time
		Date now = new Date();

		// Format the date and time
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh_mm_ss_dd_yyyy");
		String formattedDate = dateFormat.format(now);

		// Create the unique string
		String uniqueString = "Test_" + formattedDate;
		return uniqueString;
	}

	public static void reachtouplosdfile(String string) {
		// TODO Auto-generated method stub
		JavascriptExecutor scrolldown = (JavascriptExecutor) driver;
		scrolldown.executeScript("window.scrollTo(0, 500)");

	}

	public static void fluentwait() {
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofMinutes(1));
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.ignoring(NoSuchElementException.class);
	
	}
	public static void clickingonelement(WebElement element, long waitTimeInSeconds) {
		WebDriverWait waitdriver = new WebDriverWait(driver,Duration.ofSeconds(waitTimeInSeconds));
		WebElement element1= null;
		element1=wait.until(ExpectedConditions.elementToBeClickable(element1));
		element1.click();
		 
		
		
	}
}
	
	 

		
	


