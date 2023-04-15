package day24_mondayReviewWithIrfan;

import java.util.Arrays;

public class AnagramTask {

	public static void main(String[] args) {
		String c = "fairy tales";
		String d = "rail safety";
		System.out.println(isAnagram(c,d));
				
	}
	public static boolean isAnagram(String a, String b) {
		String str3 = a;
		String str4 = b;
		
		
		str3 = str3.toLowerCase();
		str4 = str4.toLowerCase();
		
		str3 = str3.replace(" " , "");
		str4 = str4.replace(" " , "");

		char a1[] = str3.toCharArray();
		char b1[] = str4.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		Boolean result = Arrays.equals(a1, b1);
		boolean finalResult = true;
		if (result) {
			finalResult = true;
		} else {
			finalResult = false;
		}
		return finalResult;
	}
	
	
}
