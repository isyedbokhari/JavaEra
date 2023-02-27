package day09_loops;

public class WhileLoop {

	public static void main(String[] args) {
		 
		int i = 10;
		
		while (i > 0) {
			System.out.println(i--);
			System.out.println(i);
		}
		System.out.println("===================");
		int a = 10;
		while (a < 11) {
			System.out.println(a);
			a--;
			if (a == 1) {
				break;
			}
		}
		
		
	}

	
	
	

}