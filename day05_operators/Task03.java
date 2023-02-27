package day05_operators;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter x...");
		int x = scan.nextInt();
		System.out.println("Enter y...");
		int y = scan.nextInt();
		System.out.println("Enter z...");
		int z = scan.nextInt();
		
		System.out.println(x == y);
		System.out.println(x == z);
		System.out.println(x != y);
		System.out.println(x != z);
		System.out.println(x < y);
		System.out.println(x < z);
		System.out.println(x > y);
		System.out.println(x > z);
		System.out.println(x <= y);
		System.out.println(x >= z);
		System.out.println(y == z);
		System.out.println(y != z);
		System.out.println(y < z);
		System.out.println(y > z);
		System.out.println(y <= z);
		System.out.println(y >= z);
		
		scan.close();
		

	}

}
