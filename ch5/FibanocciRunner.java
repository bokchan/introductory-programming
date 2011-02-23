package ch5;

import java.util.Scanner;

/**
 * Mandatory assignment 5.6
 * @author Andreas Bok Andersen 
 *
 */

public class FibanocciRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// Prompt the user for number of Fibanacci numbers to be printed 
		System.out.println("Enter n");
		
		int n = in.nextInt();
		
		// Instantite a new object of type FibanocciGenerator 
		FibanocciGenerator fg = new FibanocciGenerator();
		
		for (int i = 1;i <= n; i++) {
			// Print out next Fibonacci number
			System.out.println(fg.nextNumber());			
		}
	}

}
