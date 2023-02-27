package day12_3rdReview;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// number the number that can be divisible by 1 and itself
	    int number = 4;
	    
	    boolean isPrime = true;
	    
	    for (int i = 2; i < number; i++) {
	      if (number % i == 0) {
	        isPrime = false;
	        break;
	      }
	    }

	    System.out.println(number + " is prime: " + isPrime);
	}

}
