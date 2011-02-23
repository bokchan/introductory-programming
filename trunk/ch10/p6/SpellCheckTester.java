package ch10.p6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * Assignment p10.6
 * @author Andreas
 *
 */
public class SpellCheckTester {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		if (args.length < 1) throw new IllegalArgumentException();
		ArrayList<String> misspelled = new ArrayList<String>();
		String filename = args[0];
		File file = new File(filename);
		Scanner in = new Scanner(file);
		in.useDelimiter("[^A-Za-z]+");
		StringBuffer contents = new StringBuffer();
		
		while (in.hasNextLine()) {
			String line = in.nextLine();
			contents.append(line).append(System.getProperty("line.seperator"));
		}
		
		Document doc= SpellChecker.doSpellCheck(contents.toString());
		NodeList listErrors = doc.getElementsByTagName("c"); 
		
		in.close();
	}

}
