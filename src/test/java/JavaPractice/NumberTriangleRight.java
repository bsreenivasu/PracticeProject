package JavaPractice;

import java.util.Scanner;

public class NumberTriangleRight {

	public static void main(String[] args) {
			System.out.println("Enter a number to print Number Triangle :: ");
			Scanner sc = new Scanner(System.in);
					int num = sc.nextInt();
			
			for(int i=1;i<=num;i+=2) {
				for(int j=1;j<=i;j+=2) {
					System.out.print(i+" ");
				}
				System.out.println();
			}

			for(int i=num-1;i>=1;i-=2) {
				for(int j=1;j<=i;j+=2) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
	}

}
