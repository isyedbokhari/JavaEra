package day35_ReviewWithIrfan;

import java.util.ArrayList;
import java.util.Arrays;

public class Task03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.addAll(Arrays.asList(4,5,6,7,8,9));
		int sum = 0;

		for (Integer i : list) {
			sum += i;
		}
		System.out.println(sum);

	}

}
