package day31_InterfacesAndAbstraction.AbstractClass;

public class Shark extends Animal implements Wild, Swimmable {

	@Override
	public void eat() {

		System.out.println("Shark loves to eat humans");
	}

	@Override
	public void move() {
		System.out.println("Shark is moving");	
	}

	@Override
	public void hunt() {
		System.out.println("Shark is hunting for humans");
		
	}

	@Override
	public void swim() {
		System.out.println("Shark is swimming");
	}


	
	
}
