package ch5;

public class NewtonRaphsonApproximatorRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewtonRaphsonApproximation nra = new NewtonRaphsonApproximation(2, 2, 0.01);
		System.out.println(nra.nextPower());
		System.out.println(nra.nextPower());

	}

}
