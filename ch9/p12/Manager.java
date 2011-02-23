package ch9.p12;

public class Manager extends Employee {

	protected String department;
	protected String title = "Manager";
		
	public Manager(String name, double salary, String department, String title) {
		super(name, salary);
		this.department = department;
		this.title = title;
		// TODO Auto-generated constructor stub
	}
	
	public String getDepartment() {
		return department;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Title:" + getTitle() + "\n");
		sb.append("Department:" + getDepartment() + "\n");
		return sb.toString();
	}
}