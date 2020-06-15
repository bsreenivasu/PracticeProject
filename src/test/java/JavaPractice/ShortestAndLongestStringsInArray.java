package JavaPractice;

public class ShortestAndLongestStringsInArray {

	public static void main(String[] args) {
	//	String str = "There are five members in our family";
	//	String[] words = str.split(" ");
		String[] words = {"Python", "Java", "c", "Selenium"};
		String shortest = words[0];
		String longest = "";
//		for(String s:words) {
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			if(word.length() < shortest.length() ) {
				shortest = words[i];
			}
			
			
		
			for(int j=0;j<words.length;j++) {
			
				if(word.length() > longest.length()) {
				longest=words[j];
			}
			}
		}
			
			System.out.println("Shortest String is ::" + shortest);
			System.out.println("Longest String is :: " + longest);
	}
}
