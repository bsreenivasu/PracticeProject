package JavaPractice;

import java.util.Scanner;

public class FebanacciSeries {
	public static void main (String[] args) {
		 
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Enter a number to print febanacci series :: "); int count
		 * = input.nextInt();
		 * 
		 * int num1=0, num2=1; for(int i=1;i<=count;i++) { System.out.println(num1 +
		 * " "); int totalCount = num1+num2; num1=num2; num2=totalCount; }
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :: ");
		int count = input.nextInt();
			int num1=0, num2=1;
			for(int i=1; i<=count;i++) {
				System.out.println(num1 + " ");
				int totalCount = num1 + num2;
				num1 = num2;
				num2 = totalCount;
				
				
				
			}
		
	}

}
