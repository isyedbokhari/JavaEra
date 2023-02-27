package day14_string;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		/* write a program that can return the initials of the user

        ex:
            techcircle school

        output:
            T.S

    Note: Pay attention to the example output
    */
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name...");
		String name = scan.nextLine();
		System.out.println("Enter last name...");
		String lastName = scan.nextLine();
		name = name.toUpperCase();
		lastName = lastName.toUpperCase();
		char letter1 = name.charAt(0);
		char letter2 = lastName.charAt(0);
		System.out.println(letter1 + "." + letter2);
		scan.close();
		
		System.out.println("==========================");

String str = " techcircle school";
       str = str.trim();
       
       str = str.toUpperCase();
       
       System.out.println(str);
       
       System.out.println(str.charAt(0)+".");
       
       int index2 = str.indexOf(' ') +1;
       System.out.println(index2);
       
       
       
       System.out.println(str.charAt(0)+"."+str.charAt(index2));


       System.out.println("==========================");
       String str2 = "techcircle";
       String str3 = "school";
       
       str2 = str2.toUpperCase();
       str3 = str3.toUpperCase();
       
       char letter3 = str2.charAt(0);
       char letter4 = str3.charAt(0);
       
       System.out.println(letter3+"."+letter4);
	}   

}
