package demo;


	


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import rok.qa.Utilities.BaseClass;

import java.io.BufferedInputStream;
import java.io.File;
	import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

	public class PDFDownloadAndVerify  {
		String url ="https://morth.nic.in/sites/default/files/dd12-13_0.pdf";
		WebDriver driver;
		@BeforeTest
		public void pdfsetup() {
			driver=new ChromeDriver();
			driver.get(url);
		}
		
		@Test
		public void verifypdf() throws IOException {
			URL pdfURL =new URL(url);
			InputStream ip = pdfURL.openStream();
			BufferedInputStream bf =new BufferedInputStream(ip);
			PDDocument docpdf =PDDocument.load(bf);
			
			
			
			int pagecount= docpdf.getNumberOfPages();
			Assert.assertEquals(pagecount, 1);
			
			PDFTextStripper stp = new PDFTextStripper();
			String pdfdata = stp.getText(docpdf);
			Assert.assertTrue(pdfdata.contains("Dummy PDF file"));
					
		}	
		
	@AfterTest
	public void teardown() {
		driver.quit();
		
		
	}
	    
	}



