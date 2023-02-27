package day15_stringTasks;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
//		Task10
//		ask the user to enter a word. 
//		if the word ends with "ly", print "really???" ,  
//		otherwise, print "never mind"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word...");
		String word = scan.nextLine();
		String lastTwo = word.substring(word.length()-2);
		if (lastTwo.equals("ly")) {
			System.out.println("Really???");
		} else {
			System.out.println("Nevermind!");
		}
		scan.close();
		
	}

}
