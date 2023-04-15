package day32_ReviewWithIrfan.encapsulation;

public class Bank {

	/*Encapsulation in Java is the process by which data (variables) and 
	 * the code that acts upon them (methods) are integrated as a single unit.
	 *  By encapsulating a class's variables,
	 *  other classes cannot access them, and only the methods of the class can access them*/
	
	//final String bankName = "PNC";
	
	private String accountNumber;
	private String userName;
	private String password;
	private double balance;
	private String location;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	// compile time polymorphism --> having more than one method with same name in the same class with different parameters
	public Bank() {
		// no args constructor
		System.out.println("no args constructor");
	}
	
	public Bank(String accountNumber) {
		// no args constructor
		this.accountNumber = accountNumber;
	}
	
	public Bank(String accountNumber,String userName) {
		// no args constructor
		setAccountNumber(accountNumber);
		setUserName(userName);
	}
	
	public Bank(String accountNumber,String userName,String password,double balance, String location) {
		// no args constructor
		setAccountNumber(accountNumber);
		setUserName(userName);
		this.password = password;
		deposit(balance);
		setLocation(location);
	}
	
	
	// getter -- reading the account number instance variable.
	public String getAccountNumber() {
		return accountNumber;
	}
	
	//setter --> setting value to account number variable.
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void withdraw(double amount) {
		
		if (balance >= amount) {
			balance -= amount;
		}
		
		System.out.println("Your account balance is "+ balance);
		
	}

	public void deposit(double amount) {
		
		balance += amount;
		System.out.println("Your account balance is "+ balance);
	}
	
	public double getBalance() {
		return balance;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", userName=" + userName + ", password=" + password
				+ ", balance=" + balance + ", location=" + location + "]";
	}
	
	
	
	
	
	
}
