package day15_stringTasks;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		
//		Task7
//		Write a method that asks user to enter a string.
//		if the string is empty, print: string is empty
//		if the string has more than 3 characters, 
//		print the last three characters 
//		if the string has less than or equal 3 characters, print the string itself
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string...");
		String word = scan.nextLine();
		if(word.length() == 0) {
			System.out.println("Its an empty string");
		} else if (word.length() > 3) {
			System.out.println(word.substring(word.length()-3));
		} else if (word.length() <= 3) {
			System.out.println(word);
		} scan.close();
	}

}
