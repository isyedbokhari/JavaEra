package day24_mondayReviewWithIrfan;

import java.util.Arrays;

public class MethodTask {

public static void main(String[] args) {
	
		
		
		String str2[] = {"abc"};
		String reverse = "";
		for (String a : str2) {
			for (int i = a.length() -1 ; i >= 0; i--) {
				reverse += a.charAt(i);
				
				
			}
			System.out.println();
			if (reverse.equalsIgnoreCase(a)) {
				System.out.println("These strings are palindromes!");
			} else {
				System.out.println("These strings are not palindromes!");
			}
		}
		System.out.println();
		System.out.println(reverse);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
