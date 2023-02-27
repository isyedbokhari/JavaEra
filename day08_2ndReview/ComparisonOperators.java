package day08_2ndReview;

import java.util.Scanner;

public class ComparisonOperators {

	public static void main(String[] args) {
		
		// == != > < >= <=
	    // can only use with number (int / double)
		// return boolean
		
	    System.out.println( 4 >= 4);

	    // sometime, you can use with string (not recommend)
	    System.out.println("Hi" == "Hi");

	    Scanner sc = new Scanner(System.in);
	    String input = sc.next();
	    System.out.println(input.equals("Hi")); // strict case
	    System.out.println(input.equalsIgnoreCase("Hi")); //
	    // stringVar.equals("Hi")

	    // Do not use == with string
	    // use .equals() instead
	}

}
