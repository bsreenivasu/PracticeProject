package demo.PracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropDown {

	@Test
	public void DropDwon() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(country);
		select.selectByValue("INDIA");
	
		Thread.sleep(5000);
		driver.close();

	}

	@Test
		public void QaclickAcademyDropdown() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement dropDownList = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Thread.sleep(5000);
		Select select = new Select(dropDownList);

		select.selectByValue("option2");

		Thread.sleep(5000);
	//	driver.close();

	}
		
}
