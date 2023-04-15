package day25_classAndObject;

public class DogObject {

	public static void main(String[] args) {
		
		Dog napolitanMastiff = new Dog();
		
		napolitanMastiff.breed = "Napolitan Mastiff";
		napolitanMastiff.age = 5;
		napolitanMastiff.color = "Black";
		napolitanMastiff.size = "Large";
		
		Dog maltese = new Dog();
		
		maltese.breed = "Maltese";
		maltese.age = 2;
		maltese.color = "White";
		maltese.size ="Small";
		
		Dog chowChow = new Dog();
		
		chowChow.breed = "Chow Chow";
		chowChow.age = 3;
		chowChow.color = "Brown";
		chowChow.size = "Medium";
		
		
		napolitanMastiff.eat();
		napolitanMastiff.sleep();
		napolitanMastiff.sit();
		napolitanMastiff.run();
		
		System.out.println();
		
		maltese.eat();
		maltese.sleep();
		maltese.sit();
		maltese.run();
		
		System.out.println();
		
		chowChow.eat();
		chowChow.sleep();
		chowChow.sit();
		chowChow.run();
		
	}

}
