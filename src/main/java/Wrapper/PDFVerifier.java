package Wrapper;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import rok.qa.Utilities.BaseClass;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class PDFVerifier extends BaseClass {

    private WebDriver driver;
    
    String url="https://morth.nic.in/sites/default/files/dd12-13_0.pdf";
    
    int expectedPageCount =1;
    
    String expectedContent="Dummy PDF file";
    
    
    public PDFVerifier(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyPDF(String url, int expectedPageCount, String expectedContent) throws IOException {
        driver.get(url);

        try (InputStream inputStream = new URL(url).openStream();
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
             PDDocument document = PDDocument.load(bufferedInputStream)) {

            int pageCount = document.getNumberOfPages();
            Assert.assertEquals(pageCount, expectedPageCount);

            PDFTextStripper stripper = new PDFTextStripper();
            String pdfData = stripper.getText(document);
            Assert.assertTrue(pdfData.contains(expectedContent));
        }
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
