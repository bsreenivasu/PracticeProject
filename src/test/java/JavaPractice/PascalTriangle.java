package JavaPractice;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		System.out.println("Enter a number to print pascal triangle:: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int number = 1;
		for (int i = 0; i < num; i++) {
			for (int space = num; space > i; space--) {    //This for loop is for triangle of spaces
				System.out.print(" ");
			}
			number = 1;                //because we always want triagle row should start from 1
			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number = number * (i - j) / (j + 1);   //This is formula for Pascal triangle
			}
			System.out.println();
		}
	}
}
