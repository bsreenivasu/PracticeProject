package JavaPractice;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicatenum {
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,4,2,2,1,1,3,7,5};
		/*
	//	LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		HashSet set = new HashSet();
		
		for (int i=0; i<arr.length;i++) {
			set.add(arr[i]);
				}
		System.out.println(set);
		*/
		
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i=0; i < arr.length; i++) {
				set.add(arr[i]);
			}
	
		System.out.println(set);
	}
	}
	
	
	

