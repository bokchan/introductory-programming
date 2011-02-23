package ch9.p12;

import org.junit.Test;

public class EmployeeTester {
	@Test 
	public void EmployeeTest() {
		
		Employee employee = new Employee("Peter Jackson", 50000);
		Manager manager = new Manager("Martha Stewart", 75000, "Sales", "Sales Manager"); 
		Executive executive = new Executive("Bill Gates", 100000, "Direction", "CEO", 30000);
		
		System.out.println( employee.toString());
		System.out.println( manager.toString());
		System.out.println( executive.toString());
		
	}

}
