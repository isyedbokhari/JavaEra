package day29_Inheritance;

public class BMW extends Car{
	
	public void breaksDown() {
		System.out.println(brand + " always break down");
	}
	
	public void race() {
		System.out.println("People race " + brand + " a lot");
	}
}
