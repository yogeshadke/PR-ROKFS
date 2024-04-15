package rok.qaPageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rok.qa.Utilities.BaseClass;

public class Brokenlinks  {
	
	
	

	   public WebDriver driver;

	    public Brokenlinks(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void checkForBrokenLinks() {
	        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

	        for (WebElement link : allLinks) {
	            String url = link.getAttribute("href");
	            if (url != null && !url.isEmpty()) {
	                int responseCode = getHttpResponseCode(url);
	                if (responseCode != 200) {
	                    System.out.println("Broken Link: " + url + " - Response Code: " + responseCode);
	                    // You can take further actions here, such as logging or reporting
	                }
	            }
	        }
	    }

	    public int getHttpResponseCode(String urlString) {
	        // Implement code to get HTTP response code for the given URL
	        // You can use HttpURLConnection or any other library of your choice

	        // For simplicity, let's assume a hypothetical method
	        // return HTTPResponseCodeChecker.getResponseCode(urlString);

	        return -1; // Replace this with actual implementation
	    }
	}



