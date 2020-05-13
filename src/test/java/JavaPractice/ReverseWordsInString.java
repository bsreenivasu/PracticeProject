package JavaPractice;

import org.apache.commons.lang3.StringUtils;

public class ReverseWordsInString {

public static void main(String[] args) {

	String blogName = "HCL TECHNOLOGIES LIMITED";


//String reverseString = StringUtils.reverseDelimited(StringUtils.reverse(blogName),' ');
//String reverseString1 = StringUtils.reverseDelimited(StringUtils.reverse("HCL TECHNOLOGIES LIMITED"),' ');
String reverseString2 = StringUtils.reverseDelimited(StringUtils.reverse(blogName), ' ');

String reverseString3 = StringUtils.reverseDelimited(blogName, ' ');

/*
 	

		 * String reverseString = StringUtils.reverseDelimited(
		 * StringUtils.reverse(blogName), ' ' ); StringUtils.reverseDelimited(str,
		 * separatorChar)
		 *

 */
System.out.println( reverseString2 );
}
}