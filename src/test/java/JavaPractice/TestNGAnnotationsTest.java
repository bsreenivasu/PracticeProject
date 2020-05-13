package JavaPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsTest {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	@Test(priority=1)
	public void Test1() {
		System.out.println("Test1");
	}
	@Test(priority=0)
	public void Test2() {
		System.out.println("Test2");
	}
	@Test(priority=-1)
	public void Test3() {
		System.out.println("Test3");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after Class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after Test");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after Suite");
	}

}
