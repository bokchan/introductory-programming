package ch3;

import java.util.ArrayList;
import java.util.List;

/**
 * Mandatory Assignment 3.6, due 21/09/2010
 * @author Andreas Bok Andersen 
 *
 */

public class MinMax {
	// Instance variables 
	private int smallest = Integer.MAX_VALUE;
	private int largest = Integer.MIN_VALUE;
	// A arraylist containing integers   	
	private List<Integer> list = new ArrayList<Integer>();

	// Default Constrctor 
	public MinMax() 
	{

	}

	/**
	 * 
	 * @param list arraylist of integers 
	 */
	public void addValues(ArrayList<Integer> list) {
		for (int i : list ) {
			smallest = Math.min(i, smallest);
			largest = Math.max(i, largest);
			this.list.add(i);
		}	
	}

	/**
	 * 
	 * @return returns largest number    
	 */

	public int getLargest() {
		return largest;
	} 

	/**
	 * 
	 * @return returns smallest number 
	 */
	public int getSmallest() {
		return smallest;
	} 	
}
