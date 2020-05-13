package JavaPractice;

public class IntegerReverse {

	public static void main(String[] args) {
		//Using while loop
		
		int num = 12345;
		int rev = 0;
		while (num !=0) {
			
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		
		System.out.println(rev);
		
		// Using String Buffer
		
		int num1 = 56789;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
				

	}

}

	
	