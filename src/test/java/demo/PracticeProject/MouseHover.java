package demo.PracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	
	@Test(priority=1,enabled=false)
	public void Mouseover() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://artoftesting.com/mouse-hover-in-selenium-webdriver-java#");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement automation = driver.findElement(By.xpath("//nav[@id='site-navigation']//li[@id='menu-item-98']"));

		// //*[@id="menu-item-98"]/a/text()

		Actions action = new Actions(driver);

		action.moveToElement(automation).build().perform();

		driver.findElement(By.linkText("Selenium Tutorial")).click();
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test(priority=2)
	public void ExecuteAutomation() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://executeautomation.com/blog/mouse-hover-click-selenium/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement VideoSeries = driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Video Series')]"));
	//	WebElement VideoSeries = driver.findElement(By.xpath("//ul[@id='primary-menu']//a[contains(text(),'Video Series')]"));
		WebElement FreeCourses = driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'FREE Courses')]"));
		WebElement Selenium = driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Selenium Framework Development(Java)')]"));
	
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(VideoSeries).perform();
		Thread.sleep(2000);
		action.moveToElement(FreeCourses).perform();
		Thread.sleep(2000);
		action.moveToElement(Selenium).click().build().perform();
		
		Thread.sleep(5000);
		driver.close();

	}	

}



	
