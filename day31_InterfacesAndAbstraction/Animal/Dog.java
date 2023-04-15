package day31_InterfacesAndAbstraction.Animal;

public class Dog implements Animal {

	
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public void setName() {
		
	}
	@Override
	public void speak() {
		System.out.println(name + " is speaking: Woof!");
	}

	@Override
	public void eat(String food) {

		System.out.println(name + " is eating " + food);
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
	}

}
