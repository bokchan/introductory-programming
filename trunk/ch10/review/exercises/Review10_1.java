package ch10.review.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Review10_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename = "c:\\file.txt";
		File inFile = new File(filename);
		try {
			PrintWriter out = new PrintWriter(filename); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int ThrowException() throws Exception{
		return 0;
		
	} 
}
