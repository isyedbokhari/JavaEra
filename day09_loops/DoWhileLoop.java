package day09_loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		// Do While and While loop are similar except that Do While loop will run the code block at least once even if the condition after 'while' is false
		int a = 100;
		do {
			System.out.println(a);
			a--;
		} while (a >= 50);
		System.out.println("======================");
		int b = 100;
		do {
			System.out.println(b);
			b--;
			if (b == 49) {
				break;
			}
		} while (b >= 0);
		System.out.println("==============");
		
		int c = 100;
		do {
			
			System.out.println(c);
			c-=2;
			
		} while (c  >= 1 );
		
		System.out.println("=================");
		
		int d = 100;
		do {
			if (d % 2 == 0) {
				System.out.println(d);
			}
			
			d--;
			
		} while (d  >= 1 );
		
	}

}
