package day19_arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		
//      syntax:
//      for (dataType variable: nameOfyourArray) {
//          
//      }
//  
  String fruits[] = { "apple", "orange", "kiwis", "banana", "ananas", "tawuz" };
  // for loop
  for (int i = 0; i < fruits.length; i++) {
      System.out.println(fruits[i]);
  }

  for (String s : fruits) {
      System.out.println(s);
  }

  int[] numbers = { 2, 3, 4, 5, 6 };

  for (int n : numbers) {

      if (n % 2 == 0) {
          System.out.println(n);
      }

  }
	}

}
