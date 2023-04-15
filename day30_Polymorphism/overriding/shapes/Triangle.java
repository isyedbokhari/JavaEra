package day30_Polymorphism.overriding.shapes;

public class Triangle extends Shape { // subclass

	
	//How to override a method?
	// The method in the subclass must have the same name
	// return type, and parameter list as the method in the parent class
	
	@Override
	public void area() {
		System.out.println("Area of a Triangle");
	}
}
