package day30_Polymorphism.overriding.shapes;

public class ShapeTest {

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.area(); //Will grab the area() from the Shape Class(Parent class)
		
		//------------------
//		To Override
	//  SuperClass sc = new SubClass();
		
		Shape myTriangle = new Triangle();
		
		myTriangle.area(); // will grab the area() from Triangle Class
		
		Shape myCircle = new Circle();
		
		myCircle.area(); //
		
		
		
		
		
	}

}
