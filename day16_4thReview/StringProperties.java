package day16_4thReview;

public class StringProperties {

	public static void main(String[] args) {
		
		// String => reference
	    // immutable = un-changeable
	    String myStr = "Hello World";
	    String otherStr = "Hello World";

	    otherStr = "Java";

	    System.out.println(myStr.toUpperCase());
	    System.out.println(myStr);

	    myStr = myStr.toUpperCase();
	    // reassign myStr => 'HELLO WORLD'
	    // myStr will not change to upper case.

	    String anotherStr = "Hello World";


	    // Creating String
	    String someStr = "Say hi"; // String literal
	    String strObj = new String("Say hi"); // always use new keyword for reference type. this is redundant

	    // All reference type can be null
	    String nullStr = null; // it is null
	}

}
