package day27_encapsulation;

public class Person {
			
	private String name;
	private int age;
	private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.isEmpty()) {
			System.out.println("Enter a name...");
		}
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0 && age < 120) {
			this.age = age;
		} else {
			System.out.println("Enter valid age");
		}
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if (address.trim().isEmpty()) {
			System.out.println("Enter an address");
		} else {
			this.address = address;

		}
	}
	
	// creating parameterized constructor and getting data from the setter
	public Person (String name, int age, String address) {
		setName(name);
		setAge(age);
		setAddress(address);
	}
	
}
