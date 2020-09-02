package JavaPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;

public class test123 {
	
	public static void main(String[] args) {
		// Reverse words in a String
//		String str = "Chakrika is studying fourth class";
//		String[] words = str.split(" ");
//		String revStr = " ";
//		for (int i = 0; i<words.length-1;i++) {
//			String word = words[i];
//			String revWord = " ";
//			for (int j=word.length()-1; j>=0;j--) {
//				revWord = revWord + word.charAt(j);
//			}
//			revStr = revStr + revWord + " ";
//		}
//	
//		System.out.println(revStr);
		
		//Entered number is prime number or not
		
//		System.out.println("Enter a number to print prime or not");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int count = 0;
//		for (int i=2;i<num;i++) {
//			if (num % 2== 0) {
//				count++;
//			}
//		}
//		if (count == 0) {
//			System.out.println(num + " is a Prime number");
//		}
//		else
//		{
//			System.out.println(num + " is not prime number");
//		}
		
		//Febonacci series
		
//		System.out.println("Print a number to find Febonaacci");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num1=0,num2=1;
//		for (int i =0; i<= num;i++) {
//			System.out.println(num1);
//			int count = num1 + num2;
//			num1 = num2;
//			num2= count;
//		}
		
		//Hashmap
		
//		HashMap<Integer, String> hm = new HashMap<Integer,String>();
//		hm.put(1,"SREENIVA");
//		hm.put(2, "sreedevi");
//		hm.put(3,"Parthiv");
//		hm.put(4,"Chakrika");
//		
//		System.out.println(hm);
//		System.out.println(hm.get(2));
//		for (Entry m : hm.entrySet())
//		{
//			System.out.println(m.getKey() + "  " + m.getValue());
//			}
		
//		String str = "Chakrika";
//		char[] c = str.toCharArray();
//		HashMap<Character,Integer> hm = new HashMap();
//		for (char ch : c) {
//			if (hm.containsKey(ch)) {
//				hm.put(ch, hm.get(ch)+1);
//			}
//			else
//			{
//					hm.put(ch,1);
//			}
//		}
//			for(Entry<Character, Integer> m: hm.entrySet()) {
//			if(m.getValue() >1) {
//				System.out.println(m.getKey() +"  " + m.getValue());
//			}
//		}
//		String str = "india is a country india is a nation this nation another india";
//		
//		   String[] words = str.split(" ");
//		   HashSet<String> hs = new HashSet();
//		   for (int i=0;i<words.length;i++) {
//			   for(int j=i+1;j<words.length;j++) {
//				   if(words[i].equalsIgnoreCase(words[j])) {
//					   hs.add(words[i]);
//				   }
//				   
//			   }
//		   }
//		   System.out.println("Duplicate words are "+hs);
		
//		String str = "Sreenivavgvfvhvssaaaaaaaaaaaaaa";
//		char[]  c = str.toCharArray();
//		HashMap<Character, Integer> hs = new HashMap();
//		for(char ch : c) {
//			if(hs.containsKey(ch)) {
//				hs.put(ch, hs.get(ch) + 1);
//			}
//			else
//			{
//				hs.put(ch, 1);
//			}
//		
//		}
//		int maxCharCount = 0;
//		char maxRepChar = ' ';
//			for(Entry<Character,Integer> m : hs.entrySet()) {
//				if (maxCharCount < m.getValue()) {
//					maxCharCount = m.getValue();
//					maxRepChar = m.getKey();
//				}
//			}
//		System.out.println("max char " + maxRepChar);
//		System.out.println("max num " + maxCharCount);
		
		int[] nums = {2,5,9,6,1,7};
		int temp=0;
		for(int i =0 ;i< nums.length;i++) {
			for (int j=i+1; j< nums.length;j++) {
				if(nums[i] > nums[j]) {
					
					temp = nums[i];
					nums[i]=nums[j];
					nums[j] = temp;
					
				}
			}
			System.out.print(nums[i]+  "  "  );
		}
		
		
   }
		}
		
		
		

