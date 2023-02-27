package day15_stringTasks;

import java.util.Scanner;

public class EmailTask01 {

	public static void main(String[] args) {
		
		 /*
         * Task12
        ` Create a class calledEmailTask1. Assume that email address is constructed by person's first name and followed by an underscore and last name.
        
            Write a program that can swap first name with last name in the email (Seperated by an underscore).
            If the email doesn't contain an underscore print the given input email.
        
                Ex:
                    input: mike_tyson@gmail.com
                    output: tyson_mike@gmail.com
        `

         */
        
        String email = "mike_tyson@gmail.com";
        
        int index_ = email.indexOf('_');
        
        String fristName = email.substring(0,index_);
        
        System.out.println(fristName);
        
        String lastName = email.substring(index_ + 1, email.indexOf('@'));
        System.out.println(lastName);
        
        String domain = email.substring(email.indexOf('@'));
        System.out.println(domain);
        
        
        String newEmail = lastName.concat("_").concat(fristName).concat(domain);
        
        System.out.println(newEmail);
		
	}

}
