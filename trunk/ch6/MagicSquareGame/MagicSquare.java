package ch6.MagicSquareGame;

import java.util.HashSet;
import java.util.Set;

/**
 * Mandatory Assignment 6.15 Due 12/10/2010 
 * @author Andreas Bok Andersen
 *
 */

public class MagicSquare {
	// The n/sidelength value of the magicsquare 
	private int magicNumber;
	// Array of integers holding the user's inputs   
	private int[] inputs;  
	// Double array containing the magic square 
	private int[][] magicSquare ;

	private int count= 0; 

	public MagicSquare(int n) {
		magicNumber = n;
		magicSquare = new int[n][n];
		inputs = new int[(int) Math.pow(Double.valueOf(n), 2)];
	}

	/**
	 * 
	 * @return the magic constant m using the formula 
	 * m = n * (n^2 + 1) / 2 
	 * ex. n = 3 
	 * m = 3 (3^2 +1) 2 
	 * m = 15
	 */
	private int computeMagicConstant() {
		return (int) (magicNumber *(Math.pow(magicNumber, 2) + 1)/2);

	}

	/**
	 * 
	 * @return true if the sum of rows equals magic constant
	 */
	private boolean validateRows() {
		for (int row = 0; row < magicSquare.length; row++) {
			int tempSum = 0;
			for (int col = 0; col < magicSquare.length; col++) {
				tempSum += magicSquare[row][col];
			}
			if (tempSum != computeMagicConstant()) {
				return false;}
		}

		return true;
	}

	/**
	 * 
	 * @return true if the sum of columns equals magic constant 
	 */
	private boolean validateColumns() {
		for (int col = 0; col < magicSquare.length; col++) {
			int tempSum = 0;
			for (int row = 0; row < magicSquare.length; row++) {
				tempSum += magicSquare[row][col];
			}
			if (tempSum != computeMagicConstant()) {
				return false;}
		}	

		return true;
	}

	/**
	 * 
	 * @return true if sum of diagonals equals magic constant 
	 */
	private boolean validateDiagonals() {

		// Check bottom left to top right
		for (int cornerRow = getMagicSquare().length -1; cornerRow >= 0; cornerRow--) {
			int tempSum = 0;
			for (int cornerColumn = 0; cornerColumn < getMagicSquare().length; cornerColumn++) {
				tempSum += magicSquare[cornerRow][cornerColumn];
			} if (tempSum != computeMagicConstant()) {
				return false;
			}

		}

		// Check bottom right to top left
		for (int cornerRow = getMagicSquare().length -1; cornerRow >= 0; cornerRow--) {
			int tempSum = 0;
			for (int cornerColumn = getMagicSquare().length -1; cornerColumn >=0; cornerColumn--) {
				tempSum += magicSquare[cornerRow][cornerColumn];
			} if (tempSum != computeMagicConstant()) {
				return false;
			}
		}		

		return true;		
	}

	/**
	 * Validates if userinput is the full range of numberrs from n to n^2
	 * Validates if number of inputs equals n^2   
	 * @return 
	 */
	public boolean validateInput() {
		// Convert the array to a Set of integers. Duplicates will be eliminated   
		Set<Integer> setMagicSquare = new HashSet<Integer>();
		for (int i = 0; i < inputs.length; i++) {
			setMagicSquare.add(inputs[i]);
		}

		// Check if the number of values equals n^2
		if (setMagicSquare.size() != Math.pow(magicNumber, 2)) {
			return false;
		}  


		// Check if all values from 1 to n^2 is present
		for (int i = 1; i <= Math.pow(magicNumber, 2); i++) {
			if (!setMagicSquare.contains(i)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @param i a value typed in by the user 
	 */
	public void addInt(int i) {
		inputs[count] = i;
		count++;
	}

	/**
	 * 
	 * @return true if the numbers form a magicsquare
	 */
	public boolean isMagic() {
		fillMagicSquare();

		return validateInput() && validateRows() && 
		validateColumns() && 
		validateDiagonals();
	}

	/** 
	 * 
	 * @return an instance of the magicsquare
	 */
	public int[][] getMagicSquare() {
		return this.magicSquare;

	}

	/**
	 * Creates a magicsquare array  
	 */
	private void fillMagicSquare() {
		int counter = 0;
		for (int row = 0; row < magicNumber; row++) {
			for (int col = 0; col < magicNumber; col++  ) {
				magicSquare[row][col] = inputs[counter];
				counter++;
			}
		}

	} 
}	