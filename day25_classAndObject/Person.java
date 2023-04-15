package day25_classAndObject;

public class Person {
	
	String name;
	int age;
	String occupation;
	
	
	public void work() {
		System.out.println(name + " is " + age + " years old and he / she is a / an " + occupation);
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	public void gym() {
		System.out.println(name + " just went to the gym");
	}
		
	public void introduction() {
		System.out.println("Hey there! My name is " + name);
		System.out.println("I'm a / an " + occupation);
		System.out.println("My hobies include gym, soccer and hiking");
		System.out.println("I love dogs");
	}
	
	
	
	
	
	
	
	
}
