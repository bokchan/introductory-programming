package ch4;

import java.text.DecimalFormat;

public class FloatingNumbers {
	// variables 
	private float number1;
	private float number2;

	/**
	 * 
	 * @param input1 float input 
	 * @param input2 float input 
	 */
	public FloatingNumbers(float input1, float input2) {
		number1 = input1;
		number2 = input2;
	}

	/**
	 * 
	 * @return Returns a boolean indicating if two 
	 * floats rounded to two decimals are equal.    
	 */

	public boolean RoundedTest() {
		float testNum1;
		float testNum2;
		DecimalFormat twoDForm = new DecimalFormat("#,##");
		testNum1 = Float.valueOf(twoDForm.format(number1).toString());
		testNum2 = Float.valueOf(twoDForm.format(number2).toString());

		return testNum1 == testNum2 ;
	} 

	/**
	 * 
	 * @return Returns a boolean indicating if two 
	 * floats differ by less than 0.01
	 */
	public boolean TestDifference() {	
		return Math.max(number1, number2) - Math.min(number1, number2) < 0.01; 
	}
}
