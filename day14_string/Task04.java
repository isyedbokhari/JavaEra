package day14_string;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word...");
		String word = scan.nextLine();
		char first = word.charAt(0);
		char last = word.charAt(word.length() - 1);
		if (first == last) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal!");
		}
		System.out.println("======================");

		String str = "technology";
		char firstLetter = str.charAt(0);
//char lastLetter = str.charAt(4);
		char lastLetter = str.charAt(str.length() - 1);

		if (firstLetter == lastLetter) {
			System.out.println("same");
		} else {
			System.out.println("Not same");
		}

	}

}
