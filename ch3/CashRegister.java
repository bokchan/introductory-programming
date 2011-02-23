package ch3;

/**
   A cash register totals up sales and computes change due.
 */
public class CashRegister
{
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.05;

	private double purchase;
	private double payment;
	private int items;

	/**
      Constructs a cash register with no money in it.
	 */
	public CashRegister()
	{
		items = 0;
		purchase = 0;
		payment = 0;
	}

	/**
      Records the sale of an item.
      @param amount the price of the item
	 */
	public void recordPurchase(double amount)
	{
		double total = purchase + amount;
		purchase = total;
		items++;
	}

	/**
      Enters the payment received from the customer.
      @param amount the amount of the payment
	 */
	public void enterDollars(int dollars) {
		payment += dollars;

	} 

	public void enterQuarters(int quarters) {
		payment += quarters * QUARTER_VALUE;
	}

	public void enterDimes(int dimes) {
		payment += dimes * DIME_VALUE;

	}

	public void enterNickels(int nickels) {
		payment += nickels * NICKEL_VALUE;

	}

	public void enterPennies(int pennies) {
		payment += pennies * PENNY_VALUE;

	}
	public void enterPayment(int dollars, int quarters, int dimes, int nickels, int pennies)
	{
		payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE 
		+ nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
	}

	public void enterPayment(int amount)
	{
		payment = amount;
	}

	/**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
	 */
	public double giveChange()
	{   
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
	
	public int getItemCount() {
		return this.items;		
	}
}
