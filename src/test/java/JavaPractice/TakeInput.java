package JavaPractice;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to print : ");
		String inputString = input.next();
		System.out.println("String you entered is : " + inputString);
		input.close();
	}

}
