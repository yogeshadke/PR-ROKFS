package demo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import rok.qa.Utilities.BaseClass;

import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SaveTextToFile {
	public static void main(String[] args) throws IOException {
		// Setup WebDriverManager for managing WebDriver binaries
		WebDriverManager.chromedriver().setup();

		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the webpage
		driver.get("https://www.google.com/");

		// Locate elements and extract text
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='SIvCob']"));

// Create a StringBuilder to store the text
		
		StringBuilder textToSave = new StringBuilder();
		for (WebElement element : elements) {
			textToSave.append(element.getText()).append("\n");
		}
		// Specify the file path
		String filePath = "D:\\Yogesh doc\\ROk-QA-Project-master\\ROk-QA-Project-master\\src\\main\\java\\demo\\Datastore\\store data.txt";
		// Write text to the file
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			writer.write(textToSave.toString());
			System.out.println("Text has been saved to the file successfully.");
		} catch (IOException e) {
			System.err.println("Error writing to the file: " + e.getMessage());
		}

// Create a collection to store the data. Read data from file 
		
		List<String> collectedData = new ArrayList<>();
		// Read data from a file and store it in the collection
		try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Yogesh doc\\ROk-QA-Project-master\\ROk-QA-Project-master\\src\\main\\java\\demo\\Datastore\\store data.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				collectedData.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Print the collected data
		for (String data : collectedData) {
			System.out.println("Collected Data: " + data);
			Assert.assertEquals(textToSave, data, "not match");
			System.out.println("Expected is equal actual");
		}

	}

}
