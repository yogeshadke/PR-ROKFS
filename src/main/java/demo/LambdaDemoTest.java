package demo;

import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LambdaDemoTest {

	public static void main(String[] args) throws Exception {
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("122.0");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "yogeshadke24");
		ltOptions.put("accessKey", "z1X4peHZ569ffrZTqF4bvdO6zBp7CJ0uPDIGWQlLejy4m7Dv56");
		ltOptions.put("project", "Untitled");
		ltOptions.put("selenium_version", "4.0.0");
		ltOptions.put("w3c", true);
		browserOptions.setCapability("LT:Options", ltOptions);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
        driver.findElement(By.id("APjFqb")).sendKeys("Automation");
    }
}
