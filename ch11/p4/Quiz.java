package ch11.p4;

import java.util.ArrayList;

/**
 * Quiz holding different levels 
 * @author Andreas
 *
 */
public class Quiz {

	// Total score for the quiz
	private int score = 0;
	// Number of allowed tries per question  
	private int failureTolerance = 0;
	// Minimum number of points to complete a level
	private int pointsToComplete = 0;
	private String DESCRIPTION = "Welcome to quizman. Please try to answer the questions. You have %s %s per question. In order to advance to the next level you must get at least %s %s."; 
	
	private ArrayList<Level> levels = new ArrayList<Level>();
	
	/**
	 * 
	 * @param failureTolerance Number of allowed tries per question
	 * @param pointsToComplete Minimum number of points to complete a level
	 */
	public Quiz(int failureTolerance, int pointsToComplete) {
		this.failureTolerance = failureTolerance;
		this.pointsToComplete = pointsToComplete;
		String strTry = failureTolerance != 1 ? "tries" : "try";
		String strPoints = pointsToComplete != 1 ? "points" : "point";
		this.DESCRIPTION = String.format(DESCRIPTION, failureTolerance, strTry, pointsToComplete, strPoints);
	}
		
	/**
	 * 
	 * @param level Level as int 
	 * @param numberOfAssignments Number of assignments in the level 
	 */
	public void addLevel(int level, int numberOfAssignments) {
		levels.add(new Level(level, 
				numberOfAssignments));
	}  
	
	/**
	 * 
	 * @param level Zero based index of a level 
	 * @return Returns a level at a given index
	 */
	public Level getLevel(int level) {
		return levels.get(level);
	}
	
	/**
	 * 
	 * @return Returns an arraylist of levels 
	 */
	public ArrayList<Level> getLevels() {
		return levels;
	}
	
	/**
	 * Adds one point to the total score 
	 */
	public void addScore() {
		score++;
	} 
	
	/**
	 *  
	 * @return Returns the total score 
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * 
	 * @return Returns the number of allowed tries per question 
	 */
	public int getFailureTolerance() {
		return failureTolerance;
	}
	
	/**
	 * 
	 * @return Returns the minimum number of points to complete a level 
	 */
	public int getPointsToComplete() {
		return pointsToComplete;
	}
	
	/**
	 * 
	 * @return Returns the descripton for the quiz 
	 */
	public String getDescription() {
		return DESCRIPTION;
	}
} 