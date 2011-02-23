package examFall2008.Q2;

public class Apartment extends Residence {
	int rent;
	boolean elevator = false; 
	
	public Apartment(int area, String country, int rent, boolean elevator) {
		super(area, country);
		this.rent = rent;
		this.elevator = elevator;
	}
	
	public void print_info() {
		super.print_info();
		System.out.println("Rent: " + rent);
		String yesno = elevator ? "yes" : "no";
		System.out.println("Elevator " + yesno);
	} 
}
