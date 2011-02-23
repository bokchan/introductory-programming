package ch2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ch2.FourRectanglePrinter.DRAWACTION;


/**
 * Assignment # P2.3
 * 
 * This program creates a rectangle and translates it clockwise.    
 * 
 * @author Andreas Bok Andersen
 */
public class FourRectangleTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// Declare JFrame 
		JFrame frame = new JFrame();  

		// Set the action when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/**
		 * Let the user input values for x, y, width and height  
		 */
		// 
		// Show InputDialog for userinput  
		String x = JOptionPane.showInputDialog("Input x coordinate");
		// Let the user input input a value untill it passes the test 
		while (checkInput(x) == false ) {
			x = JOptionPane.showInputDialog("Input x coordinate");
		}

		String y = JOptionPane.showInputDialog("Input y coordinate"); 
		while (checkInput(y) == false ) {
			y = JOptionPane.showInputDialog("Input y coordinate");
		}

		String dx = JOptionPane.showInputDialog("Input width"); 
		while (checkInput(dx) == false ) {
			dx = JOptionPane.showInputDialog("Input width");
		}

		String dy = JOptionPane.showInputDialog("Input height"); 
		while (checkInput(dy) == false ) {
			dy = JOptionPane.showInputDialog("Input height");
		}

		/**
		 *  Instantiate a new using static factories pattern 
		 *  from "Effective Java" by Joshua Bloch    
		 */
		
		
		FourRectanglePrinter fourRectanglePrinter = 
			new FourRectanglePrinter.Builder()
		._x(Integer.parseInt(x))
		._y(Integer.parseInt(y))
		._dx(Integer.parseInt(dx))
		._dy(Integer.parseInt(dy))
		._drawAction(DRAWACTION.FILL)
		.build();

		// Show the JFrame in maximized state 
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// Add the instantiated object to the JFrame container 
		frame.add(fourRectanglePrinter);
		
		// Make the JFrame visible
		frame.setVisible(true);
	}

	/**
	 * 
	 * @param s user input 
	 * @param min min value 
	 * @param max max value 
	 * @return returns boolean if input passes tests 
	 */
	private static boolean checkInput(String s) 
	{
		try  {

			// Convert input to a char array 
			char[] cArray =	s.toCharArray();
			// check if input is a digit 
			if (! Character.isDigit(cArray[0])){
				// Show message dialog with error message 
				JOptionPane.showMessageDialog(null, "Input is not a number");
				return false;
			} 

			return true;
		} finally {} 

	} 

} 

