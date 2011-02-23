package ch10.p3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Assignment p10.3
 * @author Andreas
 *
 */
public class CopyFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) throw new IllegalArgumentException();
		
		String inFileName = args[0];
		String outFileName = args[1];
		File fInput = new File(inFileName);
		Scanner in = null;
		try {
			in = new Scanner(fInput);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out = null;
		try {
			out = new PrintWriter(outFileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (in.hasNextLine()) {
			out.println(in.nextLine());
			
		}
		
		in.close();
		out.close();
	}
}
