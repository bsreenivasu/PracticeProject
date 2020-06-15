package JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class TestAll {

		public void findLongAndShortString(List<String> list) {
			
		int smallest = list.get(0).length();
		int longest = list.get(0).length();
		int shortindex = 0;
		int longindex = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() < smallest) {
				smallest = list.get(i).length();
				shortindex = i;
			}
		}
		
		System.out.println("<<<<< ----------------->>>>");
		System.out.println("Smallest String is :: " + list.get(shortindex));
		list.remove(shortindex);
		
		for (int j = 0; j < list.size(); j++) {
				if (list.get(j).length() > longest) {
					longest = list.get(j).length();
					longindex = j;
				}
			}
		System.out.println("Longestt String is :: " + list.get(longindex));
		System.out.println("<<<<< ----------------->>>>");
		list.remove(longindex);
	
		System.out.println("List of Elements after removal---->>> "+ list);
		}
	}
