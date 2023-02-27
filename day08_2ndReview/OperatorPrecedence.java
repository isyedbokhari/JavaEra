package day08_2ndReview;

public class OperatorPrecedence {

	public static void main(String[] args) {
		
		// PEMDAS = Parentheses . Exponents , Multiplication , Division , Addition , Subtraction
		// if they have same priority, always go LEFT to RIGHT
		// smaller integer / bigger integer always = zero
		
		double a = 1;
		double b = 2;
		System.out.println(a/b);
		
		int result = 1 * 2 + 3 / 1;
	    //            2   +    3    = 5
	    System.out.println(result);
	    // 1. ()
	    // 2. * /
	    // 3. + -
	    // if they have the same priority always go left -> right
	    int result3 = 1/3;
	    System.out.println(result3);
	    // [for int] smaller number divide by bigger number = 0
	    
	    int result2 = 1 / 2 * 3 + 4;
	    //              0 * 3
	    //                0     + 4  = 4
	    System.out.println(result2);
	}

}
