package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.pages.MyntraPages;

public class MyntraBase {
	
	WebDriver driver;
	
	
	
	@BeforeClass
	public void setUp() {
		 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\balaj\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			
			driver.get("https://www.myntra.com/");
			  }
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
