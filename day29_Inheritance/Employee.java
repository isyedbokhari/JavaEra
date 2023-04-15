package day29_Inheritance;

public class Employee extends Person{
	// Instance Variables
    String jobTitle;
    double salary;
    long employeeId;
    
    
    //Instance Method 
    public void work() {
        System.out.println(name + " is working");
    }
    public String toString() {
        return "Person [ name:" + name + ". age: " + age + ", PhoneNumber: " + phoneNumber 
                + ", Job: " + jobTitle + ", Salary: " + salary + ". Employee Id: " + employeeId + "]";
    }
    
    

}
