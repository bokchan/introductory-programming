package ch8.p12;

public class BankAccount {

	private double balance;

	/**
	 * 
	 * @param balance the initial balance of the account 
	 */
	public BankAccount(double balance) {

		this.balance = balance ;
	}

	/**
	 * Default constructor for BankAccount
	 */
	public BankAccount() {
		balance = 0;
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
