package day32_ReviewWithIrfan.inheritance;

import day32_ReviewWithIrfan.encapsulation.Bank;

public class CapitalOne extends Bank{
	
	final String name = "CapitalOne";
	final double interestRate = 0.056;
	double loanAmount ;
	final double newAccountBonus = 500;
	
	public CapitalOne(String accountNumber,String userName,String password,double balance) {
		
		super(accountNumber,userName,password,balance, "123 Main st");
		super.deposit(newAccountBonus);
		setName(name);
	}

	@Override
	public String toString() {
		return "CapitalOne [name=" + name + ", interestRate=" + interestRate + ", loanAmount=" + loanAmount
				+ ", newAccountBonus=" + newAccountBonus + "]"
				+super.toString();
	}
	
	
	
	
	
	
	
}
