package ch8.p12;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTester {

	@Test public void BankAccountTest(){


		// Instantiate BankAccountMeasurer and BankAccountFilter  
		BankAccountMeasurer m = new BankAccountMeasurer();
		BankAccountFilter f = new BankAccountFilter();

		// Instantiate a new object of type DataSet 
		DataSet data = new DataSet(m, f);

		// Add bank accounts to data set  
		data.add(new BankAccount(999));
		data.add(new BankAccount(2000));
		data.add(new BankAccount(200));
		data.add(new BankAccount(4000));
		data.add(new BankAccount(5000));

		// Use JUnit to make assertions about the test  
		Assert.assertEquals(3, data.getCount(), 0);

	}
}
