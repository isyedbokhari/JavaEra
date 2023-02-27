package day04_1stReview;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		// Scanner class => accept input from user
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your name?");

		int input = scanner.nextInt();
		// .next() = will capture the world until the white space
		// .nextLine() = will capture the whole line
		// .nextInt() = integer
		// .nextDouble() = double
		// .nextBoolean = boolean

		System.out.println(input + 2);

		scanner.close();

	}

}
