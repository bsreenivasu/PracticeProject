package JavaPractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaxRepeatingCharInString {


	public static void main(String[] args) {
	String str = "Sreenivavgvfvhvss";
	
	HashMap<Character, Integer> hm = new HashMap();
	char[] c = str.toCharArray();
	for(char ch:c) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		
	}
	int maxCount = 0;
	char maxChar =' ';
		for(Entry<Character, Integer> m : hm.entrySet()) {
			if(maxCount < m.getValue()) 
			{
				maxCount = (int) m.getValue();
				maxChar = (char) m.getKey();
			}
			
		}
		System.out.println("Maximum repeated character is ::: " + maxChar);
		System.out.println("Maximum count of character is ::: " + maxCount);
		
		}
	}


