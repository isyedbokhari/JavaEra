package day06_operators;

public class LogicalOperators {

	public static void main(String[] args) {
int a = 1 , b = 2 , c = 3;
        
        // Truth table -- > &&(AND)
        /*
        ConditionA ConditionB Result
           true      true      true
           true      false     false
           false     true      false
           false     false     false
        */
    
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        boolean conditionA = a < b;
        boolean conditionB = a+b == c;
        System.out.println(conditionA && conditionB );
        System.out.println(conditionA && conditionB && a * b == b);
        System.out.println(conditionA && conditionB && a * b == b && c/b == a);
        
        System.out.println(conditionA && conditionB && a * b == b && c/b > a);
        
        
        
     // Truth table -- > ||(OR)
        /*
         * ConditionA ConditionB Result 
         * true true true 
         * true false true 
         * false true true
         * false false false
         */

        a = 5;
        b = 7;
        c = 10;

        conditionA = a > b; // false
        conditionB = a < b; // true
        System.out.println(conditionA && conditionB); // false
        System.out.println(conditionA || conditionB); // true

        System.out.println(conditionA || conditionB || a * b == b || c / b > a);
        System.out.println(conditionA || c / a > b || a * b == b || c / b > a );
        
        System.out.println(conditionA || c / a > b || a * b == b || c / b > a || c/a ==2 );
        
        a = 1 ;
        b = 2 ;
        c = 3 ;
        conditionA = a > b; // false
        conditionB = a * b == b; //true
        boolean conditionC = a + b == c;
        boolean conditionD = c - a == b; 
        
        System.out.println(conditionA || conditionB && conditionC && conditionD);
        System.out.println(conditionA || conditionB && conditionC && conditionD || a > c);
//                                false   ||        true                        ||    true        
        
        
        // !(NOT)
        
//           true   false
//           !true-- false
//           !false -- true
        
        System.out.println(conditionA);
        System.out.println(!conditionA);
        System.out.println(!!!!!!!!!!!!!conditionA);
        
	}

}
