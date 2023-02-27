package day16_4thReview;

public class Task_Colors {

	public static void main(String[] args) {
		
		/**
	     * Given a string of even length,
	     * return a string made of the middle two chars,
	     * so the string "string yields "ri".
	     * The string length will be at least 2.
	     */

	    // 2 4 8 10 100
//	                  012345678901
	    String myStr = "hello_world!";
	    myStr = "12";
	    //
	    int middleIndex = myStr.length()/2;
	    System.out.println("" +
	        myStr.charAt(middleIndex - 1) + myStr.charAt(middleIndex));
	}

}
