package ch3;

import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 * Mandatory Assignment 3.6, due 21/09/2010
 * @author Andreas Bok Andersen 
 *
 */

public class MinMaxTester {

	public static void main(String[] args) {
		// Initilize variables 
		String input = "";
		ArrayList<Integer> list= new ArrayList<Integer>();

		// 
		JOptionPane.showMessageDialog(null, "Beregner et min og max af en række tal. Indtast \"x\" for at vise resultat");

		// While loop to request user input  
		while (!input.equalsIgnoreCase("x")) {
			// Show inputdialog box as long as input not equals "x"
			input = JOptionPane.showInputDialog("Input et tal.");
			if (!input.equalsIgnoreCase("x")) {
				// Parse input and add to list  
				list.add(Integer.parseInt(input));
			}
		}

		// Create a new instance of MinMax class 
		MinMax mm = new MinMax();
		mm.addValues(list);

		// Out result
		System.out.println("Smallest: " + mm.getSmallest());
		System.out.println("Largest: " + mm.getLargest());
	}
	// TODO Auto-generated constructor stub
}
