package ch11.p4;

import java.util.HashMap;


/**
 * Generates an assignment with a question and an answer
 * @author Andreas Bok Andersen
 *
 */
public class AssignmentFactory {
	/**
	 * 
	 * @param level Level of the assignment 
	 * @return Returns an assignment with a question and an answer
	 */
	public static Assignment generateAssignment(int level) {
		HashMap<String, Object> qa = QAGenerator.getQA(level);
		Assignment a = new Assignment((String)qa.get("question"), qa.get("answer"));
		return a;
	}
}
