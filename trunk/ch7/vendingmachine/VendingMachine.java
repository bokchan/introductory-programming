package ch7.vendingmachine;

import java.util.ArrayList;

public class VendingMachine {

	public static enum STATUS {
		OK("Product Dispensed. Change given"), UNDERFLOW_PAYMENT(
				"Payment insufficient"), UNDERFLOW_PRODUCT(
				"Product not available");

		String value;

		STATUS(String msg) {
			this.value = msg;
		}
		
		public String toString() {
			return this.name() + ": " + this.value;
		}
	};

	public STATUS status;

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
	
	public void addProduct(ArrayList<Product> p) {
		this.inventory.AddProduct(p);
	}

	public ArrayList<Coin> buyProduct(String product, ArrayList<Coin> coins) {
		// Check coins against price
		// give change
		float payment = 0.0f;
		for (Coin c : coins) {
			payment += c.getValue();
		}

		Product p = this.inventory.InStock(product);
		if (p == null) {
			this.status = STATUS.UNDERFLOW_PRODUCT;
			return coins;
		} else if (payment < p.getValue()) {
			this.status = STATUS.UNDERFLOW_PAYMENT;
			return coins;
		} else {
			this.inventory.RemoveProduct(p);
			this.status = STATUS.OK;
			return GetChange(p, payment);
		}

	}

	public ArrayList<Product> GetAvailableProducts() {
		return this.inventory.GetAvailableProducts();
	}

	private ArrayList<Coin> GetChange(Product p, float payment) {
		float diff = (float) Math.floor(((payment - p.getValue()) * 100) + 0.5) / 100;
	
		ArrayList<Coin> change = new ArrayList<Coin>();
		for (Coin c : VendingMachine.Coins) {
			int i = (int) (diff / c.getValue());
			while (i > 0) {
				change.add(c);
				diff = (float) Math.floor(((diff - c.getValue()) * 100) + 0.5) / 100;
				i--;
			}
			if (diff == 0)
				break;
		}

		return change;
	}

	@Override
	public String toString() {
		return name + " Inventory: \n" + inventory;
	}
}
