package examSpring2007.Q1;

public class Table extends Item {
int height;
int width; 
int length;


public Table(int price, int number_of_stock, int item_number, String material, int height, int width, int length) {
	super(price, number_of_stock, item_number, material);
	// TODO Auto-generated constructor stub
	this.height = height;
	this.width = width;
	this.length = length;
}

public void print() {
	super.print();
	System.out.println("Height: " + height);
	System.out.println("Width: " + width);
	System.out.println("Length: " + length);
}


}
