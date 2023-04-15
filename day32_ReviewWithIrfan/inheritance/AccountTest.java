package day32_ReviewWithIrfan.inheritance;
import day32_ReviewWithIrfan.encapsulation.Bank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Bank pnc = new PNC();
		pnc.setAccountNumber("123123123");
		pnc.setPassword("123abc!");
		pnc.setUserName("user_123");
		pnc.deposit(0);
		
		System.out.println(pnc.getName());
		
		
		
		System.out.println(pnc.getBalance());
		
		Bank c = new CapitalOne("789789789","user_321","password",500);
		
		System.out.println(c.getBalance());
		
		
		List<Bank> list = new ArrayList<>(Arrays.asList(pnc, c , c , pnc));
		
		for (Bank b : list) {
			System.out.println("What is this??? "+b.getName());
			System.out.println(b.toString());
			System.out.println(b.getBalance());
			System.out.println("--------------------------");
		}
		
		
		
		
	}
	
}
