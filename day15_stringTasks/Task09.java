package day15_stringTasks;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
//		Task9
//		Ask user to enter two words. 
//		Print first word without its first character
//		then print the second word without its first character. 
//		Input: apple banana Output: ppleanana
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first word...");
		String first = scan.nextLine();
		System.out.println("Enter second word...");
		String second = scan.nextLine();
		String word1 = first.substring(1);
		String word2 = second.substring(1);
		System.out.println(word1+word2);
		scan.close();
		
	}

}
