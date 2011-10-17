package ch7.vendingmachine;

import java.util.ArrayList;

public class VendingMachineTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>() {{
			add(new Product("MarsBar", 3.00f));
			add(new Product("Coca Cola", 2.50f));
			add(new Product("M&M", 1.70f));
		}};
		VendingMachine vm = new VendingMachine("BOKS SNACKBAR", products);
		
		ArrayList<Coin> wallet = new ArrayList<Coin>() {{
			add(new Coin(1.00f, "Dollar"));
			add(new Coin(1.00f, "Dollar"));
			add(new Coin(0.05f, "Nickel"));
			add(new Coin(0.25f, "Quarter"));
		}};
		
		System.out.println("Change: " + vm.buyProduct("MarsBar", wallet));
	}

}
