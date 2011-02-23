package ch4;

import javax.swing.JOptionPane;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		if (!hasSolutions()) JOptionPane.showMessageDialog(null, "No real solutions!!");
	}
	/** x^2 + bx + c = 0
	 * (x+a) * (x + b) + c= 
	 * 
	 * @return
	 */
	
	public double getSolution1() {
		double sqRoot = Math.sqrt((b*b)-(4*a*c));
		return (-b-sqRoot)/ (2 * a);
	} 

	public double getSolution2() {
		double sqRoot = Math.sqrt((b*b)-(4*a*c));
		return (-b+sqRoot)/ (2 * a);
	} 
	
	public boolean hasSolutions() {
		return (b*b-(4*a*c)) >= 0;
		
	}
}
