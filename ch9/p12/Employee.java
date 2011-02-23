package ch9.p12;

public class Employee {
	public String name;
	public double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name:" + getName() + "\n");
		sb.append("Salary:" + getSalary() + "\n");
		return sb.toString();
	}
}
