package day06_operators;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int num = 1;
		
		// using post-fix increment operator, its going to update the value in the next line rather than the same line
//		System.out.println(num++);
//		System.out.println(num);
		// using pre-fix increment operator, its going to update the value in the same line rather than the next line
//		System.out.println(++num);
//		
//		for (int a = 1; a < 10;  )
//			System.out.println(a++);
		
		int x= 5;
		System.out.println(x--); //5
		System.out.println(x--); //5 - 1 = 4
		System.out.println(--x); //3 - 1 = 2
	}

}
