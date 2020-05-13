package demo.PracticeProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.excel.utility.Xls_Reader;

import com.sun.jna.platform.win32.WinUser.INPUT;

public class OnlyPractice<Xls_Reader> {

	public void Factorial() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to get Factorial : ");
		int num = input.nextInt();
		input.close();
		int temp = 1;
		for (int i = 1; i <= num; i++) {
			temp = temp * i;
		}
		System.out.println("Factorial Number is  = " + temp);
	}

	public void ReverseInteger() {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Integer number to reverse : ");
		int num = input.nextInt();
		input.close();

		int revNum = 0;
		while (num != 0) {
			revNum = revNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of Integer is = " + revNum);
	}

	public void SumofGivenDigits() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer number  :: ");
		long num = input.nextLong();
		input.close();
		long sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("sum of digits in integer is =  " + sum);
	}

	public void ReverseString() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to reverse  :  ");
		String string = input.next();
		String rev = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			rev = rev + string.charAt(i);
		}
		System.out.println("Reverse of String is = " + rev);
	}

	public void FebonacciSeries() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer number  :: ");
		int num = input.nextInt();
		input.close();
		int num1 = 0, num2 = 1;
		for (int i = 1; i <= num; i++) {
			System.out.print(+num1 + " ");
			int count = num1 + num2;
			num1 = num2;
			num2 = count;
		}

	}

	public void ReverseinWordsInString() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String to reverse words :: ");
		String string = input.nextLine();
		// String string = "core java program";
		String[] words = string.split(" ");
		String RevString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String RevWord = "";

			for (int j = word.length()-1; j >= 0; j--) {
				RevWord = RevWord + word.charAt(j);
			}
			RevString = RevString + RevWord + " ";
		}
		System.out.println("ReverseStirng is =" + RevString);
	}

public void TextFileReader() throws IOException {
	
//	FileReader fr = new FileReader("F:\\txtreaderfile.txt");
//	BufferedReader br = new BufferedReader(fr);
//	String str;
//	while((str=br.readLine()) != null) {
//		System.out.println(str);
//	}
	
//	File file = new File("F:\\txtreaderfile.txt");
//	Scanner sc = new Scanner(file);
//	while (sc.hasNextLine()) {
//		System.out.println(sc.nextLine());
//	}
//	sc.close();
//}

HashMap<Integer,String> hm = new HashMap<Integer,String>();
hm.put(1,"Sree");
hm.put(2,"Devi");
hm.put(1,"partu");

System.out.println(hm.size());
for(Map.Entry m : hm.entrySet()) {
	System.out.println(m.getKey() +"     "+m.getValue());
}



	
	
	
	
	
}





	
	
	

 
 
	
	

	
	
	
	public static void main(String[] args) throws IOException {
		OnlyPractice op = new OnlyPractice();
		// op.Factorial();
		// op.ReverseInteger();
		// op.SumofGivenDigits();
		// op.ReverseString();
		// op.FebonacciSeries();
		// op.ReverseinWordsInString();
		op.TextFileReader();
	}
}
