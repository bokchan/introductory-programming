package ch5;

/**
 * Mandatory assignment 5.6
 * @author Andreas Bok Andersen 
 *
 */

public class FibanocciGenerator {
	// Declare variables
	private int fold1; 
	private int fold2;
	
	/**
	 * Default constructor for FibonacciGenerator
	 */
	public FibanocciGenerator() {
		fold1 = 1;
		fold2 = 0;
	}
	
	/**
	 * 
	 * @return Returns the next Fibonacci number   
	 */
	public int nextNumber() { 
		
		int fNew = fold1 + fold2;
		fold2 = fold1;
		fold1 = fNew;
		
		if (fold2 <= 1 ) {
			// 
			 return 1;
		} else {
			return fNew;
		}
			
	}
}
