package day08_2ndReview;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		
		// if statement
	    /*

	    if (boolean_expression) {
	      // code will run if the expression == true
	    } else {
	      // it will run when the boolean condition == false
	    }

	    */

	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
//	    -4 > 0
	    if (x > y) {
	      System.out.println(x + " is greater than " + y);
	    } else {
	      System.out.println(x + " is not greater than " + y);
	    }

	    System.out.println("end of the code");
	  
	    
	}

}
