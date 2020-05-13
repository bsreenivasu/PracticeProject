package demo.PracticeProject;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {

	public void mousehover() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://artoftesting.com/mouse-hover-in-selenium-webdriver-java#");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"menu-item-98\"]/a"));
		Actions mouseAction = new Actions(driver);
		mouseAction.moveToElement(menu).build().perform();
		
		
	}
	
	public void hashMapExam() {
		
		HashMap <Integer,String> hashmap = new HashMap <Integer,String>();
		hashmap.put(1, "one");
		hashmap.put(2, "Two");
		hashmap.put(3, "Three");
		
		System.out.println(hashmap.get(2));
		for (int i : hashmap.keySet()) {
			System.out.println(i);
		}
		for (String i : hashmap.values()) {
			System.out.println(i);
		}
		
		for (int i : hashmap.keySet()) {
			System.out.println("Keys " +i+ "Values " +(hashmap.get(i)) );
		}
		
	}
	public static void main(String[] args) {
		demo1 demo = new demo1();
//		demo.mousehover();
		demo.hashMapExam();

	}

}
