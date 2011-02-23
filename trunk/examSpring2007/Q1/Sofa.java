package examSpring2007.Q1;

public class Sofa extends Item {
	int no_of_seats;
	String color;
	
	public Sofa(int price, int number_of_stock, int item_number, String material, int no_of_seats, String color) {
		super(price, number_of_stock, item_number, material);
		
		this.no_of_seats = no_of_seats;
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		super.print();
		System.out.println("No of seats: " + no_of_seats);
		System.out.println("Color: " + color);
	}
}
