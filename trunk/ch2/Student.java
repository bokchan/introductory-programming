package ch2;
import java.util.ArrayList;


public class Student {

	private String name = "";
	
	private ArrayList<Double> scores = new ArrayList<Double>();
	
	public Student(String name) {
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public double getAverage() {
		double scoreSum = 0;
		for (double score : scores)
		{
			scoreSum += score;
		}
		 return scoreSum / scores.size();
	}
	public void addScore(double score) {
		scores.add(score);	
	}
}