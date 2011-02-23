package ch9.p13;

import junit.framework.Assert;

import org.junit.Test;

public class BankAccountTester {
	
	@Test
	public void BankAccountTester() {
		
		// Declare accounts
		SavingsAccount savings = new SavingsAccount(3.5);
		TimeDepositAccount timeDeposit= new TimeDepositAccount(1000, 6, 5);
		CheckingAccount checking = new CheckingAccount(10000);
		
		double EPSILON = 0.01;
		
		// Test savings account
		Test(savings);
		System.out.println(savings.getBalance());
		// Assert balance after transactions have been executed. 
		// We let the asserted and 
		// the actual values differ by 0.01 
		Assert.assertEquals(3766.76, 
				savings.getBalance(), EPSILON);
		
		// Test timedeposit account account
		Test(timeDeposit);
		System.out.println(timeDeposit.getBalance());
		// Assert balance after transactions have been executed. 
		// We let the asserted and 
		// the actual values differ by 0.01 

		Assert.assertEquals(5237.40, 
				timeDeposit.getBalance(), EPSILON);
		
		// Test checking account account
		Test(checking);
		System.out.println(checking.getBalance());
		// Assert balance after transactions have been executed. 
		// We let the asserted and 
		// the actual values differ by 0.01 
		Assert.assertEquals(13250, 
				checking.getBalance(), EPSILON);
		
		BankAccount[] listAccounts = {checking, savings, timeDeposit};
		for (BankAccount a : listAccounts) {
			a.deposit(500.00);
		}
		
	} 
	
	/**
	 * 
	 * @param account on which to perform test transactions 
	 */
	public static void Test(BankAccount account) {
		account.deposit(100);
		account.endOfMonth();
		account.deposit(4000);
		account.endOfMonth();
		account.withdraw(600);
		account.endOfMonth();
		account.withdraw(500);
		account.endOfMonth();
		account.deposit(250);
		account.endOfMonth();
	} 
}

/**
 * Regarding the question of abstract classes. 
 * The Bankaccount class is now declared abstract 
 * while its subclasses are concrete   
 */