package coms;

import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver  driver;
	@BeforeClass
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	

		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		
	}
		
	
	@AfterClass
	public void closeApplication() {
		// driver.quit();
	}

}

