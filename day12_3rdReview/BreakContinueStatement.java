package day12_3rdReview;

public class BreakContinueStatement {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++ ) {
		      System.out.println("Hi");

		      if (i == 3) continue;

		      System.out.println(i);
		      System.out.println("End of the loop");
		    }
	}

}
