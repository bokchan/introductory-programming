package ch7.vendingmachine;

import java.util.ArrayList;

public class VendingMachine {

	private static final Coin[] Coins = { new Coin(1.00f, "Dollar"),
			new Coin(0.50f, "Half Dollar"), new Coin(0.25f, "Quarter"),
			new Coin(0.10f, "Dime"), new Coin(0.05f, "Nickel"),
			new Coin(0.01f, "Penny"), };

	// , Nickel, Dime, Quarter, HalfDollar, Dollar};
	private String name;
	private Inventory inventory;

	public VendingMachine(String name) {
		this.name = name;
		this.inventory = new Inventory();
	}

	public VendingMachine(String name, ArrayList<Product> products) {
		this.name = name;
		this.inventory = new Inventory();
		this.inventory.AddProduct(products);
	}

	public void addProduct(Product p) {
		this.inventory.AddProduct(p);
	}

	public ArrayList<Coin> buyProduct(String product, ArrayList<Coin> coins) {
		// Check coins against price
		// give change
		float payment = 0.0f;
		for (Coin c : coins) {
			payment += c.getValue();
		}
		System.out.println(payment);

		Product p = this.inventory.InStock(product);
		if ((p != null) && payment >= p.getValue()) {
			this.inventory.RemoveProduct(p);
			return GetChange(p, payment);
		} else {
			System.out.println("Order more " + p.getName());
			return coins;
		}
	}

	private ArrayList<Coin> GetChange(Product p, float payment) {
		float diff = (float) Math.floor(((payment - p.getValue()) * 100) + 0.5) / 100;
		System.out.println("Payment " + diff);

		ArrayList<Coin> change = new ArrayList<Coin>();
		for (Coin c : VendingMachine.Coins) {
			System.out.println("Diff " + diff);
			int i = (int) (diff / c.getValue());
			while (i > 0) {
				change.add(c);
				diff = (float) Math.floor(((diff - c.getValue()) * 100) + 0.5) / 100;
				i--;
			}
			if (diff == 0) break;
		}

		return change;
	}

	@Override
	public String toString() {
		return "VendingMachine [" + name + " Inventory: " + inventory + "]";
	}
}
