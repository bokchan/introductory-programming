package defaultpackage;


public class BankAccountTester {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		BankAccount account = new BankAccount.Builder()
		.balance(0)
		.interestRate(3.6)
		.transactionFee(0.5)
		.freeTransactions(3)
		.build();
		
		account.deposit(100);
		account.deposit(100);
		account.deposit(100);
		account.withDraw(100);
		account.deposit(100);
		
		System.out.println("# of transactions " + account.getNumberOfTransactions());
		System.out.println(account.getBalance());
		account.deductMonthlyCharge();
		System.out.println(account.getBalance());
		
		
		
	}

}
