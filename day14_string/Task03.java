package day14_string;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		/*
        `write a program that asks user to enter a sentence. 
        then print the first & last characters of the sentence

        Example:
         Input: Welcome To TechCircle 
         output: We `
 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a sentence...");
		String sentence = scan.nextLine();
		
		System.out.print(sentence.charAt(0));
		System.out.print(sentence.charAt(sentence.length() -1));
		
		
		
		
	}

}
