package demo.PracticeProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
			driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy']")).click();
			Set<String> windows = driver.getWindowHandles();
			            Iterator<String> itr = windows.iterator();
			            String ParentWindow = itr.next();
			            System.out.println("Parent window ID is :: " + ParentWindow);
			            
			            String ChildWindow = itr.next();
			            System.out.println("Child Window ID is :: " + ChildWindow);
			            
			            Thread.sleep(2000);
			            driver.switchTo().window(ChildWindow);
			            System.out.println("Child window title ::" + driver.getTitle());
			            driver.close();
			            Thread.sleep(2000);
			            driver.switchTo().window(ParentWindow);
			            Thread.sleep(2000);
			            System.out.println("Parent window title :: " + driver.getTitle());
	}
			
	}


