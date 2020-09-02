package JavaPractice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JdbcConnection {
	static WebDriver driver;
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//		WebDriver driver;
		String host = "localhost";
		String port = "3306";
		Connection conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadb", "root", "root");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select * from EmployeeInfo where Name = 'Sreedevi'");
		while(rs.next())
		{
			
		//	System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
		//	driver = new ChromeDriver();
			
	//		driver.get("http://facebook.com");
	//		driver.findElement(By.id("email")).sendKeys(rs.getString("location"));
		//	driver.findElement(By.id("pass")).sendKeys(rs.getString("Age"));
		//	driver.findElement(By.partialLinkText("Forgotten account?")).click();
			System.out.println(rs.getString("location"));
			System.out.println(rs.getString("Age"));
			
		
		}
		 
		
		
	}

}
