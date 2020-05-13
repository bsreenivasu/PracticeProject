package JavaPractice;

import java.util.HashSet;

public class FindDuplicateElementInArray {
	
	public static void main(String[] args) {
		
		String[] names = {"Java", "C", "Java", "Ruby", "Python", "Ruby"};
		
		for (int i = 0; i < names.length; i ++) {
			
			for (int j = i +1; j < names.length; j ++) {
				
				if (names[i] == names[j]) {
					System.out.println("Duplicate value is : " + names[i]);
				}
			}
		}
		
		
		//Second approach using Hash set
		
		HashSet<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name)==false) {
				System.out.println("Duplicate (HashSet) value is ::" + name);
			}
		}
		
		
	}

}
