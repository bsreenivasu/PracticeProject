package demo.PracticeProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OtherPractice {
	public WebDriver driver;
	Logger log = Logger.getLogger(OtherPractice.class);
	public ExtentHtmlReporter reporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	@Test (dataProvider = "logins")
	public void loginPage(String username, String password, Object status) throws InterruptedException {
		reporter = new ExtentHtmlReporter("C:\\Users\\sreen\\eclipse-workspace\\PracticeProject\\ExtentReports\\ProjectReport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		logger = extent.createTest("loginPage");
		
		System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
  	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com");
		log.info("info -- web url launched ");
		log.debug("debug -- web url launched");
		log.error("error -- web url launhed");
		logger.log(Status.INFO, "User Login Test trying..............");
		driver.findElement(By.cssSelector("a[href*='sign_in']")).click();
		
		driver.findElement(By.id("user_email")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[name='commit']")).click();
		logger.log(Status.PASS, "User Login Tested");
		log.info("info -- username password entere");
		log.debug("debug --  username password entered");
		log.error("error -- username password entered");
		
		Thread.sleep(10000);
		
		driver.close();
		extent.flush();
	}
	
	@DataProvider(name = "logins")
	public Object[][] getUserLogins() {
		return new Object[][] {{"bsreenivasu@gmail.com","sreedevi@153","nonRestrictedUser"} , {"suresh@yahoo.com","abcd123","RestrictedUser"} , {"sreedevi@gmail.com","xya","RestrictedUser"} };
	}
	
}
		
	




		
	
