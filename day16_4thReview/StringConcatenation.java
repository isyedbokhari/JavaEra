package day16_4thReview;

public class StringConcatenation {

	public static void main(String[] args) {
		
		System.out.println("a" + 2);
	    System.out.println(2 + "a");
	    System.out.println("str" + 10 + false);
//	                                          (                 )
	    System.out.println("Hello" + " World" + "!!".toUpperCase());


	    String shortString = "str";
	    int number = 100;

	    String result1 = shortString + number + 50; //
	    String result2 = number + 50 + shortString; //
	    System.out.println(result1);
	    System.out.println(result2);
	}

}
