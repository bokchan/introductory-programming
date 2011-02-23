package examFall2008.Q2;

public class Villa extends Owner_occupied_residence {
	int gardenarea; 
	
	public Villa(int area, String country, int cashprice, int rent, int gardenarea) {
		super(area, country, cashprice, rent);
		this.gardenarea = gardenarea;
	}
	
	public void print_info() {
		super.print_info();
		System.out.println("Gardenarea " + gardenarea);
	}
	
}
