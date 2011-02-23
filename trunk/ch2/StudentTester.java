package ch2;

public class StudentTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student("Andreas Bok Andersen");
		stud.addScore(2.5);
		stud.addScore(10);
		stud.addScore(18.6);
		
		System.out.printf("Average score is :%s", stud.getAverage());
		
		
	}

}
