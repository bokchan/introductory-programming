package ch10.p7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Assignment P10.7
 * @author Andreas
 *
 */
public class ReversePrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String filenameIn =  in.next(); 
		File file = new File(filenameIn);
		doReverse(file);
		in.close();
	}
	public static void doReverse(File file) {
		String reverseInput = "";
		Scanner reader = null;
		PrintWriter writer = null;
		try {
			try {
				reader = new Scanner(file);
				writer = new PrintWriter("c:\\reverse.txt");
				while (reader.hasNextLine()) {
					String line = reader.nextLine();
					char[] chars = line.toCharArray();
					String reverseLine = "";
					for (int i = chars.length-1; i>= 0; i--) {
						reverseLine += String.valueOf(chars[i]);
					}
					writer.println(reverseLine);
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
			reader.close();
			writer.close();
		}


	}
}
