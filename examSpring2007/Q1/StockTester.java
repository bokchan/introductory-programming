package examSpring2007.Q1;

public class StockTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sofa s1 = new Sofa(10000, 5, 1001, "Velvet", 4, "Black");
		Sofa s2 = new Sofa(8500, 5, 1001, "Leather", 3, "Brown");
		Coffeetable ct1 = new Coffeetable(3500, 3, 1101, "Metal", 100, 80, 200);
		Dinnertable dt1 = new Dinnertable(6500, 2, 1301, "Maple", 90, 120, 250);
		
		Stock stock1 = new Stock();
		stock1.add_item(s1);
		stock1.add_item(s2);
		stock1.add_item(ct1);
		stock1.add_item(dt1);
		
//		stock1.print();
//		System.out.println("No of sofas on stock: " + stock1.no_of_sofas());
		
		DStock dstock1 = new DStock(s1, 
				new DStock(s2, 
						new DStock(ct1, 
								new DStock(dt1, null))));
		dstock1.print();
		System.out.println(dstock1.no_of_sofas());
	}

}
