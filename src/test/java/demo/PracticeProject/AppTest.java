package demo.PracticeProject;

import java.util.Scanner;

import org.testng.annotations.Test;

public class AppTest {
@Test
public void primeNumbers() {
		int num = 100;
		int temp = 0;
		for(int i=1;i<=num;i++) {
			for(int j=2;j<=i-1;j++) {
					if(i%j==0) {
						temp = temp + 1;
					}
			}
					if (temp == 0) {
					System.out.println(i + "is Prime Number");
				}
				else {
					temp = 0;
				}
			}
		
		}

}