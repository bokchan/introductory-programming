package ch7;


public class CashRegister {
	// Declare variables 
	// However double is not the optional datatype for money
	private double purchase; 
	private double payment;
	
	/**
	 * Default constructor 
	 */
	public CashRegister() {
		purchase = 0.0;
		payment = 0.0;
	}
	
	/**
	 * 
	 * @param coinCount number of coins of a specific cointype 
	 * @param coinType type of coin
	 */
	public void recordPurchase(int coinCount, Coin coinType) {
		purchase = purchase + coinCount * coinType.getValue();
	}
	
	/**
	 * Precondition coinCount >= 0 && coinType != null 
	 * 
	 * @param coinCount number of coins of a specific cointype 
	 * @param coinType type of coin
	 * 
	 * Postcondition the variable payment 
	 * should be the same or greater than before enterPayment 
	 * has been executed 
	 */
	public void enterPayment(int coinCount, Coin coinType) {
		payment = payment + (coinCount * coinType.getValue());
	}
	
	/**
	 * 
	 * @param coinType type of coin
	 * @return The payment minus purchase 
	 */
	public double giveChange(Coin coinType) {
		double change = payment - purchase;
		payment = 0.0;
		purchase = 0.0;
		return change;
	}
}
