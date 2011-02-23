package ch8.p2;

public class QuizMeasurer implements Measurer {
	
	public double measure(Object anObject) {
		// TODO Auto-generated method stub
		Quiz q = (Quiz) anObject;
		return q.getScore();
	}
}
