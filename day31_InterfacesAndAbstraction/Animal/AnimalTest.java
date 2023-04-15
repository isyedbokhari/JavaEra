package day31_InterfacesAndAbstraction.Animal;

public class AnimalTest {

	public static void main(String[] args) {

		Dog myDog = new Dog("Rex");
		myDog.speak();
		myDog.eat("dog food");
		
		Cat myCat = new Cat("Whiskerss");
		myCat.speak();
		myCat.eat("Cat food");
		
		
		Animal cat1 = new Cat("Queen");
		
		cat1.speak();
		
		
		Animal dog1 = new Dog("King");
		System.out.println("By Overriding the methods from Animal interface");
		System.out.println();
		dog1.speak();
		dog1.eat("Dog Food");
		dog1.sleep();
		
		
		
		
		
	}

}
