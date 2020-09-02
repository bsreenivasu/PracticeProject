package demo.PracticeProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ConnectDatabase {
	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		
		Connection con=null;
		String dbUrl = "jdbc:mysql://localhost:3306/qadb";
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		String dbUserName="root";
		String dbPassword = "root";
		String username = null;
		String password= null;
		
	//	Class.forName(driver).newInstance();
//		Class.forName(dbDriver).newInstance();
		con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		System.out.println("Connection established successfully");
	
		Statement s = con.createStatement();
		System.out.println("COnnection created");
		
		String query="select * from users where sitename='hubspot'";
		ResultSet rs = s.executeQuery(query);
//		String rsValue = rs.toString();
//		System.out.println("rsValues are "+ rsValue);
		System.out.println(rs);
		System.out.println("Sql query executing");
		
		while(rs.next()) {
		username = rs.getString("USERID");
		password = rs.getString("PASSWORD");
		}
		
		System.out.println("Credentials fetched from db :: username is " + username +" and Password is " + password );


			
		
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//i18n-string[text()='Log in']")).click();
		
	
}
}
