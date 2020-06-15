package JavaPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
	
		String str = "india is a country india is a nation this nation another india";
		String[] words = str.split(" ");
	
		Set<String> set = new HashSet<String>();
		for(int i=0; i< words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
				set.add(words[i]);
				}
		}
			
		}
		System.out.println("Duplicate words are :: " + set);
		
	}
}


