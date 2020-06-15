package JavaPractice;

import java.util.Arrays;

public class FindStringsAndIntegersInArray {

	public static String[] str = { "Java", "123", "Ruby", "456", "Python", "786", "Selenium" };
	
		// Defining a Method to parse Integers and Strings
	public void alphanumericArray(String[] str) {

		int strCount = 0, numCount = 0;
	
		//Loop to parse each element of array
		for (int i = 0; i < str.length; i++) {
			try {
				Integer.parseInt(str[i]);
				numCount++;
			//if string throws exception catch block will execute and increase the count of strings
			} catch (NumberFormatException e) {
				strCount++;
			}
		}
		System.out.println("Total integers are :: " + numCount);
		System.out.println("Total Strings are :: " + strCount);
	}

	public static void main(String[] args) {
		FindStringsAndIntegersInArray test = new FindStringsAndIntegersInArray();
		System.out.println(Arrays.toString(str));
		test.alphanumericArray(str);
	}
}
