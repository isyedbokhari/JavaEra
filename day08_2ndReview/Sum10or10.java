package day08_2ndReview;

import java.util.Scanner;

public class Sum10or10 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer...");
		int a = scan.nextInt();
		System.out.println("Enter second integer...");
		int b = scan.nextInt();
		if (a == 10 || b == 10 || a + b == 10) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		scan.close();
		
		
		
		
		
	}

}
