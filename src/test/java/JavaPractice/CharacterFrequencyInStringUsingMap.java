package JavaPractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharacterFrequencyInStringUsingMap {
	public static void main(String[] args) {
		String str = "Chakrika";
		HashMap<Character, Integer> hm = new HashMap<>();
		char[] c = str.toCharArray();
		for (char ch : c) {

			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			} 
		}
		System.out.println(hm);
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " = "+m.getValue());
		}
	}

}
