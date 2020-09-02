package JavaPractice;
import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

public class ReverseWordsInString {

	@Test
	public void wordsReverseInString() {
	String str="APPLE RIDGE APARTMENT";
	String[]  words = str.split(" ");
	String RevStr = "";
	for(int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord="";
			
			for (int j=word.length()-1; j>=0;j--){
				revWord = revWord + word.charAt(j);
			}
			
			RevStr = RevStr + revWord + " ";
			
	}
			System.out.println(RevStr);
		
	}

}