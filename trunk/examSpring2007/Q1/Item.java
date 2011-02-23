package examSpring2007.Q1;

public class Item {

	int price;
	int number_of_stock;
	int item_number;
	String material;
	public Item(int price, int number_of_stock, int item_number, String material) {
		this.price = price;
		this.number_of_stock = number_of_stock;
		this.item_number = item_number;
		this.material = material;
	}
	
	public void print() {
		System.out.println("Price: " + price);
		System.out.println("Number of stock: " + number_of_stock);
		System.out.println("Itemnumber: " + item_number);
		System.out.println("Material: " + material);
	}
}
