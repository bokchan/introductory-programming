package ch10.p14;

import java.util.Scanner;

public class FloatInputTester {

	/**
	 * @param args
	 */
	public static float sum = 0;
	public static int errorCount = 0;
	public static Scanner in  ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in  = new Scanner(System.in);

		while(in.hasNext()) 
		{
			readInput();
		}	
	}

	public static void readInput() {
		try {
			sum+=Float.valueOf(in.next());
			errorCount=0;
		} 
		catch (Exception e1) {				
			if (errorCount > 1) {
				System.out.println(sum);
				System.out.println("You missed your chance");
				System.exit(0);
			} else {
				errorCount++;
				System.out.println("Input was not a number. You have one more chance to enter a number");
			}
		}
	}
} 