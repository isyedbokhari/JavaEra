package day32_ReviewWithIrfan.inheritance;

public class NewAccount {
	public static void main(String[] args) {
		
		
		PNC pnc = new PNC();
		
		pnc.setAccountNumber("123123");
		pnc.deposit(500);
		pnc.setUserName("test_123");
		pnc.setPassword("Password@@@!1");
		
		
		System.out.println(pnc.toString());
		
		
	}
}
