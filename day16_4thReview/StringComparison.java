package day16_4thReview;

public class StringComparison {

	public static void main(String[] args) {
		
		// Reference type cannot use  ==  or  !=
	    String str1 = "myString";
	    System.out.println(str1.equals("myString")); // true
	    System.out.println(str1.equalsIgnoreCase("mystring")); // true
	}

}
