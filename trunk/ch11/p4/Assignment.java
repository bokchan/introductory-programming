package ch11.p4;


/**
 * A class with a question and an answer
 * @author Andreas Bok Andersen
 *
 */
public class Assignment {
	private String question;
	private int answer;
	private int missCount = 0; 
	
	/** 
	 * 
	 * @param q 	Question for the assignment  
	 * @param a		Answer for the assignment 
	 */
	public Assignment(String q, Object a) {
		setQuestion(q);
		setAnswer(a);
	}
	
	/**
	 * 
	 * @return Returns the question 
	 */
	public String getQuestion() {
		return question;
	}
	
	/**
	 * 
	 * @param question Sets the value of question 
	 */
	public void setQuestion(String question) {
		this.question = question;
	}


	/**
	 * 
	 * @return Returns the answer 
	 */
	public Object getAnswer() {
		return answer;
	}

	/**
	 * 
	 * @param answer Sets the value of answer 
	 */
	public void setAnswer(Object answer) {
		this.answer = Integer.valueOf(answer.toString());
	}

	/**
	 * Checks if the answer given by the user is right
	 * @param answer 
	 * @return Returns true if the answer given by the user is right
	 */
	public boolean isTrue(Object answer) {
		return this.answer == Integer.valueOf(answer.toString());
	}
	
	/**
	 * Adds miss to the assignment 
	 */
	public void addMiss() {
		missCount++;
	}
	/**
	 * 
	 * @return Returns number of misses for the assignment  
	 */
	public int getMisses() {
		return missCount;
	}
}
