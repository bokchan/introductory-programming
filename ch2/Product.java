package ch2;

public class Product {
	private String name;
	private double price;
	
	public String getName() {
		return this.name;
		
	}
	
	public Product(String name, double price){
		this.name = name;
		this.price = price;
		
	}
	
	public double getPrice() {
		return this.price;
		
	}
	
	public void reducePrice(double rebate) {
		this.price = this.price-rebate;
		
	}

}