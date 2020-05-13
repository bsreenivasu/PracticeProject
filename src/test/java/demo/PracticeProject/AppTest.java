package demo.PracticeProject;

import java.util.Scanner;

import org.testng.annotations.Test;

public class AppTest {
@Test
public void febonacciSeries() {
Scanner num = new Scanner(System.in);
System.out.println("ENter a number : : ");
int input = num.nextInt();

int num1=0, num2=1;
for (int i = 1; i<= input; i++) {
	System.out.println(num1);
	int total = num1+num2;
	num1=num2;
	num2=total;
	
}
}
}