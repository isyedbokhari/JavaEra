package day24_mondayReviewWithIrfan;

import java.util.Arrays;

public class ReversedStringArrayMethod {

	public static void main(String[] args) {
		String words[] = {"Syed", "Irfan", "Shafkat"};
		System.out.println(Arrays.toString(reversedArray(words)));
		
	}
	public static String[] reversedArray(String[] arr) {
		String reversedArr[] = new String[arr.length];
		int max = arr.length -1;
		for (int i = 0; i <= max; i++) {
			reversedArr[i] = arr[max - i];
		}
		return reversedArr;

	}
}

	
