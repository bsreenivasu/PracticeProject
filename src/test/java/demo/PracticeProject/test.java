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

public class test{
	
	public static void main(String[] args) throws IOException {
		
//		String str1 = new String("durga");
//		String str2= new String("durga");
		
//		StringBuffer sb1 = new StringBuffer("durga");
//		StringBuffer sb2 = new StringBuffer("durga");
//		
//		StringBuilder sb1 = new StringBuilder("durga");
//		StringBuilder sb2 = new StringBuilder("durga");
//		
//		System.out.println(sb1==sb2);
//		System.out.println(sb1.equals(sb2));
		
//		System.out.println(str1==str2);
//		System.out.println(str1.equals(str2));
		
//		Exceptions:
		
//		int a = 10;
//		
//		
//		File file = new File("E:\\ysample.txt");
//		
//		Properties pro = new Properties();
//		try{
//		FileInputStream fis = new FileInputStream("F:\\textfile.txt");
//		pro.load(fis);
//	
//		System.out.println(a%0);
//		}
//		
//		catch(ArithmeticException ae)
//		{
//			System.out.println("Arithmetic Exception Catched");
//		}
//		catch(FileNotFoundException fe)
//		{
//			System.out.println("File Not founnd exception");
//			return;
//		}
//		
//		catch(Exception e)
//		{
//			System.out.println("Exception catched");
//		}
//		
//	   finally
//		{
//			System.out.println("Finally method called");
//		}
		
//		String str = "India is my 123 country 786";
//		String only_numbers = str.replaceAll("[^0-9]","");
//		System.out.println(only_numbers);
		
//		String str = "India is my country";
//		String[] words = str.split(" ");
//		String RevString = "";
//		for (int i = 0; i < words.length; i++) {
//			String word = words[i];
//			String RevWord = "";
//
//			for (int j = word.length()-1; j >= 0; j--) {
//				RevWord = RevWord + word.charAt(j);
//			}
//			RevString = RevString + RevWord + " ";
//		}
//		System.out.println("ReverseStirng is =" + RevString);

//		String str = "sreenieyuoiyyyyvas";
//		char[] c = str.toCharArray();
//	
//		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//		  for (char ch:c) {
//			  if(hm.containsKey(ch)) {
//				  hm.put(ch,hm.get(ch)+1);
//			  }
//			  else
//			  {
//				  hm.put(ch, 1);
//			  }
//		  }
//		
//		  System.out.println(hm);
//			Character maxChar = null;
//			int maxCount = 0;
//		for(Entry<Character, Integer> m:hm.entrySet()) {
//			if(m.getValue() > maxCount) {
//				maxCount = m.getValue();
//				maxChar =m.getKey();
//			}
//			
//	//		System.out.println(m.getKey() + "  " + m.getValue());
//		}
//		System.out.println(maxCount + "  " + maxChar);
		
//	File file = new File("F:\\txtreaderfile.txt");
//	Scanner sc = new Scanner(file);
//	while (sc.hasNextLine()){
//		String lines = sc.nextLine();
////		System.out.println(sc.nextLine());
//		System.out.println(lines);
//	
//		HashSet<String> set = new HashSet();
//		String[] words = lines.split(" ");
//		for (int i =0 ;i < words.length;i++) {
//			if (set.add(words[i])==false) {
//				System.out.println("Duplicate word is " + words[i]);
//			}
//		}
		
		System.out.println("Enter a number to print febonacci");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		int num1=0,num2=1;
		for(int i=2;i<num;i++) {
			System.out.println(num1);
			int count = num1 + num2;
			num1 = num2;
			num2 = count;
		}
		
	}
	}

	
	

	
	
	  

	
