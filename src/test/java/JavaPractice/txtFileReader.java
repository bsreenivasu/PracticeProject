package JavaPractice;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class txtFileReader{

	public void fileReader() throws IOException {
		FileReader fr = new FileReader("F:\\txtreaderfile.txt");
		BufferedReader br = new BufferedReader(fr);
		String text;
		while ((text = br.readLine()) != null) {
			System.out.println(text);
		}
		br.close();
	}

	public void stringReverse() {
		System.out.println("Enter a string to print in reverse :: ");
		String input;
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		String revstr = "";
		System.out.println("Actual Input is :: "+input);
		for (int i = input.length() - 1; i >= 0; i--) {
			revstr = revstr + input.charAt(i);
		}
		System.out.println("Rerverse String is :: " +revstr);
	}

	public static void main(String[] args) throws IOException {

		txtFileReader fr = new txtFileReader();
		// fr.fileReader();
		fr.stringReverse();

	}

}
