package ch4;

import java.util.Scanner;

public class GradeTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a grade {A, B, C, D, F} optional + or -");
		String input = in.next();

		Grade g = new Grade(input);

		System.out.printf("Your grade is: %s", g.getNumericValue());


	}
}
