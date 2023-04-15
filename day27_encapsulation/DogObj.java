package day27_encapsulation;

public class DogObj {

	public static void main(String[] args) {
		
		Dog firstDog = new Dog();
		
		 
		firstDog.setAge(3);
		firstDog.setBreed("Alaskan Husky");
		firstDog.setColor("Black and White");
		firstDog.setName("Aurora");
		firstDog.setSize("Medium");
		
		
		System.out.println(firstDog.getAge());
		System.out.println(firstDog.getBreed());
		System.out.println(firstDog.getColor());
		System.out.println(firstDog.getName());
		System.out.println(firstDog.getSize());

		
	}

}
