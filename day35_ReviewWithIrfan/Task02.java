package day35_ReviewWithIrfan;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number...");
		int a = scan.nextInt();
		System.out.println("Enter second number...");
		int b = scan.nextInt();
		try {
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Division is not possible by zero.");
			System.out.println("Enter a different divisor.");
		} finally {
			scan.close();
		}
		
	}

}
