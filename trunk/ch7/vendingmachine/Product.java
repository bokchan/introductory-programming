package ch7.vendingmachine;

public class Product {
	private String name;
	private float value;
	
	public Product(String name, float value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public float getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.format("%s: $%s", name, value);
	}
		
}
