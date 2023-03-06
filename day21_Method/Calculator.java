package day21_Method;

public class Calculator {

	public static void addition(int a , int b) {
		System.out.println(a + b);
	}
	public static void subtraction(int a , int b) {
		System.out.println(a - b);

	}
	public static void multiplication(int a , int b) {
		System.out.println(a * b);

	}
	public static void division(int a , int b) {
		System.out.println(a / b);

	}
	public static void modulus(int a , int b) {
		System.out.println(a % b);

	}

	public static void calculator(int a , int b, String operator) {
        if (operator.equals("+")) {
            addition(a,b);
        }else if (operator.equals("-")) {
            subtraction(a,b);
        }else if (operator.equals("*")) {
            multiplication(a,b);
        }else if (operator.equals("/")) {
            division(a,b);
        }else {
            modulus(a,b);
        }
    }
	
	
	public static void main(String[] args) {
		
		addition(5 , 10);
		subtraction(5 , 10);
		multiplication(5 , 10);
		division(5 , 10);
		modulus(5 , 10);
		System.out.println("==========");
		calculator(1,2,"+");
        calculator(1,2,"*");
        calculator(1,2,"-");
        calculator(1,2,"/");
		
	}

}
