package day31_InterfacesAndAbstraction.Animal;

public class Cat implements Animal {

	private String name;
	
	
	//Constructor Method
	public Cat(String name) {
		this.name = name;
	}
	
	// implement the speak method
	public void speak() {
		System.out.println(name + " says meow!");
	}

	@Override
	public void eat(String food) {
		System.out.println(name + " is eating " + food);
		
	}
	@Override
	public void sleep() {
		System.out.println("Cat is sleeping");
	}
	

	
	
	
}
