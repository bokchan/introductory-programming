package ch8.p12;

public class BankAccountMeasurer implements Measurer {

	/**
	 * Casts an object to a bankaccount and returns its balance  
	 * @param anObject to be measured
	 * @return the balance of the bankaccount 
	 */
	public double measure(Object anObject) {
		// TODO Auto-generated method stub
		if (anObject instanceof BankAccount) {
			BankAccount aBankAccount = (BankAccount) anObject;
			return aBankAccount.getBalance();
		} else return 0;
	}
}
