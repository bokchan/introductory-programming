package ch10.r18;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionTester2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintWriter out;
		
		try {
			System.out.println("Try to open file 'C:\\writeprotectedfile.txt'");
			out = new PrintWriter("C:\\writeprotectedfile.txt");
			
			
		} catch (FileNotFoundException exception ){
			
			System.out.println("Inner most exception raised");
			
		} finally {
			
			System.out.println("finally clause executed");
		}
	
	}

}
