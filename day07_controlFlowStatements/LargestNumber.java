package day07_controlFlowStatements;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value...");
		double n1 = scan.nextDouble();
		System.out.println("Enter value...");
		double n2 = scan.nextDouble();
		System.out.println("Enter value...");
		double n3 = scan.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 is greater!");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("n2 is greater!");
		} else {
			System.out.println("n3 is greater!");
			scan.close();
			
			System.out.println("------------------");
			
			double a = 21.0, b = 4.5, c = 5.3, maxValue = 0;
	        
	        //double maxValue = 0;
	        
	        if (a > b) {
	            if (a > c) {
	                maxValue = a;
	            }else {
	                maxValue = c;
	            }
	            
	        }else {
	            if (b > c) {
	                maxValue = b;
	            }else {
	                maxValue = c;
	            }
	        }
	        
	        if (a > b && a > c) {
	            maxValue = a;
	        } else if (b > a && b > c) {
	            maxValue = b;
	        }else {
	            maxValue = c;
	        }
		}
	}

}
