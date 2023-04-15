package day28_reviewWithMiran;

public class Person {
		String name;
		int age;
		String occupation;
		String address;
		boolean isMarried;
		
		public Person() {
			
		}
		
		public Person (String name, int age, String occupation, String address, boolean isMarried) {
			this.name = name;
			this.age = age;
			this.occupation = occupation;
			this.address = address;
			this.isMarried = isMarried;
		}
		
		public int birthday(int newAge) {
			age = newAge;
			return age;
		}
		
		public String changeOccupation(String newOccupation) {
			occupation = newOccupation;
			return occupation;
		}
		
		public String move(String newAddress) {
			address = newAddress;
			return address;
		}
		
		public boolean maritialStatus(boolean newStatus) {
			isMarried = newStatus;
			return isMarried;
		}
		
		public void introduce() {
			System.out.println("Name: " + name + "\nAge: " + age + "\nOccupation: " + occupation + "\nAddress: " + address + "\nMaritial Status: " + isMarried);
		}
}
