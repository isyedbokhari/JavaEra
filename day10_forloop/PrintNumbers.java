package day10_forloop;

public class PrintNumbers {

	public static void main(String[] args) {
		
		int a = 20;
		
		do {
			System.out.println(a);
			a++;
		} while (a <= 30);
		
		System.out.println("===============");
		
		for (int i = 20; i <= 30; i++) {
			System.out.println(i);
		}
	}

}
