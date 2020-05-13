package demo.PracticeProject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumInterviewPreparation {
	WebDriver driver;
	
	@BeforeMethod
	public void BrowserInitialization() {
	System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/test/guru99home/");
	}
	
	@Test
	public void switchtoiFrame() throws InterruptedException {
		int numiFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of iFrames here = " + numiFrames);
		
		String iframeName0 = driver.switchTo().frame(0).getTitle();
		Thread.sleep(6000);
		System.out.println("Name of iFrame0 is == " + iframeName0);
		
	}
	
	@Test
	public void javaScriptExecutor() throws InterruptedException {
	JavascriptExecutor js =	(JavascriptExecutor)driver;
	js.executeScript("alert('Welcome TO Selenium Automation'); ");
	Thread.sleep(10000);
	}
	
	@AfterMethod
	public void closeBrowsers() {
		driver.quit();
	}
}

