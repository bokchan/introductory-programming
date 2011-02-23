package examFall2008.Q2;

public class Owner_occupied_residence extends Residence{
	int cashprice;
	int rent; 
	
	public Owner_occupied_residence(int area, String country, int cashprice, int rent) {
		super(area, country);
		this.cashprice = cashprice;
		this.rent = rent;
	}
	
	public void print_info() {
		super.print_info();
		System.out.println("Cashprice: " + cashprice);
		System.out.println("Rent" + rent);
	}
}
