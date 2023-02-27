package day07_controlFlowStatements;

public class IfStatementReview {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		int c = 5;
		int max = 0;
		if (a > b && a>c) {
			max = a;
		} 
		System.out.println(max);
		
		// Even and Odd number count
		int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int E = 5;
        
        int evenNumCount = 0;
        int oddNumCount = 0;
        
        if (A % 2 == 0 ) {
            evenNumCount++;
        }else {
            oddNumCount++;
        }
        
        if (B % 2 == 0 ) {
            evenNumCount++;
        }else {
            oddNumCount++;
        }
        
        if (C % 2 == 0 ) {
            evenNumCount++;
        }else {
            oddNumCount++;
        }
        
        if (D % 2 == 0 ) {
            evenNumCount++;
        }else {
            oddNumCount++;
        }
        
        if (E % 2 == 0 ) {
            evenNumCount++;
        }else {
            oddNumCount++;
        }
        System.out.println("------------");
        System.out.println("evenNumCount "+evenNumCount); 
        System.out.println("oddNumCount "+oddNumCount);
	}

}
