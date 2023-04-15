package day30_Polymorphism.overloading;

public class AreaCalculator {

	// Overloading
	// The methods must have the same name as another method within the same class.
	// The method must have different parameters

	// The paramters must differ with these 3
	// 1- Number of Parameters
	// 2- Data Type of the parametets
	// 3- Order of the parameters

	// Ex:
	// Will work
	// add(int a, int b, int c);
	// add(int a, int b)

	// add(int a, double b)
	// add(double a, int b)

	// WILL NOT WORK
	// add(int a, int b);
	// add(int a, int b);

	// add(double a, double b);
	// add(double a, double b);

	// Instance Variabke
	public final double PI = 3.14;

	public double getArea(double radius) {
		System.out.print("Circle");
		return PI * radius * radius;
	}
	
	public double getArea(double a, double b) {
		System.out.print("Rectangle");
		return a * b;
	
	}
	
	public double getArea(int h, double b) {
		System.out.print("Triangle");
		return h * b /2;
	}
	
	public double getArea(double b, int a) {
		return a + b + 4;
	}
	
	public static void main(String[] args) {
		
		AreaCalculator ac = new AreaCalculator();
		
		System.out.println(ac.getArea(5)); // get area of Circle
		System.out.println(ac.getArea(4.3,9.9)); // get area of Rectangle
		System.out.println(ac.getArea(3, 9.4)); // get area of triangle
		System.out.println(ac.getArea(4.5,3)); // get the generic area
		
		
	}
	
	
	
	
	

}
