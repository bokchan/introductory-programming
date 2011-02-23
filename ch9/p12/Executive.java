package ch9.p12;

public class Executive extends Manager {

	public double bonus;
	public Executive(String name, double salary, String department, String title, double bonus) {
		super(name, salary, department, title);
		// TODO Auto-generated constructor stub
		this.bonus = bonus;
	}
	public double getBonus() {
		return bonus;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Bonus: " + getBonus());
		
		return sb.toString();
		} 

}
