package JavaPractice;

import java.util.HashSet;

public class DuplicateValuesInIntegerArray {

		public static void main(String[] args) {
			
			int[] names = {2,4,2,8,9,3,4,7,9};
			
			HashSet<Integer> store = new HashSet<Integer>();
			for (int name : names) {
				if (store.add(name)==false) {
					System.out.println("Duplicate (HashSet) value is ::" + name);
			
		/*	for (int i = 0; i < names.length; i ++) {
				
				for (int j = i +1; j < names.length; j ++) {
					
					if (names[i] == names[j]) {
						System.out.println("Duplicate value is : " + names[i]);
					}
				}
				}*/

		}
			}
		}
}

