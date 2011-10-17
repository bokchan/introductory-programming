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
		boolean flag =  this.inventory.remove(p);
		if (InStock(p.getName()) == null) {
			System.out.println("Order more " + p.getName());
		}
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
	
	public ArrayList<Product> GetAvailableProducts() {
		ArrayList<Product> products = new ArrayList<Product>();
		for (Product p : this.inventory) {
			if (!products.contains(p)) {
				products.add(p);
			}
		}
		return products;
	}

	@Override
	public String toString() {
		return this.inventory.toString();
	}
		
}