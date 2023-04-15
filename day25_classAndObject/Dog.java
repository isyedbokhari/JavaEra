package day25_classAndObject;

public class Dog {

	String breed;
	String size;
	int age;
	String color;
	
	public void eat() {
		System.out.println("A " + age + " year old " + size + " " + color + " " + breed + " is eating its food" );
	}
	
	public void sleep() {
		System.out.println("A " + age + " year old " + size + " " + color + " " + breed + " is sleeping" );
	}
	
	public void sit() {
		System.out.println("A " + age + " year old " + size + " " + color + " " + breed + " is sitting under the shed" );
	}
	
	public void run() {
		System.out.println("A " + age + " year old " + size + " " + color + " " + breed + " is running after the cat" );
	}
}
