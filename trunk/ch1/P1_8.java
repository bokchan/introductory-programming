package ch1;

public class P1_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(CalculateSum(1, 10));
	}
	
	public static int CalculateSum(int from, int to) {
		
		int sum = 0;
		for (int i = from; i <= to; i++ ) {
			sum += i; 
			
			}
		return sum; 
	}

}
