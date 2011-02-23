package ch10.p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Assignment p10.1
 * @author Andreas
 *
 */
public class IOTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long characterCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		Scanner sc = new Scanner(System.in);
		File file = new File(sc.next());
		Scanner in = null;
		try {
			in = new Scanner(file);
			try {
				
				characterCount = file.length();
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
			} finally {
				in.close();
				sc.close();
			}
			
			System.out.printf("The file countains %s characters\n", characterCount);
			System.out.printf("The file countains %s lines\n", lineCount);
			System.out.printf("The file countains %s words\n", wordCount);
			
		} catch (FileNotFoundException e1){
			System.out.println("The file does not exist");
		}
	}
	
	

}
