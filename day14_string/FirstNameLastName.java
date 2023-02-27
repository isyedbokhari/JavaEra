package day14_string;

public class FirstNameLastName {

	public static void main(String[] args) {

String email ="john.smith@gmail.com";

// Write program to get first and last name of the person 

String firstName = email.substring(0,email.indexOf('.'));

System.out.println(firstName);

String lastName = email.substring(5,10);
System.out.println(lastName);

lastName = email.substring(email.indexOf('.') +1 , email.indexOf('@') );
System.out.println(lastName);

	}

	
	

}
