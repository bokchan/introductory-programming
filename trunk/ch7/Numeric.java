package ch7;

public class Numeric {
	public static double intPower(double x, int n) {
		double retVal = 0;
		if (n < 0) {
			retVal = 1 / Math.pow(x, -n);

		} else  if (n > 0 && n % 2 == 0) {
			retVal = Math.pow(Math.pow(x, n/2), 2);
		}
		else {
			retVal = Math.pow(x, n-1) * x;
		}

		return retVal; 

	}
}
