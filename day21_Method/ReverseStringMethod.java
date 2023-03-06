package day21_Method;

public class ReverseStringMethod {

	
	public static void Reverse() {
		String a = "abc";
		String b = "";
		for (int i = a.length() -1 ; i >= 0; i--) {
			 b += a.charAt(i);
		}
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		
		
		Reverse();
	}

}
