package ch9.p13;

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
	
	
	
	/**
	 *  
	 * @param amount to the withdrawn from the balance
	 */
	public void withdraw(double amount) {
		balance = getBalance() - amount;
		if (maturityMonths > 0) {
			super.balance = getBalance() - PENALTYAMOUNT;
		}
	}

	/*
	 * Adds the earned interest to the account balance
	 */
	@Override
	public void endOfMonth() {
		// TODO Auto-generated method stub
		double interest = getBalance() * interestRate/100;
		super.deposit(interest);
		maturityMonths--;
	}
}
