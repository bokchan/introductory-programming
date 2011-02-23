package ch7;

import org.junit.Assert;
import org.junit.Test;

public class CashRegisterTest {
	@Test public void testCashRegister() { 
		CashRegister register = new CashRegister();
		Coin dollar = new Coin(1, "Dollar");
		Coin quarter = new Coin(0.25, "Quarter");
		Coin nickel = new Coin(0.10, "Nickel");
		Coin dime = new Coin(0.05, "Dime");
		Coin penny = new Coin(0.01, "Penny");
		
		register.recordPurchase(10, dollar);
		register.recordPurchase(3, quarter);
		register.recordPurchase(1, nickel);
		register.recordPurchase(1, dime);
		register.recordPurchase(1, penny);
				
		register.enterPayment(15, dollar);
		double expected = 4.09;
		// purchase = 10 + 3 * 0.25 + 0.10 + 0.05 + 0.01
		// purchase = 10.91
		// expected = 15 - 10.91
		// expected = 4.09

		Assert.assertEquals(expected, register.giveChange(dollar), 0.0);
	}
}
