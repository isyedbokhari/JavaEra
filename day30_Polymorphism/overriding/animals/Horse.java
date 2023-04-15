package day30_Polymorphism.overriding.animals;

public class Horse extends Animal {

	public void makeSound() {
		System.out.println("I'm a horse, neighing");
	}
	public void walk() {
		System.out.println("Horse is walking");
	}
	public void eat() {
		System.out.println("Horse is eating");
	}
	
}
