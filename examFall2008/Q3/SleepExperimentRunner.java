package examFall2008.Q3;

public class SleepExperimentRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {1,1,4,4,9,4,9,4};
		int[] alloweddigits = {1,4,9};
		SleepExperiment se = new SleepExperiment(alloweddigits, input);
		
		
		
		int[] res =se.DoExperiment();
		
		for (int i : res) {
			System.out.println(i);
		}
		
	}

}
