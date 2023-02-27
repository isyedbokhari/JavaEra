package day04_1stReview;

import java.util.Arrays;

public class PrimitiveVSReference {

	public static void main(String[] args) {
		// Copy value
		int x = 1;
		int y = x; // y = 1
		 System.out.println(x);
		 System.out.println(y);

		x = 2; // x = 2
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("==================");
		
		// Reference Type
		int[] a = { 1 };
		int[] b = a; // b = {1} // copy by address @
		System.out.println(a); // this will print the address of 'a'
		System.out.println(b); // this will print the address of 'b'

		a[0] = 2;
		// a = {2} // changing a value
		System.out.println(Arrays.toString(a)); // this will print the value of 'a'
		System.out.println(Arrays.toString(b)); // this will print the value of 'b'

	}
}
