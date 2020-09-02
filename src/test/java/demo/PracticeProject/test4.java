package demo.PracticeProject;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.mongodb.MapReduceCommand.OutputType;

public class test4 {

	private static final org.openqa.selenium.OutputType OutputFile = null;

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		
		driver.switchTo().frame(0);
		
		
		driver.switchTo().frame("nameofFrame");
		driver.switchTo().frame("webelement");
		
		driver.getWindowHandle();
		java.util.Set<String> allWindow = driver.getWindowHandles();
		java.util.Iterator<String> window = allWindow.iterator();
		String parentWindow = window.next();
		driver.switchTo().window(parentWindow);
		String childWindow = window.next();
		driver.switchTo().window(childWindow);
		driver.switchTo().defaultContent();
		
	WebDriverWait wait =	new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("username")));
	
	
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.id("username"))).build().perform();
	
	Select sel = new Select(driver.findElement(By.id("element")));
	sel.selectByIndex(1);
	sel.deselectByValue("value");
	sel.selectByVisibleText("text");
	sel.getOptions();
	
	Actions act1 = new Actions(driver);
	act1.dragAndDrop(driver.findElement(By.id("source")), driver.findElement(By.id("Destination")));
	
	
			File sceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputFile.FILE);
			FileUtils.copyFile(sceFile, new File("C:\\destFile"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,scrollHight)", " ");
			
			driver.navigate().forward();
			driver.navigate().back();
			driver.navigate().refresh();
			
			int size = driver.findElements(By.id("Sree")).size();
			
			driver.findElement(By.xpath("//input[@id='abvd']/following-sibling::div[2]"));
			driver.findElement(By.xpath("//input[@name='Sree']/preceeding-sibling::div[1]"));
			
			
			
	
	
	
		
		
		

	}

	private static void TakeScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
