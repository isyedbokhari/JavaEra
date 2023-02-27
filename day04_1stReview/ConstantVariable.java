package day04_1stReview;

public class ConstantVariable {

	public static void main(String[] args) {
		// Constant
        // Variable that cannot be reassign
        // use when declare some fact
        // use with variable that value will not be changed thru out the program
        // naming convention will use screaming sneak case
        // ONE_TWO_THREE_FOUR
        final double MILK_PRICE = 2.95;
        final double PI = 3.14;
//        MILK_PRICE = 3.5; // final var cannot be reassign
        
        
        // Swapping number using addition / subtraction method
        int x = 2;
        int y = 3;
        System.out.println(x);
        System.out.println(y);
        x = x + y; // 5
        y = x - y; // 2
        x = x - y; // 3
        
        System.out.println(x);
        System.out.println(y);
        
        // Swapping strings using a temporary variable
        
        String flight = "Etihad";
        String secondFlight = "Qatar";
        String temp ="";
        
	}

}
