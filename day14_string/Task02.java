package day14_string;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		/*
		 * Create a class called Reverse, write a program that will reverse a string.
		 * Your program should reverse a string only 5 characters long. If word is
		 * shorter, display message: "Too short!". If word is longer, display message:
		 * "Too long!". Otherwise, reverse this word and print out result into the
		 * console.
		 * 
		 * input: pizza output: azzip input:TechCircle output: too long input: car
		 * output: too short
		 * 
		 */
		

		Scanner scan = new Scanner(System.in);

        System.out.println("please enter a 5 letter word");
        String input = scan.next();
        String output = "";
        int length = input.length();
        
        if (length < 5) {
            System.out.println("Sorry too short");

        } else if (length > 5) {
            System.out.println("Sorry too long");

        }else {
            for (int i = input.length() - 1; i >= 0; i--) {
                output += input.charAt(i);
            }
        }
        System.out.println(output);
        
        scan.close();
		

	}

}
