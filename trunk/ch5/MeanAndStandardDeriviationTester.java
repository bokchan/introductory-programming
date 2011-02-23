package ch5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeanAndStandardDeriviationTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> inputs = new ArrayList<Double>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Input a double value. Press 'x' to show result");
		String input = sc.next();

		while (! input.equals("x")) {
			inputs.add(Double.valueOf(input));
			System.out.println("Input a double value. Press 'x' to show result");
			input = sc.next();
		} 

		MeanAndStandardDeriviation m = new MeanAndStandardDeriviation(inputs);

		System.out.println("Inputs: " + m.getInputs().toString());
		System.out.println("Number of inputs: " + m.getCount());
		System.out.println("Sum of inputs: " + m.getSum());
		System.out.println("Average of inputs: " + m.getAverage());
		System.out.println("Standard deriviation of inputs: " + m.getStandardDeriviation());
	}

}
