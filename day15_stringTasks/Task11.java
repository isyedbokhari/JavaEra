package day15_stringTasks;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
//		Task11
//		Ask user to enter a word. 
//		If the work starts with x, print the word without x. 
//		Input: xcode Output: code
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word...");
		String word = scan.nextLine();
		char letter = word.charAt(0);
		if (letter == 'x') {
			String word2 = word.substring(1);
			System.out.println(word2);
		} else {
			System.out.println(word);
		}
			scan.close();
		
	}

}
