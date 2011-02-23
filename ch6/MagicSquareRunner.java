package ch6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/**
 * Mandatory Assignment 6.15 Due 12/10/2010 
 * @author Andreas Bok Andersen
 *
 */

public class MagicSquareRunner {
	public static void main(String[] args) { 

		// Prompt the user for the size of the square
		// This deviates from the assignment however 
		// in my opinion it makes sense to assure that the user input 
		// n^2 values
		String size = JOptionPane.showInputDialog("Input squaresize");

		// Declare a new instance of magicsquare
		MagicSquare magic = new MagicSquare(Integer.valueOf(size));

		// Prompt the user for numbers to put in the magic square
		// For n = 3 the following succession of numbers works: 
		// 8 1 6 3 5 7 4 9 2

		for (int i = 0; i < Math.pow(Double.valueOf(size), 2); i++) {
			String input = JOptionPane.showInputDialog("Input a number");
			if (testInput(input))  {
				magic.addInt(Integer.valueOf(input)); 
			} else {
				// If the user doesn't input anything decrement i 
				//to reenter an input  
				i--;
			}	
		}

		// Check if the typed in numbers form a magic square    
		if (!magic.isMagic()) {
			// Show message in case of failure 
			JOptionPane.showMessageDialog(
					null,  
					"\nYou did not input that form a magic square. \n" + 
					printMagicSquare(magic.getMagicSquare()));				
		} else {

			// Show message in case of success
			JOptionPane.showMessageDialog(
					null,  
					"\nCongratulations you made a magic square. \n" + 
					printMagicSquare(magic.getMagicSquare()));
		}
	}

	/**
	 * 
	 * @param sq is a magicsquare of n^2 size 
	 * @return a stringbuilder containing the values of the magicsquare
	 */
	private static StringBuilder printMagicSquare(int[][] sq) {
		// Declare local variable to hold length of square   
		int sideLength = sq.length;
		// Declare local variable to count the number of printed items     
		int printCounter = 0;
		StringBuilder sb = new StringBuilder();
		// A nested loop in order which appends the values of the magicsquare 
		// to a StringBuilder
		for (int row = 0; row < sideLength; row++) {
			printCounter++;
			for (int col = 0; col < sideLength; col++) {
				if (printCounter % sideLength == 0 && printCounter != 0 ) {
					//System.out.println(sq[row][col]);
					sb.append(sq[row][col] + "\n");
				} else {
					sb.append(sq[row][col]+ " ");
					printCounter++;
				}  	
			}
		}
		return sb; 
	} 

	private static boolean testInput(String i) {

		if (i.length() == 0) return false;

		Pattern p = Pattern.compile("^[0-9]*$");
		Matcher m = p.matcher(i);
		boolean isMatch = false;
		while (m.find()) {
			isMatch = true;
		} 
		return isMatch;
	}
}
