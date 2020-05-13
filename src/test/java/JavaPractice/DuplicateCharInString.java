package JavaPractice;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String str = "srinivas";
		int count=0;
		char[] chararray = str.toCharArray();
			for (int i=0; i < chararray.length; i++) {
				for (int j=i+1; j<chararray.length; j++) {
					if (chararray[j] == chararray[i])	{
						count = count +1;
						System.out.println(" Duplication char is :: " + chararray[j] + " and count is " + count);
					}
					
				}
				
				
			}
		
	}

}
