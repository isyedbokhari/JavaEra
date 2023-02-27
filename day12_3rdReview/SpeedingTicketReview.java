package day12_3rdReview;

public class SpeedingTicketReview {

	public static void main(String[] args) {
		
		int fine = 0;
	    final int THIRTY = 30, FIFTY = 50, UNDERAGE_FINE = 300;
	    //    int currentSpeed = 55;
	    //    int speedLimited = 25;
	    int overSpeed = 21; // currentSpeed - speedLimited
	    boolean isConstruction = true;
	    int age = 18;

	    if (overSpeed < 5) fine = 0; // no fine, less than 5 mph
	    else if (overSpeed <= 20) { // 20mph or less
	      fine = overSpeed / 5 * THIRTY; // charge $30 per every 5mph
	    } else /* if (overSpeed > 20) */ { // more than 20mph over limit
	      fine = overSpeed / 5 * FIFTY; // charge $50 per every 5mph
	    }
	    // 200

	    if (isConstruction) // is it in construction zone
	      fine *= 2; // fine = fine * 2;
	    // 400
	    if (age < 21 && overSpeed > 20) // underage + over 20 mph
	      fine += UNDERAGE_FINE;
	    // 700
	    
	    System.out.println("fine: $" + fine);
	}

}
