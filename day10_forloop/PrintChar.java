package day10_forloop;

public class PrintChar {

	public static void main(String[] args) {
		/*
		 * Print: A~Z a~z Z~A z~a
		 */

		for (int i = 'A'; i <= 'Z'; i++) {
			char letter = (char) i;
			System.out.println(letter);
		}

		System.out.println("------------");
		for (int i = 'a'; i <= 'z'; i++) {
			char letter = (char) i;
			System.out.println(letter);
		}

		System.out.println("---------------------------");
		for (int i = 'Z'; i >= 'A'; i--) {
			char letter = (char) i;
			System.out.println(letter);
		}

		System.out.println("---------------------------");
		for (int i = 'z'; i >= 'a'; i--) {
			char letter = (char) i;
			System.out.println(letter);
		}
	}
}
