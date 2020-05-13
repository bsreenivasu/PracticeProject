package JavaPractice;

public class StringReverse {

	public static void main(String[] args) {

		String s = "Cap Gemini";

		/*
		 * int len = s.length(); String rev = "";
		 * 
		 * for (int i = len - 1; i >= 0; i--) {
		 * 
		 * char character = s.charAt(i); rev = rev + character;
		 * 
		 * } System.out.println(rev);
		 * 
		 * // ANOTHER WAY TO REVERSE A STRING: StringBuffer sf = new StringBuffer(s);
		 * System.out.println(sf.reverse());
		 */
		
		int length = s.length();
		String rev = "";
		
		for(int i = length-1 ; i >=0 ; i--) {
			rev = rev + s.charAt(i);
			}
		System.out.println(rev);
				
	}

}
