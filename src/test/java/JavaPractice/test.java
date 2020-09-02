package JavaPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

import org.apache.xmlbeans.impl.xb.xsdschema.Element;

public class test {
	
	public static void main(String[] args) throws IOException {
		
		String str = "sreenivase";
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		char[] c=str.toCharArray();
		for(char ch : c) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		int maxCount=0;
		char maxChar=' ';
		for(Entry<Character,Integer> m:hm.entrySet()) {
			if(maxCount < m.getValue()) {
				maxCount = m.getValue();
				maxChar = m.getKey();
			}
		}
			System.out.println("Max accured char is  '"+maxChar+"' and value is "+maxCount);
	}
}


