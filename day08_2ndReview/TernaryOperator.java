package day08_2ndReview;

public class TernaryOperator {

	public static void main(String[] args) {
		
		// Ternary Operator ==> ?
		// Its also called a Conditional Operator
		// dataType varName = (condition) ? (result 1) : (result 2)
		
		// if the condition is true its gonna give result 1 otherwise result 2
		
		int a = 10;
		int b = (a == 1) ? 20 : 40;
		System.out.println(b);
		
		// program to approve the loan
	    // income > 100,000 = 'approve'
	    // income <= 100,000 = 'not approve'

	    int income = 110000;
	    String approval = income > 100000 ? "approve" : "not approve";

//	    String approval = "not approve";
//	    if (income > 100000) {
//	      approval = "approve";
//	    }

	    System.out.println("You are "+approval+" for our loan.");

	    /// Ternary Operator
	    // boolean_expression ? "value 1" : "value 2"
	    // true                 "value 1"
	    // false                            "value 2"

	// Example code to find max value between 2 variables
	    int x = 1000;
	    int y = 200;
	    int max = x > y ? x : y;
	    System.out.println("max = " + max);
		
		
	}

}
