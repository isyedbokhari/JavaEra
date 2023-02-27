package day10_forloop;

public class ForLoop {

	public static void main(String[] args) {
		
//      syntax:
//		for (declare variable ; condition ; increment or decrement) {
//			your code
//		}
		for (int i = 10 ; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("=====================");
		for (int i = 10 ; i >= 1; i--) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}
		System.out.println("==============");
		
		for (int a = 1; a > 0; a--) {
			System.out.println("*****");
			System.out.println("****");
			System.out.println("***");
			System.out.println("**");
			System.out.println("*");
			
			System.out.println("=====================");
			System.out.println("=====================");
			System.out.println("=====================");
			System.out.println("=====================");
			System.out.println("=====================");

		
//	        Write a program to print the patern below on the console
//	         *****
//	         ****
//	         ***
//	         **
//	         *
	        
	        
	        String str1 = "*";
	        String str2 = "**";
	        String str3 = "***";
	        String str4 = "****";
	        String str5 = "*****";
	        
	        for(int i = 1; i <= 5; i++) {
	            
	            
	            switch(i) {
	            case 1:
	                System.out.println(str5);
	                break;
	            case 2:
	                System.out.println(str4);
	                break;
	                
	            case 3:
	                System.out.println(str3);
	                break;
	                
	            case 4:
	                System.out.println(str2);
	                break;
	                
	            case 5:
	                System.out.println(str1);
	                break;
	            }
	            
	            
	        }
		}
	}

}
