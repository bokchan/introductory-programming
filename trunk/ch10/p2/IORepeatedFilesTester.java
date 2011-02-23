package ch10.p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Assignment p10.2
 * @author Andreas
 *
 */
public class IORepeatedFilesTester {

	/**
	 * @param args
	 */
	public static long characterCount = 0;
	public static int wordCount = 0;
	public static int lineCount = 0;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) 
		{ 
			File file = new File(sc.next());
			countContent(file);
		} 
	}

	public static void countContent(File file) {
		Scanner in = null;
		try {
			in = new Scanner(file);
			characterCount += file.length();
			while (in.hasNextLine()) {
				String line = in.nextLine();
				lineCount += 1;
				Scanner words = new Scanner(line);
				{
					while (words.hasNext()) {
						words.next(); 
						wordCount += 1;
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.printf("The file countains %s characters\n", characterCount);
			System.out.printf("The file countains %s lines\n", lineCount);
			System.out.printf("The file countains %s words\n", wordCount);
		}
	} 

}

