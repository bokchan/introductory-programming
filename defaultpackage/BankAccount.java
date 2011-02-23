package defaultpackage;

import java.util.ArrayList;

public class BankAccount {
	
	private double balance;
	private double interestRate;
	private int freeTransactions; 
	private double transactionFee;
	private ArrayList<Double> monthlyTransactionFees = new ArrayList<Double>(0);
	
		
	public BankAccount(Builder builder) {
		balance = builder.balance;
		interestRate = builder.interestRate;
		transactionFee = builder.transactionFee;
		freeTransactions =builder.freeTransactions; 

		monthlyTransactionFees.clear();
	}
		
	public static class Builder {
		private double balance = 0;
		private double interestRate = 0;
		private double transactionFee = 0;
		private int freeTransactions = 0;
		
		public Builder balance(double initialBalance) {balance = initialBalance; return this;}
		public Builder interestRate(double rate) {interestRate = rate; return this;}
		public Builder transactionFee(double transactionfee) {transactionFee = transactionfee; return this;}
		public Builder freeTransactions(int freeTrans) {freeTransactions = freeTrans; return this;}
		
		public BankAccount build() {
			return new BankAccount(this);
			
		}	
	}

	public void deposit(double amount) {
		balance += amount;
		addFee();
	}
	public void withDraw(double amount) {
		balance -= amount;
		addFee();
		
	}
	
	public void addInterest() {	
		balance = balance * (interestRate + 100) / 100;
	}
	
	public double getBalance() {
		return balance;		
	}
	
	public void setInterestRate(double value) {
		this.interestRate = value;
	}
	
	public void setTransactionFee(double value) {
		this.transactionFee = value;
	}
	
	private void addFee() {
		monthlyTransactionFees.add(transactionFee);
		
	} 
	public int getNumberOfTransactions() {
		return monthlyTransactionFees.size();
		
	}
	
	public void deductMonthlyCharge(){
		double fees = 0;
		int count = 0;  
		for (double fee : monthlyTransactionFees) {
			 if (count >= freeTransactions) {fees += fee;}
			 ++count;
		}
		
		// We don't want to charge the customer for the deduction of fees 
		this.balance -= fees;
		monthlyTransactionFees.clear();
	} 
	
	
}
