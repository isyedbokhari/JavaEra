package day25_classAndObject;

public class DreamCarObject {

	public static void main(String[] args) {
		DreamCar bentley = new DreamCar();
		
		bentley.make = "Bentley";
		bentley.model = "Continental GT";
		bentley.year = 2023;
		bentley.price = 250000;
		
		bentley.drive();
		bentley.start();
		bentley.stop();
	}

}
