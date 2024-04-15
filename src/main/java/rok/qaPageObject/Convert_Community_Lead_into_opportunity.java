package rok.qaPageObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.reactivex.rxjava3.functions.Action;
import rok.qa.Utilities.Wrappers;

public class Convert_Community_Lead_into_opportunity {
	public WebDriver ldriver;
	WebDriverWait wait;
	String savetext;
	
	public Convert_Community_Lead_into_opportunity(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// 2.identify WebElement
	@FindBy(xpath = "//button[contains(text(),'Manage Deals')]")
	WebElement clickmanageBFlead;
	@FindBy(xpath = "//span[.='Manage Leads']")
	WebElement clickManageleads;
	@FindBy(xpath = "(//a[contains(text(),'View')])[1]")
	WebElement clickManageleadsview;
	
	//td[@data-col-key-value="FirstName-text-4"]
	@FindBy(xpath = "//td[@data-col-key-value='FirstName-text-4']")
	WebElement gettext1;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement sfemail;
	@FindBy(xpath = "//input[@type='password']")
	WebElement sfpassword;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement sfsubit;
	//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']
	@FindBy(xpath = "//input[@type='search' and @placeholder='Search...']")
	WebElement searchop;
	@FindBy(xpath = "//a[@class='slds-context-bar__label-action dndItem']//span[contains(text(),'Leads')]")
	WebElement clickonopps;	
	@FindBy(xpath = "//button[@aria-label='Search']")
	WebElement clickosrch;
	@FindBy(xpath = "(//input[@class='slds-input' and @part='input'])[2]")
	WebElement oppssearch;	
    @FindBy(xpath = "(//div[@class='instant-results-list']//span[@part='formatted-rich-text'])[3]")
	WebElement selectopt1;
    
  //span[contains(text(),'Change Owner')]
    @FindBy(xpath = "//span[contains(text(),'Change Owner')]")
   	WebElement changeowner;
    
  //input[@title="Search Users"]
    @FindBy(xpath = "//input[@title='Search Users']")
   	WebElement searcheuser;
    
   
     @FindBy(xpath = "(//div[@class='primaryLabel slds-truncate slds-lookup__result-text'])[1]")
    WebElement changeuserselect;		
    		
   //button[@name="change owner"]	
     
     @FindBy(xpath = "//div[@class='modal-footer slds-modal__footer']//button[@name='change owner']")
     WebElement changeownersave;
    		
    @FindBy(xpath = "//button[@name='Convert']")
   	WebElement convert;
    
  //button[@class="slds-button slds-button_brand"]
    @FindBy(xpath = "//div[@class='modal-footer slds-modal__footer']//button[contains(text(),'Convert')]")
   	WebElement convertconfirm;

	public void Convertleadtoopps() throws InterruptedException {
		
		Wrappers.clickJS(clickmanageBFlead);
		Thread.sleep(6000);
		Wrappers.clickJS(clickManageleads);
		String savetext =gettext1.getText();
		System.out.println(savetext);
		ldriver.switchTo().newWindow(WindowType.TAB);
	}
		public void ConvertleadtooppsinSF() throws InterruptedException {
			
     Wrappers.clickJS(clickonopps);       
     Thread.sleep(6000);
       Wrappers.clickJS(clickosrch);
       Thread.sleep(4000);
       oppssearch.sendKeys(savetext);
       Thread.sleep(4000);
       Wrappers.clickJS(selectopt1);
       Wrappers.clickJS(changeowner);
       searcheuser.sendKeys("Test");
       Thread.sleep(6000);
       Wrappers.clickJS(changeuserselect);
       Wrappers.clickJS(changeownersave);
       Thread.sleep(10000);
      Wrappers.clickJS(convert);
      Thread.sleep(12000);
     Wrappers.clickJS(convertconfirm);
     Thread.sleep(6000);
     Wrappers.clickJS(convertconfirm);
		}     
     
    	  //oppssearch.sendKeys(savetext);
      
     
       
       //clickosrch.sendKeys(Keys.ENTER);


       
     
	
	
	 private String readUsernameFromFile(String filePath) throws IOException {
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            return reader.readLine();
	        }

	 }}
