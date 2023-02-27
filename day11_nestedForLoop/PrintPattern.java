package day11_nestedForLoop;

public class PrintPattern {

	public static void main(String[] args) {

		for (int i = 1; i >= 1; i--) {
			System.out.println("*");
			for (int a = 1; a >= 1; a--) {
				System.out.println("**");
				for (int b = 1; b >= 1; b--) {
					System.out.println("***");
					for (int c = 1; c >= 1; c--) {
						System.out.println("****");
					}
					for (int d = 1; d >= 1; d--) {
						System.out.println("*****");
					}
				}
			}
		}
		System.out.println("====================");
		// Task1
//      *****
//      ****
//      ***
//      **
//      *

		for (int row = 4; row >= 0; row--) {

			for (int starCount = row; starCount >= 0; starCount--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
System.out.println();
System.out.println();
System.out.println();

		for (int d = 1; d >= 1; d--) {
			System.out.println("* 2 3 4 5");
		}
		for (int e = 1; e >= 1; e--) {
			System.out.println("1 * 3 4 5");
			for (int f = 1; f >= 1; f--) {
				System.out.println("1 2 * 4 5");
				for (int g = 1; g >= 1; g--) {
					System.out.println("1 2 3 * 5");
					for (int h = 1; h >= 1; h--) {
						System.out.println("1 2 3 4 *");

					}

				}
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int row = 1; row <= 5; row++) {
			for (int column = 1; column <=5 ; column++) {
				if (row == column) {
					System.out.print("* ");
				} else {
					System.out.print(column + " ");
				} 
			}System.out.println();
		} 
		
		
	}

}
