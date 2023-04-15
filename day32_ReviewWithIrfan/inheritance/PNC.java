package day32_ReviewWithIrfan.inheritance;

import day32_ReviewWithIrfan.encapsulation.Bank;

public class PNC extends Bank{
 /*
  * Java Inheritance (Subclass and Superclass)
	In Java, it is possible to inherit attributes and methods from one class to another.
	 We group the "inheritance concept" into two categories:
	
	subclass (child) - the class that inherits from another class
	superclass (parent) - the class being inherited from

*/
	final String name = "PNC";
	final double interestRate = 0.076;
	double loanAmount ;
	final double newAccountBonus = 300;
	
	public PNC() {
		super.setLocation("123 rue st martin");
		System.out.println("No argument Constructor of PNC");
		super.deposit(newAccountBonus);
		setName(name);
		
	}

	@Override
	public String toString() {
		return "PNC [name=" + name + ", interestRate=" + interestRate + ", loanAmount=" + loanAmount + "]" + 
	super.toString();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
