package day25_classAndObject;

public class Person2Object {

		public static void main(String[] args) {

	        Person2 abdullah = new Person2(); // class instantiation

	        // assign value to instance variables
	        abdullah.age = 20;
	        abdullah.name = "Sharuhan";
	        abdullah.occupation = "SDET";

//	        abdullah.whatIsYourOccupation();
	        System.out.println(abdullah.whatsYourName());
	        System.out.println(abdullah.whatIsYourOccupation());
	        System.out.println(abdullah.howOldAreYou());

	        Person payz = new Person();
	        payz.name = "Payzulla Hasan";
	        payz.age = 40;
	        payz.occupation = "Developer";
	        
	        
	        
	}

}
