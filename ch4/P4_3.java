package ch4;

import java.util.Arrays;

public class P4_3 {
	private double[] array;

	public P4_3 () {}

	public double[] GetSortedNumbers() {
		Arrays.sort(array);
		return array;
	} 

	public void setArray(double[] array) {
		this.array = array;

	}
}
