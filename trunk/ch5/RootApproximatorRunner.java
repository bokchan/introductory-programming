package ch5;

public class RootApproximatorRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RootApproximator approx = new RootApproximator(2, 0.0000000001);
		
		System.out.println(approx.nextGuess());
		System.out.println(approx.nextGuess());
		while(approx.hasMoreGuesses()) {
			System.out.println(approx.nextGuess());
			
		}		
	}

}
