package JavaPractice;

public class SwapTwoNumbersWithoutThirdVariable {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y =20;
		
		System.out.println("x value is :: " + x);
		System.out.println("y value is :: " + y);
		x = x+y; //30
		y= x - y;  // 10
		x=x-y;   //20
		
		System.out.println("After swap");
		System.out.println("x value is :: " + x);
		System.out.println("y value is :: " + y);
		
	}
	
}
