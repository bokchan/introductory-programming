package ch5;

public class RootApproximator {
	private double a; 
	private double EPSILON;
	private double xNew = 1;
	private double xOld = a;
	public RootApproximator(double a, double EPSILON) {
		this.a = a;
		this.EPSILON = EPSILON;
	} 
	
	public double getxNew() {
		return xNew;
	}

	public void setxNew(double xNew) {
		this.xNew = xNew;
	}

	public boolean hasMoreGuesses() {
		return (xNew - Math.sqrt(a)> EPSILON);
	}
	
	public double nextGuess() {
		/**
		 * (1 + 2/1) /2 = 1,5
		 * (1,5 + 2/1,5) 2 = 1,41
		 */
		xNew =(xNew + (a/xNew)) / 2;
		return xNew;
		
	}
	
}
