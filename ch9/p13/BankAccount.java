package ch9.p13;

public abstract class BankAccount {

	protected double balance;

	/**
	 * Default constructor 
	 */
	public BankAccount() {
		
	}
	
	/**
	 * 
	 * @param amount to be set as initial balance of the account
	 */
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
	
	/**
	 * handle actions on the accounts at the end of month 
	 */
	public abstract void endOfMonth();
}