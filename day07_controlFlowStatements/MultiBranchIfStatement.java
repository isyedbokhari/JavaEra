package day07_controlFlowStatements;

import java.util.Scanner;

public class MultiBranchIfStatement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of the day...");
		int day = scan.nextInt();

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wwdnesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		}

		else {
			System.out.println("Invalid number of the day");
		}
		
		scan.close();
		
		System.out.println("----------------------------");
		
		int a = 3;
        String name = "";

        if (a == 1) {
            name = "Monday";
        } else if (a == 2) {
            name = "Tuesday";
        } else if (a == 3) {
            name = "Wednesday";
        } else if (a == 4) {
            name = "Thursday";
        } else if (a == 5) {
            name = "Friday";
        } else if (a == 6) {
            name = "Saturday";
        } else if (a == 7) {
            name = "Sunday";
        } else {
            System.out.println("Invalid number of the day");
        }

        System.out.println("its " + name);
	}

}
