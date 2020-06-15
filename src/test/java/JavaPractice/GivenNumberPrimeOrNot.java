package JavaPractice;

import java.util.Scanner;

public class GivenNumberPrimeOrNot {

	public static void main(String[] args) {

		System.out.println("Enter a number to find Prime or not  =");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + "is not prime number");
		}
	}

}
