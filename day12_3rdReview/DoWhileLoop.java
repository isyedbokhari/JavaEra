package day12_3rdReview;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		// do while loop
	    do {
	      System.out.println("Enter number between 0 and 10");
	      input = sc.nextInt();
	    } while (!(input <= 10 && input >= 0));

	    System.out.println("Input: " + input);


	    int y = 0;
	    int counter = 5;
	    do {
	      System.out.println("do something");
	      y++;
	    } while (y < counter);
	}

}
