package JavaPractice;

public class CharacterFrequencyInString {

	public static void main(String[] args) {
		String s = "aabc d aab jhhhhkkkk ce d";
		int len = s.length();
		char ch, sc;
		int count;
		System.out.println("Char \t frequency");
		System.out.println("==== \t ========");
		for(sc ='a';sc<='z';sc++) {
			count=0;
			for (int i=0;i<len;i++) {
				ch=s.charAt(i);
				if(sc == ch) {
					count++;
				}
				
			}
			
			if (count !=0) {
				System.out.println(sc +"\t" + count);
			}
		}
	}
}
