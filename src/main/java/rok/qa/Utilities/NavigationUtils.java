package rok.qa.Utilities;


	import org.openqa.selenium.WebDriver;

	public class NavigationUtils {

	    public static void openURL(WebDriver driver, String url) {
	        driver.get(url);
	    }
	    
	    public static void navigateBack(WebDriver driver) {
	        driver.navigate().back();
	    }
	    
	    public static void navigateForward(WebDriver driver) {
	        driver.navigate().forward();
	    }
	    
	    public static void refreshPage(WebDriver driver) {
	        driver.navigate().refresh();
	    }
	    
	    public static void closeBrowser(WebDriver driver) {
	        driver.quit();
	    }
	}



