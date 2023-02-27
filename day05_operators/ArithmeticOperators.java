package day05_operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
	        //  + , - , * , / , % , ++ , --
	        
	        double a = 10f;
	        int b = 5;
	        
	        System.out.println(a + b); // 10 + 5 = 15
	        
	        //                 10 - 5 
	        System.out.println(a - b); 
	        
	        System.out.println(a * b);
	        
	        System.out.println(a / b);
	        
	        System.out.println(a / 3); 
	        
	        // % Remainder
	        
	        System.out.println(10 % 4); //(4 + 4 + 2)
	        System.out.println(10 % 2); // 0
	        
	        System.out.println(10 % 3); //1 (3 + 3 + 3 +1)
	        
	        System.out.println(11 % 2);  // 1
	        
	        System.out.println(15464651 % 2); //1
	        System.out.println(154646510 % 2);
	        
	        
	        // increment ++
	        int valueA = 5;
	        System.out.println(valueA);
	        
	        valueA = valueA + 1;
	        System.out.println(valueA); //6
	        
	        valueA ++; //valueA = valueA + 1;
	        System.out.println(valueA);//7
	        
	        
	        valueA ++;
	        valueA ++;
	        valueA ++;
	        System.out.println(valueA);// 10
	        
	        
	        
	        for (int i = 1 ; i < 11 ; i++) {
	            System.out.println(i);
	        }
	        
	        valueA = 5;
	        
	        System.out.println(valueA); // 5
	         
	        
	        // decrement -- a = a -1
	        
	        valueA = valueA -1;
	        System.out.println(valueA); // 4
	        
	        valueA --;
	        System.out.println(valueA); //3
	        valueA --;
	        valueA --;
	        System.out.println(valueA);
	        
	        
	        for (int i = 100; i >= 1; i--) {
	            System.out.println(i);
	        }
	}

}
