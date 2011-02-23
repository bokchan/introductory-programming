package ch2;

public class ProductTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Oven", 1200);
		Product p2 = new Product("Fridge", 565.43);
		System.out.printf("%s costs %s\n", p1.getName(),p1.getPrice());
		System.out.printf("%s costs %s\n", p2.getName(),p2.getPrice());
		p1.reducePrice(5);
		p2.reducePrice(5);
		System.out.printf("%s costs %s\n", p1.getName(),p1.getPrice());
		System.out.printf("%s costs %s\n", p2.getName(),p2.getPrice());
		

	}

}
