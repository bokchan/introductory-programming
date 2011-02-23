package examFall2008.Q1;

import java.util.Random;

public class question1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; 
		for (int i = 0;i < 7; i++) {
			for (int j = 2; j < i; j++) {
				sum = sum+j;
			}
			Random r = new Random();
			
			
			System.out.println(sum);
		}

	}

}
