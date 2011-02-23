package ch5;

public class NewtonRaphsonApproximation {
	private double a; 
private double EPSILON;
private double xNew =1;
int root ;
	public NewtonRaphsonApproximation(double a, int root, double EPSILON) {
		this.a = a ;
		this.EPSILON = EPSILON;
this.root = root;
	}

	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	
	public boolean hasNext() {
		return xNew -Math.sqrt(a) > EPSILON; 
	}
	
	public double nextPower() {
		
		xNew = Math.pow(a, root) - xNew;
		return xNew;
		
	}
}
