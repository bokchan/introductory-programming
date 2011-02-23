package ch4;

import javax.swing.JOptionPane;

public class FloatingNumberTester {
	public static void main(String[] args) {
		float input1;
		float input2;

		// Get user input using inputdialog
		input1 = Float.parseFloat(
				JOptionPane.showInputDialog("Please input floating number 1"));
		input2 = Float.parseFloat(
				JOptionPane.showInputDialog("Please input floating number 2"));

		// Instiantiate an object of type FloatingNumbers
		FloatingNumbers f = new FloatingNumbers(input1, input2);

		// Print out test results
		String message1 = f.RoundedTest() ? 
				"Number 1 equals number 2 when rounded to two decimals" : 
					"Number 1 differs from number 2 when rounded to two decimals";
		System.out.println(message1);
		String message2 = f.TestDifference() ? 
				"Number 1 and number 2 differs by less than 0.01" : 
					"Number 1 and number 2 differs by more than 0.01"; 
		System.out.println(message2);
	}
}
