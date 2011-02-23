package ch11.p4;

import java.util.ArrayList;

public class Level {
	private int score = 0;
	private int numberOfAssignments;
	private int level = 1;
	
	private ArrayList<Assignment> assignments = new ArrayList<Assignment>();
	
	/**
	 * 
	 * @param level The value level of this level  
	 * @param numberOfAssignments number of assignments for this level
	 */
	public Level(int level, int numberOfAssignments) {
		this.level = level;
		this.numberOfAssignments = numberOfAssignments;
		
		// Set level score to zero
		score = 0;
		
		// Add assignments to the level 
		for(int i = 0; i < numberOfAssignments; i++) {
			assignments.add(AssignmentFactory.generateAssignment(level));
		}
	}

	/**
	 * 
	 * @return Returns the list of assignments 
	 */
	public ArrayList<Assignment> getAssignments() {
		return assignments;
	}
	
	/**
	 * Adds one point to the score
	 */
	public void addScore() {
		score++;
	}
	
	/**
	 * 
	 * @return Returns this level's score
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * 
	 * @return Returns the level as int
	 */
	public int getLevel() {
		return this.level;
	}

	/**
	 * 
	 * @return Returns the number of assignments in the level  
	 */
	public int getNumberOfAssignments() {
		return numberOfAssignments;
	}
	
	/**
	 * 
	 * @param index Assignment index. Zero based  
	 * @return Returns an assignment based on index 
	 */
	public Assignment getAssignment(int index) {
		return this.assignments.get(index);
	}
}