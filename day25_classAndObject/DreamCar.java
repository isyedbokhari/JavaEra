package day25_classAndObject;

public class DreamCar {

	//instance variable
	String make;
	String model;
	String color;
	double price;
	int year;
	
	//instance method
	public void drive() {
		System.out.println("Driving: " + year + " " + make + " " + model);
	}
	
	public void start() {
		System.out.println(year + " " + make + " " + model + " has started!");
	}
	
	public void stop() {
		System.out.println(year + " " + make + " " + model + " has stopped!");
	}

}
