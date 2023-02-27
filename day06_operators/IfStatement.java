package day06_operators;

public class IfStatement {

	public static void main(String[] args) {
		
		int num = 2;
		int num2 = 9;
		
		if (num2 - num < 9) {
			
			System.out.println("num2 is bigger than num");
		} else {
			System.out.println("num is bigger");
		}
		
		int max = 0;
		
		if (num > num2) {
			max = num;
		} else {
			max = num2;
		}
		
		System.out.println(max);
		
		if (num > num2) {
			max = num;
		}
		
		if (num2 > num) {
			
			max = num2;
		}
		
		
		// Compound boolean expressions
		int score = 300;
	    if (score < 300 && score >= 0) {
	    	System.out.println("valid score");
	    } else {
	    	
	    	System.out.println("invalid score");
	    }

	}

}
