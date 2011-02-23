package examFall2008.Q1;

public class question1_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		star(11);
	}

	public static void star(int n) {
		if (n%2 == 0 || n < 1) {
			System.out.println("input must not be" + 
					" an even number and must greater 0");
		}

		int starcount = 1; 
		boolean middle = false;

		for (int rows = 0 ; rows < n; rows ++) {
			String  line = ""; 
			for (int j = 0; j < (n-starcount) /2; j++) {
				line = line + " ";
			}

			for (int k = 0; k<starcount; k++) {
				line = line + "*";
			}

			for (int l = 0; l < (n-starcount) /2; l++) {
				line = line+ " ";
			}

			if (n == starcount) middle = true; 
			if (middle)
				starcount = starcount - 2; else
					starcount = starcount +2;
			System.out.println(line);
		}
	}

}
