package day35_ReviewWithIrfan;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task04 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.addAll(Arrays.asList(1,2,3));
		
		int max = Collections.max(set);
	}

}
