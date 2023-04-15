package day29_Inheritance;

public class Car {
	String brand;
	String model;
	int year;
	int price;
	String color;
	int miles;
	
	public Car() {
		
	}
	
	public void start() {
		System.out.println(year + " " + brand + " " + model + " " + " just started");
	}
	
	public void drive() {
		System.out.println(year + " " + brand + " " + model + " " + " just drove away");
	}
	
	
}
