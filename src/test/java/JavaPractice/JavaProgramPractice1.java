package JavaPractice;

import java.util.ArrayList;

public class JavaProgramPractice1 {

	public static void main(String[] args) {

		JavaProgramPractice1 program = new JavaProgramPractice1();
		// program.ReverseString();
		// program.ReverseInteger();
		//program.sortIntegerAray();
		//	program.addElementstoArrayList();
		 program.ReverseWordsInString();
		 // program.findDuplicateElements();
	//	program.findLargetSmallest();

	}

	public void ReverseString() {
		
		System.out.println("THIS PROGRAM FOR REVERSE A STRING");

		String s = "Sreenivas";
		String rev = " ";
		int stringLength = s.length();

		for (int i = stringLength - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}

		System.out.println("Reverse String of " + s + " is now " + rev);
	}

	public void ReverseInteger() {
		
		System.out.println("THIS PROGRAM FOR REVERSE A INTEGER");

		int num = 12345;
		int reverseNum = 0;

		while (num != 0) {

			reverseNum = reverseNum * 10 + num % 10;
			num = num / 10;

		}

		System.out.println("Reverse number is : " + reverseNum);

	}

	public void sortIntegerAray() {
		
		System.out.println("THIS PROGRAM FOR SORTING A INTEGER ARRAY");

		int[] rawArray = { 5, 4, 2, 3,7,1 };
		int rawArrayLength = rawArray.length;
		System.out.println("\nBefore Sorting Array");
		for (int k = 0; k < rawArrayLength; k++) {

			System.out.print(" " + rawArray[k]);
		}
		
	//	int[] sortedArray = new int[rawArrayLength];

	//	System.out.println(rawArray[1]);

		for (int i = 0; i < rawArrayLength; i++) {
			for (int j = i + 1; j < rawArrayLength; j++) {
				if (rawArray[i] > rawArray[j]) {
					int temp = rawArray[i];
					rawArray[i] = rawArray[j];
					rawArray[j] = temp;
				}
			}
		}
		
		System.out.println("\nAfter Sorting Array");
		for (int k = 0; k < rawArrayLength; k++) {

			System.out.print(" " + rawArray[k]);
		}

	}

	public void addElementstoArrayList() {
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add("Sreenivas");
		arrayList.add(15.67);
		arrayList.add("True");
		
		for(int i =0; i < arrayList.size(); i++) {
		System.out.println(arrayList.get(i));
		}
		
	}

	public void ReverseWordsInString() {
		
		String str = "Java Program Practice";
		
		String[] words = str.split(" ");
		String revString = "";
		
		for (int i=0; i<words.length;i++) {
			
			String word = words[i];
			String revWord = " ";
			
			for (int j = word.length()-1;j>=0; j--) {
				revWord = revWord + word.charAt(j);
				}
			
			revString = revString + revWord + " ";
		}
		
		System.out.println("Reverse words in String is : " + revString);
		
	}
	
	
	public void findDuplicateElements() {
		
		System.out.println("FINDING DUPLICATE ELEMENT IN A ARRAY");
		
		String[] str= {"Java", "C", "RUBY", "Java"};
		
		int strLen = str.length;
		
		for (int i =0; i< strLen; i++) {
			for(int j=i+1;j<strLen;j++) {
				
				if(str[i] == str[j]) {
					System.out.println("Duplicate Element is : " + str[i]);
				}
			}
		}
		
	}
	
	public void findLargetSmallest() {
		System.out.println("Find Smallest and Largest elements in Array");
		int[] a = {34,54,16,77,23,43};
		int small = a[0];
		int large = a[0];
		
		for (int i =0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}
				else if (a[i] < small){
					small =a[i];
			}
		}
		
		System.out.println("Smallest element is " + small);
		System.out.println("Largest element is " + large);
	}
}


