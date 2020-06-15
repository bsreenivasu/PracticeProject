package JavaPractice;

public class MaxAndMinNumbersinArray {

	public static void main(String[] args) {
		int[] numbers = {2,8,3,9,5,23,5};
		int max = numbers[0];
		int min = numbers[0];
		for (int i=1; i<numbers.length;i++ ) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println(" max number is = " + max);
		
		for (int j=1; j<numbers.length;j++ ) {
			if(min > numbers[j]) {
				min = numbers[j];
	}
	
		}
		System.out.println("Min number is = "+ min);
	}
}
