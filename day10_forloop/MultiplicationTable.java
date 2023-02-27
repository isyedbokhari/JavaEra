package day10_forloop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer...");
		
		int i = scan.nextInt();
		
		for (int a = 1 ;a <= 10 ; a++) {
			System.out.println(i + "*" + a + "=" + i*a);
		}
		scan.close();
	}

}
