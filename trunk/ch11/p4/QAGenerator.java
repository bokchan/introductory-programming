package ch11.p4;

import java.util.HashMap;

/**
 * 
 * @author Andreas Bok Andersen
 *
 */
public class QAGenerator {
	private static HashMap<String, Object> qa = new HashMap<String, Object>();
	
	/**
	 * 
	 * @param level Level of the assignment 
	 * @return Returns a hashmap with question and answer 
	 */
	public static HashMap<String, Object> getQA(int level) {
		generateQA(level);
		return qa;
	} 
	
	private static void generateQA(int level) {
		int x;
		int y;
		String q = "";
		int a = 0;
		switch (level) {
		case 1:
			// Generate problem for level 1 
			// Addition of two numbers with sum less than 10
			x = (int) Math.round(Math.random() * 9);
			y = (int) Math.round(Math.random() * (9-x));
			q = x + "+" +y;
			a = x + y;
			break;
		case 2: 
			// Generate problem for level 2
			// Addition of two randon numbers less than 10 
			x = (int) Math.round(Math.random() * 9);
			y = (int) Math.round(Math.random() * 9);
			q = x + "+" +y;
			a = x + y;
			break;
		case 3:
			// Generate problem for level 3 
			// Subtraction of two random numbers with a nonnagative difference 
			x = (int)Math.round(Math.random() * 9);
			y = (int) Math.round(Math.random() * x);
			q = x + "-" +y;
			a = x - y;
			break;
		
		}
		// Add question and answer to the hashmap
		qa.put("question", q);
		qa.put("answer", a);
	};
}