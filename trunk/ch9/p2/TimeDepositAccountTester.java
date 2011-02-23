package ch9.p2;

import org.junit.Test;

public class TimeDepositAccountTester {

	@Test
	public void TypeDepositAccountTest() {
		TimeDepositAccount account = 
			new TimeDepositAccount(1000, 6, 5);
		
		account.deposit(100);
		account.addInterest();
		account.deposit(100);
		account.addInterest();
		account.deposit(100);
		account.addInterest();
		account.deposit(100);
		account.addInterest();
			
		account.withDraw(1000);
		
	}
}
