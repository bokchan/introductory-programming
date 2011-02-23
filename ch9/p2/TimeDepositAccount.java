package ch9.p2;

public class TimeDepositAccount extends BankAccount {

	private static final double PENALTYAMOUNT = 20.0;
	int maturityMonths;
	double interestRate;
	
	/**
	 * 
	 * @param initialBalance of the account
	 * @param maturityMonths number of month before a penalty free withdraw  
	 * @param interestRate of the account
	 */
	public TimeDepositAccount(double initialBalance, int maturityMonths, double interestRate) {
		super(initialBalance);
		
		this.maturityMonths = maturityMonths;
		this.interestRate = interestRate;
	}
	
	/*
	 * Adds the earned interest to the account balance
	 */
	public void addInterest() {
		double interest = getBalance() * interestRate/100;
		deposit(interest);
		maturityMonths--;
	}
	
	/**
	 *  
	 * @param amount to the withdrawn from the balance
	 */
	public void withDraw(double amount) {
		balance = getBalance() - amount;
		if (maturityMonths > 0) {
			balance = getBalance() - PENALTYAMOUNT;
			System.out.println("Penalty deducted");
		}
	}
}
