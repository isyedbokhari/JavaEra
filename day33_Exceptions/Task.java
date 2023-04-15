package day33_Exceptions;

public class Task {

	public static void main(String[] args) {
		Task t = new Task();

		try {

			for (int i = 1; i < 4; i++) {
				// t.methodA(i);
				System.out.println(i);
			}

			t.methodA(2);

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		}

		System.out.println("line number 33");

	}

	public void methodA(int num) {

		if (num == 1) {
			throw new ArithmeticException();
		}

		if (num == 2) {
			throw new NullPointerException();
		}

		if (num == 3) {
			throw new ArrayIndexOutOfBoundsException();
		}

	}
}
