package ch8.p2;

public class Quiz {

	private double score; 
	private String grade;

	public Quiz(int score, String grade) {
		super();
		this.score = score;
		this.grade = grade;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}	
}
