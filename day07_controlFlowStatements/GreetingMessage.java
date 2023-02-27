package day07_controlFlowStatements;

import java.util.Scanner;

public class GreetingMessage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the time...");
		
		int time = scan.nextInt();
		
		if (time >=5 && time < 12) {
			System.out.println("Good Morning!");
		} else if (time >= 12 && time <= 17 ) {
			System.out.println("Good Afternoon!");
		} else if (time > 17 && time <= 20) {
			System.out.println("Good Evening!");
		} else {
			System.out.println("Good Night!");
		}
		scan.close();
	}

}
