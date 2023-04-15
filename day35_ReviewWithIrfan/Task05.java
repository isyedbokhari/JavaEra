package day35_ReviewWithIrfan;

import java.util.HashMap;
import java.util.Map;

public class Task05 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Ali", 1);
		map.put("Brian", 2);
		map.put("John", 3);
		int sum = 0;
		for (Integer m : map.values()) {
			sum += m;
		}
		System.out.println(sum);
	}

}
