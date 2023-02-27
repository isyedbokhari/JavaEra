package day12_3rdReview;

public class ForLoop {

	public static void main(String[] args) {
		
		// For loop
	    //    for (
	    //        initialize_counter;
	    //        boolean_condition;
	    //        increment / decrement
	    //    ) {
	    //      // code here
	    //      // another
	    //    }

	    for (int i = 0, j = 0; i < 5; i++, j+=2 ) {
	      System.out.println("Hi");
	      System.out.println(i + " : " +j);
	    }

	    // i will not accessible outside for loop
	    //    System.out.println(i);
	}

}
