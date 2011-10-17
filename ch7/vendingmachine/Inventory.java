package ch7.vendingmachine;

import java.util.ArrayList;

public class Inventory {
	ArrayList<Product> inventory;
	
	
	
	public Inventory() {
		this.inventory = new ArrayList<Product>();
	}

	public void AddProduct(Product p) {
		this.inventory.add(p);
	} 
	
	public void AddProduct(ArrayList<Product> ps) {
		this.inventory.addAll(ps);
	}
	
	public boolean RemoveProduct(Product p) {
		return this.inventory.remove(p);
	}
	
	public Product InStock(String product) {
		for (Product p : inventory) {
			if (p.getName().equals(product)) {
				
				return p;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return this.inventory.toString();
	}
		
}