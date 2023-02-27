package day08_2ndReview;

public class CompoundAssignmentOperators {

	public static void main(String[] args) {
		
		// = , += , -= , *= , /=
		// used to assign value to variable
		// only operation that reads from right to left
		
		int x = 2;
		x+= 2;
		System.out.println(x);
		// a++; is same as a += ;
		
		int a = 1;
	    a += 2; // a = a + 2
	    a *= 4;
	    a /= 2;
	    System.out.println(a);

	    a++; // a += 1;
	    a--; // a -= 1;

	    // a -= 3;    a = a - 3
	    // a *= 4;    a = a * 4
	    // a /= 5;    a = a / 5
	}

}
