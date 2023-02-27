package day09_loops;

public class PrintAToZ {

	public static void main(String[] args) {
		
		char letter = 'a';
		int num = letter;
		System.out.println(num);
		
		char letter2 = 'z';
		int num2 = letter2;
		System.out.println(num2);
		
		while (num <= num2) {
			char letter3 = (char)num;
			num++;
			System.out.println(letter3);
			}
		
		System.out.println("=========================");
		
		char letter4 = 'A';
		int num3 = letter4;
		System.out.println(num3);
		
		char letter5 = 'Z';
		int num4 = letter5;
		System.out.println(num4);
		
		while (num3 <= num4) {
			char letter6 = (char)num3;
			num3++;
			System.out.println(letter6);
		}
		
		System.out.println("========================");
		
		int value = 122;
		while (value >= 97) {
			char alphabet = (char) value;
			System.out.println(alphabet);
			value--;
		}
	}

}
