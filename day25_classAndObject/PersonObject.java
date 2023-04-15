package day25_classAndObject;

public class PersonObject {

	public static void main(String[] args) {
		
		Person first = new Person();
		
		first.name ="Syed";
		first.age = 26;
		first.occupation = "SDET";
		
		first.work();
		first.sleep();
		first.gym();
		System.out.println();
		first.introduction();
		
	}

}
