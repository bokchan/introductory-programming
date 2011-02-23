package examFall2008.Q2;

public class Residence {
	int area;
	String country; 
	
	public Residence(int area, String country) {
		this.area = area;
		this.country = country; 
	}
	

	public void print_info() {
		System.out.println("Area: " + area);
		System.out.println("Country: " + country);
		
	}
}
