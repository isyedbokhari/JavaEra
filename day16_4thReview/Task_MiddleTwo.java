package day16_4thReview;

public class Task_MiddleTwo {

	public static void main(String[] args) {
		
//		Given a string of even length, 
//		return a string made of the middle two chars,
//		so the string "string" yields "ri". 
//		The string length will be at least 2.
		
		/**
	     * Given a string, if the string begins with "red" or "blue"
	     * return that color string, otherwise return
	     * the empty string.
	     */
	    String myStr = "blue";
	    final String RED = "red";
	    final String BLUE = "blue";
	    String result = "";

	    // if the string begins with "red" or "blue"
	    if (myStr.startsWith(RED))
	      result = myStr.substring(0,RED.length());
	    else if (myStr.startsWith(BLUE))
	      result = myStr.substring(0, BLUE.length());

	    System.out.println(result);
		
		
		
		
	}

}
