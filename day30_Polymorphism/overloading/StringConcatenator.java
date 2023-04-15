package day30_Polymorphism.overloading;

public class StringConcatenator {
// TASK 1
	

	/*Create a class called StringConcatenator.
	Inside the class, create four different methods for concatenating strings:
	
	A method called concatenate that takes two strings as parameters and returns their concatenation.

	
	
	
	
	A method that takes three strings as parameters and returns their concatenation.
	A method that takes four strings as parameters and returns their concatenation.
	A method called concatenate that takes an array of strings as a parameter and returns their concatenation.
		 */	
	
	
	// 	A method called concatenate that takes two strings as parameters and returns their concatenation.
	
	public String concatenate(String str1, String str2) {
		return str1 + str2;
	}
	
	public String concatenate(String str1, String str2, String str3) {
		return str1+str2+str3;
	}
	public String concatenate(String str1, String str2, String str3, String str4) {
		return str1+str2+str3 + str4;
	}
	public String concatenate(String[] arr) {
		String afterConcatenation = ""; // Local Variable
		
		for(String eachStr : arr) {
			afterConcatenation += eachStr;
		}
		return afterConcatenation;
	}
	
	public static void main(String[] args) {
		StringConcatenator sc = new StringConcatenator();
		
		String str1 = "Hello!";
		String str2 = "Cohort 14";
		String str3 = "I Love TechCircle";
		String str4 = "I'm happy to be part of this journey";
		String[] strArr = {"HELLO", "TechCircle", "I'm from Cohort14", "Learnig Overloading"};
		
		
		System.out.println("With 2 Strings: " + sc.concatenate(str1, str2));
		System.out.println("with 3 Strings: " + sc.concatenate(str1,str2,str3));
		System.out.println("with 4 Strings: " + sc.concatenate(str1,str2,str3, str4));
		
		
		System.out.println("Array of Strings: " + sc.concatenate(strArr));
		
		
	}
	
	
}
