package demo.PracticeProject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AllTopicInSeleniumPractice {
	WebDriver driver;

//		@Test
//		public void  DropDownPractice() throws InterruptedException {
//			System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.get("http://demo.guru99.com/test/newtours/register.php");
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			
//			Select select = new Select(driver.findElement(By.name("country")));
//			select.selectByValue("INDIA");
//			Thread.sleep(5000);
//					
//			
//		}

//	@Test
//	public void getWendowHandlesPractice() {
//		System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.naukri.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//
//		String Window = driver.getTitle();
//		System.out.println("Name of Parent Window is " + Window);
//
//		System.out.println("=====================================================");
//		Set<String> handler = driver.getWindowHandles();
//					Iterator<String> ite =  handler.iterator();
//					int TotalWindows = handler.size();
//					System.out.println("Total Windows size is  :: " + TotalWindows);
//					System.out.println(" Moving to Parent Window.........");
//					String ParentWindowID = ite.next();
//					driver.switchTo().window(ParentWindowID);
//					String ParentWindowName = driver.getTitle();
//					System.out.println("Parent Window Name is " + ParentWindowName);
//					
//					System.out.println(" Moving to Child Window.........");
//					String ChildWindowID = ite.next();
//					
//					
//					driver.switchTo().window(ChildWindowID);
//					driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//					String ChildWindowName = driver.getTitle();
//					System.out.println("Child Window Name is " + ChildWindowName);
//					driver.close();
//					
//					System.out.println(" Moving back  to Parent Window.........");
//					driver.switchTo().defaultContent();
//					String AfterBackParentWindowName = driver.getTitle();
//					System.out.println("NOW Parent Window Name is " + AfterBackParentWindowName);
									
//	}

	//******************************************************************************************
	//                               		FEBONACCI SERIES
	//*******************************************************************************************
	    /*@Test   
		public void febonacciSeries() {
	      Scanner num = new Scanner(System.in);
	      System.out.println("ENter a number to print Febonacci Series ");
	      int input = num.nextInt();
	      int num1=0, num2=1;
	      for(int i = 0; i<=input; i++) {
	    	  System.out.println(num1 + " ");
	    	  int counter = num1 + num2;
	    	  num1 = num2;
	    	  num2 = counter;
	      
	      }
	
	       }
	    */
	    
//*************************************************************************************
	    //                             	SORTING OF INTEGER ARRAY
//**************************************************************************************
	    
//	    @Test
//	    public void sortingOfIntegerArray() {
//	    	Scanner num = new Scanner(System.in);
//	    	System.out.println("Enter the size of array = ");
//	    	int input = num.nextInt();
//	    	int[] intar = new int[input];
//	    	for (int i=0; i< input; i++) {
//	    		System.out.println("Enter element to add array:: ");
//	    		int element = num.nextInt();
//	    		intar[i]=element;
//	    		}
//	    	for (int j=0; j<input;j++) {
//	    	  System.out.print(intar[j]);
//	    	  System.out.print(" ");
//	    	}
//	    	System.out.println("Sorted Array ");
//	    	for (int k =0; k< input;k++) {
//	    			for (int l=k+1; l<input;l++) {
//	    				if(intar[k] > intar[l]) {
//	    					int temp = intar[k];
//	    					intar[k] = intar[l];
//	    					intar[l] = temp;
//	    						}
//	    					    			}
//	    			System.out.print(intar[k]);
//	    			System.out.print(" ");
//	    	}
//	      }
	
//**************************************************************************************
	//                    STRING REVERSE
//***************************************************************************************
	
//	@Test
//	public void StringReverse() {
//	Scanner str = new Scanner(System.in);
//	System.out.println("Enter a String :: ");
//	String input = str.next();
//	String revStr = "";
//	
//	for(int i=input.length()-1;i>=0;i--) {
//		revStr = revStr + input.charAt(i);
//		
//	}
//	System.out.println("Reverse String is :: " + revStr);
//	}
//	    
	//********************************************************************************************
		//											REVERSE WORDS IN A STRING
	//********************************************************************************************
	
//	@Test
//	public void wordsReverseInString() {
//	String str="APPLE RIDGE APARTMENT";
//	String[]  words = str.split(" ");
//	String RevStr = "";
//	for(int i = 0; i < words.length; i++) {
//			String word = words[i];
//			String revWord="";
//			
//			for (int j=word.length()-1; j>=0;j--){
//				revWord = revWord + word.charAt(j);
//			}
//			
//			RevStr = RevStr + revWord + " ";
//			
//	}
//			System.out.println(RevStr);
//		
//	}
	
//*****************************************************************************************
	  //                 REVERSE INTEGER ARRAY
//******************************************************************************************
	  
//	@Test
//	public void reverseInteger() {
//	int num = 4529;
//	   int revNum=0;
//	   while (num != 0) {
//		   
//		   revNum = revNum * 10 + num % 10;
//		   num = num / 10;
//		   
//	   }
//	   System.out.println(revNum);
//	
//	}
//**************************************************************************************************8
	//                                        REMOVE DUPLICATE ELEMENTS IN INTEGER ARRAY
	//***************************************************************************************************
	
//	@Test
//	public void removeDuplicateElementsInArray() {
//		int[] num = {3,4,5,3,4,5,6,7};
//		
//		HashSet<Integer> set = new HashSet<Integer>();
//		for (int i=0;i<num.length;i++) {
//			set.add(num[i]);
//		}
//		System.out.println(set);
//		
//		
//	}
	
	//***********************************************************************************
	//                        PRINT PRIME NUMBERS
	//*************************************************************************************
	
  @Test
  public void printPrimeNumbers() {
	  int num = 10;
	  for(int i=2;i<=num;i++) {
		  int count=0;
		  	for(int j=1;j<=i;j++) {
		  		if (i % j == 0) {
		  			count =count+1;
		  		}
		  	}
		  	
		  	if(count == 2) {
		  		System.out.println("Prime numbers are :: " + i);
		  	}
	  }
			  
  }
	
}
