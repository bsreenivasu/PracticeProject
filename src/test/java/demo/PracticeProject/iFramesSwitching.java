package demo.PracticeProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Multiset.Entry;

public class iFramesSwitching {
	
	// iFrames 
	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/guru99home/");
	int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println("Number of frames :: "+ size);
	Thread.sleep(5000);
	String framename0 = driver.switchTo().frame("flow_close_btn_iframe").getWindowHandle();
	System.out.println(framename0);

	Thread.sleep(5000);
	String framename1 = driver.switchTo().frame(1).getWindowHandle();
		System.out.println(framename1);

	}

	}
	
		
	
