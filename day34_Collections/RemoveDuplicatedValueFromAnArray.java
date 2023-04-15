package day34_Collections;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatedValueFromAnArray {

	public static void main(String[] args) {
		int[] num = {1,2,4,4,4,4,3,5};
		
		Set<Integer> numSet = new HashSet<>();
		for (int a : num) {
			numSet.add(a);
		}
		
		System.out.println(numSet);
	}

}
