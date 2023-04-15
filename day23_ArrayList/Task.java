package day23_ArrayList;

public class Task {

	public static void main(String[] args) {
		
		/*
        Write a program that can verify if a password is a strong password. 
        Characteristics of strong passwords are: 
        1.1 Password must be at least have 8 characters long and should not contain space 
        1.2 PassWord should at least contain one upper case letter 
        1.3 PassWord should at least contain one lower case letter 
        1.4 Password should at least contain one special characters 
        1.5 Password should at least contain a digit
        */
		
		String password = "hdbsbdc";
		boolean charLength = false;
		boolean upperCase = false;
		boolean lowerCase = false;
		boolean hasDigit = false;
		boolean hasSpecialChar = false;
		
		for (int i = 0 ; i < password.length(); i++) {
			char letter = password.charAt(i);
			
			if (letter >= 'A' && letter <= 'Z') {
				upperCase = true;
			} if (letter >= 'a' && letter <= 'z') {
				lowerCase = true;
			} 
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
