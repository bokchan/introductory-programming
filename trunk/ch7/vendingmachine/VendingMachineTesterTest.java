package ch7.vendingmachine;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTesterTest {
	
	VendingMachine vm;
	ArrayList<Coin> wallet;
	 
	@Before
	public void setup() {
		
		ArrayList<Product> products = new ArrayList<Product>() {{
			add(new Product("MarsBar", 3.00f));
			add(new Product("MarsBar", 3.00f));
			add(new Product("Coca Cola", 2.50f));
			add(new Product("M&M", 1.70f));
		}};
		vm = new VendingMachine("BOKS SNACKBAR", products);
		
		wallet = new ArrayList<Coin>() {{
			add(new Coin(1.00f, "Dollar"));
			add(new Coin(1.00f, "Dollar"));
			add(new Coin(1.00f, "Dollar"));
			add(new Coin(0.05f, "Nickel"));
			add(new Coin(0.25f, "Quarter"));
		}};
	}

	@Test
	public void testBuyProduct() {
		ArrayList<Coin> change = vm.buyProduct("MarsBar", wallet);
		
		Assert.assertEquals(VendingMachine.STATUS.OK, vm.status);
		
		ArrayList<Coin> expected = new ArrayList<Coin>() {{
			add(new Coin(0.25f, "Quarter"));
			add(new Coin(0.05f, "Nickel"));
		}};
		
		Assert.assertEquals(expected.toString(),change.toString());
		
	}

	@Test
	public void testGetAvailableProducts() {
		ArrayList<Product> products = vm.GetAvailableProducts();
		Assert.assertEquals(true, products.size() > 0);
	}
}
