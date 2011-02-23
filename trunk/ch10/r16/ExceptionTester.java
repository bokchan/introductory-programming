package ch10.r16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTester {

	/**
	 * @param args
	 */
	@SuppressWarnings("finally")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader reader = null;
		try { 
			try {
				reader = new FileReader("nonExistentFile.txt");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				System.out.println("Inner catch caught");
			}
		} finally {
			if (reader != null) reader.close();
			throw new IllegalArgumentException("Something went wrong");
		}
	}

}
