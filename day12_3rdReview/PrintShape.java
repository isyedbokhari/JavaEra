package day12_3rdReview;

public class PrintShape {

	public static void main(String[] args) {
		
//	     1
	    //    22
	    //   333
	    //  4444
	    // 55555


	    int number = 9;
	    String space = " ";

	  //  outer:
	    for (int i = 1; i <= number; i++) { // i will be 1 - 5

	  //    space:
	      for (int j = (number-1) - i ; j >= 0 ; j--) {
	        System.out.print(space);
	      }

	  //    number:
	      for (int j = 0 ; j < i; j++) {
	        System.out.print(i);
	      }

	      System.out.println();
	    }
	}

}
