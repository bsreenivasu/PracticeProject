package JavaPractice;

import java.util.Scanner;

public class TestAll {

	public void ReverseString() {

		Scanner input = new Scanner(System.in);

		System.out.println("ENter a String : ");

		String getinput = input.next();

		String rev = "";

		int len = getinput.length();
		for (int i = len - 1; i >= 0; i--) {

			rev = rev + getinput.charAt(i);

		}

		System.out.println("Reverse of String is ::" + rev);
		
		StringBuffer stb = new StringBuffer(rev);
		System.out.println("Reverse String in String Buffer is ::" + stb.reverse());
	}
	
	public void reverseInteger() {
		
		Scanner inputInt = new Scanner(System.in);
		System.out.println("Enter a interger value to reverse: ");
		int num = inputInt.nextInt();
		
		
		int Rev = 0;
		while (num != 0) {
			
			Rev = Rev * 10 + num % 10;
			num = num / 10;
		}
		
		System.out.println("String Reverse is :: " + Rev);
		
		//StringBuffer stb = new StringBuffer(num);
		
		System.out.println(new StringBuffer(String.valueOf(Rev)).reverse());
	//	System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	
		
	}

	public static void main(String[] args) {

		TestAll ta = new TestAll();
		ta.ReverseString();
	//	ta.reverseInteger();

	}

}