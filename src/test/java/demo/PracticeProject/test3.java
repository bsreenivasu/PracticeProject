package demo.PracticeProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;

public class test3 {
	 public static void main(String args[]) throws IOException {
		// F:\\txtreaderfile.txt;
		 
			HashMap<Integer,String> hm = new HashMap<Integer,	String>();
			hm.put(0,"Hello");
			hm.put(1, "GoodBye");
			hm.put(2,"Morning");
			
			System.out.println(hm);
			
			for(Entry m: hm.entrySet()) {
				System.out.println(m.getKey()+"  "+m.getValue());
			}
         }
         
		 
		 
}

