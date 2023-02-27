package day06_operators;

public class TernaryOperator {

	public static void main(String[] args) {
		
		// Ternary operator is also called a conditional operator
		// its represented as " ? "
		
		int x = (10 <= 9) ? 30 : 40;
		// this expression is read as following:
		// if 10 is equal to or less than 9 then assign 30 to the variable "a" otherwise assign 40 to variable "a"
		System.out.println(x);
		
		int a , b;
		
		a = 10;
		// b = (condition) ? true block : false block
		
		b = (a == 1) ? 5 : 60;
		System.out.println(b);
		
		// Odd or Even
		
		int d = 20;
		String oddOrEven = (d % 2 == 0) ? "Even" : "Odd";
		System.out.println(oddOrEven);
		
		oddOrEven = (d % 2 != 0) ? "Odd" : "Even";
		System.out.println(oddOrEven);
				
	}

}
