package demo.PracticeProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class test456 {

	public void revString() {
		String str = "Sreenivas";
		String revString = "";
		for(int i=str.length()-1;i >=0;i--) {
			revString = revString + str.charAt(i);
		}
		System.out.println(revString);
	}
	
	public void fileReader() throws FileNotFoundException {
		File file = new File("F:\\txtreaderfile.txt");
		Scanner scr = new Scanner(file);
		while (scr.hasNext()) {
			System.out.println(scr.nextLine());
		}
	}
		public void propReader() throws IOException {
			
			Properties pro = new Properties();
			FileInputStream fis = new FileInputStream("F:\\txtreaderfile.txt");
			pro.load(fis);
			
			String proValue = pro.getProperty("url");
			System.out.println(proValue);
			
		}
		
		public void febonacciSeries() {
			
			System.out.println("Enter a number to print febonnaci");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int num1=0, num2=1;
			for(int i=1;i<=num;i++) {
				System.out.println(num1);
				int total = num1+num2;
				num1=num2;
				num2=total;
			}
		}
		
		public void hashmap() {
			HashMap<Integer,String> hm = new HashMap<Integer,String>();
			hm.put(1, "Sreeni");
			hm.put(2, "Sreedevi");
			hm.put(3, "Parthiv");
			hm.put(4, "Chakrika");
			
			for(Entry m:hm.entrySet()) {
				System.out.print(m.getKey());
				System.out.println(m.getValue());
			}
		}
			public void maxCharInString() {
			
//					String str = "Sreenivavgvfvhvss";
//					
//					HashMap<Character, Integer> hm = new HashMap();
//					char[] c = str.toCharArray();
//					for(char ch:c) {
//							if(hm.containsKey(ch)) {
//								hm.put(ch, hm.get(ch)+1);
//							}
//							else
//							{
//								hm.put(ch, 1);
//							}
//						
//					}
//					int maxCount = 0;
//					char maxChar =' ';
//						for(Entry<Character, Integer> m : hm.entrySet()) {
//							if(maxCount < m.getValue()) 
//							{
//								maxCount = (int) m.getValue();
//								maxChar = (char) m.getKey();
//							}
//							
//						}
//						System.out.println("Maximum repeated character is ::: " + maxChar);
//						System.out.println("Maximum count of character is ::: " + maxCount);
						
				String str = "Sreenivyyyyyyyyyyyyyyyas";
				HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
				char[] c = str.toCharArray();
				for(char ch : c) {
					if(hm.containsKey(ch)) {
						hm.put(ch, hm.get(ch)+1);
					}
					else {
						hm.put(ch, 1);
					}
						
				}
				int maxCount = 0;
				char maxChar = ' ';
					 for(Entry<Character, Integer> m : hm.entrySet()) {
						 if(maxCount < m.getValue()) {
							 maxCount = (int) m.getValue();
							 maxChar = (char)m.getKey();
						 }
					 }
			
					System.out.println ("Max Char is " + maxChar);
					System.out.println("Max Count is " + maxCount);
					 
			}	
				
			
			
		

	
	public static void main(String[] args) throws IOException {
	    
		test456 test = new test456();
//		test.revString();
//		test.fileReader();
//		test.propReader();
//		test.febonacciSeries();
//		test.hashmap();
		test.maxCharInString();
		
		
			
		
	    	
	    }

	}


