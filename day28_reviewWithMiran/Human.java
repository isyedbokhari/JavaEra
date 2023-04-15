package day28_reviewWithMiran;

public class Human {
	
	public String name; 
    private int age;
    protected String address;
    String occupation;
    
    
    public Human(String name, int age, String address, String occupation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.occupation = occupation;
    }
    
    public Human() {
        
    }
    public void printName() {
        System.out.println("Name: ");
    }
    private void printAge() {
        System.out.println("Age: " + this.age);    
    }
    protected void printAddress() {
        System.out.println("Address: " + this.address);
    }
    void printOccupation() {
        System.out.println("Occupation: " + this.occupation);
    }
}
