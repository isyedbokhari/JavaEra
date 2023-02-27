package day12_3rdReview;

import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {
		
		// Infinite Loop, receive input from user

	    Scanner sc = new Scanner(System.in);
	    int input;
	    while (true) {
	      System.out.println("Enter number between 0 and 10");
	      input = sc.nextInt();

	      if (input <= 10 && input >= 0) {
	        System.out.println("input is valid");
	        break;
	      }
	    }

	    System.out.println("Input: " + input);
	    
	    
	    
	    System.out.println("========================");
	    
	    
	    
	   // while (boolean_condition) {
//	      // run until the condition => false
	//
//	      // end
//	    }

	    int i = 0;
	    int max = 10;

	    while (i < max) { // condition need to be true
	      System.out.println("hi" + i);
//	      i++; // increment
	    }

	    System.out.println(i);
	}

}
