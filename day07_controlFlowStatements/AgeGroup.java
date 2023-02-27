package day07_controlFlowStatements;

import java.util.Scanner;

public class AgeGroup {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age...");
		int age = scan.nextInt();
		
		if (age == 1 && age <= 2) {
			System.out.println("Infancy");
		} else if (age >=2 && age <= 4) {
			System.out.println("Toddler");
		} else if (age >= 5 && age <= 7 ) {
			System.out.println("Early school age");
		} else if (age >= 8 && age <= 12) {
			System.out.println("Middle school age");
		} else if (age >=13 && age <= 17) {
			System.out.println("Early adolescence");
		} else if (age >= 18 && age <= 25 ) {
			System.out.println("Later adolescence");
		} else if (age >= 25  && age <= 30) {
			System.out.println("Early adulthood");
		} else if (age >=30 && age <= 50) {
			System.out.println("Middle adulthood");
		} else if (age >= 50) {
			System.out.println("Later adulthood");
		}
		  else {
				System.out.println("Invalid age!");
			}
		
		
		scan.close();
	}

}
