package day05_operators;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
//		        int a = -25; 
//		        int b = 7;
//		        
//		        System.out.println(a > b);
//		        
//		        System.out.println(true);
//		        System.out.println(false);

		Scanner scan = new Scanner(System.in); // instance of scanner object

		System.out.println("Enter value a");
		// int a = -25;
		int a = scan.nextInt();

		System.out.println("Enter value b");
		// int b = 7;
		int b = scan.nextInt();
		System.out.println(a > b);

		scan.close();

	}

}
