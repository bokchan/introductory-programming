package ch8.p12;


public class BankAccountFilter implements Filter {



	/**
	 * Filters an object based on some criteria
	 * @param x object to be filtered 
	 */
	public boolean accept(Object x) {
		// TODO Auto-generated method stub
		if (x instanceof BankAccount) {
			BankAccount aBankAccount = (BankAccount) x;
			if (aBankAccount.getBalance() < 1000) return false;
			else return true;
		} 
		return false;
	}

}
