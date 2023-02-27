package day04_1stReview;

public class Main {

	// Pascal notation
	// OneTwoThreeFour

	public static void main(String[] args) { // method
		// Camel case notation
		// oneTwoThreeFour

		// variable - box to hold value
		// dataType varName = value;
		String fruit = "Apple";
		int age = 43;
		double price = 10.95;
		boolean isActive = true;
		char a = 'a';
		// Name variable
		// - cannot start with number
		// - special char that can start with _ and $
		// - camel case
		// - cannot space & special char
		// - cannot use reserve java keyword
		// - cannot use the same variable name (in the same scope)
//	        String fruit = "Orange"; this will not work (duplicate token)

//	        String fruit2 = "Orange";
//	        { // code block
//	            System.out.println(fruit2);
//	            String name = "leng";
//	        }
//	        System.out.println(name); // this will not work, cannot access local var

		// Variable

		int number; // Declare
		// do something
		// ...
		number = 10; // assign value
		System.out.println(number);
		number = 30; // reassign value
		System.out.println(number);

		// String - sequence of character in " "
		// int - number
		// double - float number / decimal / fraction
		// boolean - true/ false
		// char - single character in ' ' / integer(Hex ASCII)

		// Primitive Type (8 types)
		// Number - byte, short, int, long
		// Float - float, double
		// Character - char
		// Boolean - boolean

		// Non-Primitive / Reference Type
		// String
		// Array
		// Object - everything else
		// any classes

	}
}
