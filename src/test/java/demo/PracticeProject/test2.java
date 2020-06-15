package demo.PracticeProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import JavaPractice.TestAll;

public class test2 {

	public static void main(String[] args) {
		
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("Sreenivas");
		ls.add("Sreedevi");
		ls.add("Parthiv");
		ls.add("Chakri");
		
		System.out.println("All Elements in List IS --->>>"+ls);
		
		TestAll ta = new TestAll();
		ta.findLongAndShortString(ls);
	}
}
