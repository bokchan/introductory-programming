package ch9.p2;

public class BankAccount {

	protected double balance;

	public BankAccount() {
		
	}
	
	public BankAccount(double amount) {
		balance = amount;
	}

	/**
	 * 
	 * @param amount to be added to the account
	 */
	public void deposit(double amount) {
		balance += amount;
	}

	/**
	 * 
	 * @param amount to be withdrawn fra the account
	 */
	public void withdraw(double amount) {
		balance -= amount;
	}

	/**
	 * 
	 * @return balance of the account
	 */
	public double getBalance() {
		return balance;
	}

}