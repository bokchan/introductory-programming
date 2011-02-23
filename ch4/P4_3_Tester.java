package ch4;

import java.util.Scanner;

public class P4_3_Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Input 3 numbers");
		double[] array = new double[3]; 
		for (int i = 0; i < 3; i++) {
			array[i] = s.nextDouble();
		} 
		P4_3 p = new P4_3();
		p.setArray(array);
		System.out.println("Unsorted numbers");
		for (double d : array) {
			System.out.println(String.valueOf(d));
		}
		System.out.println("Sorted numbers");
		array = p.GetSortedNumbers();
		for (double d : array) {
			System.out.println(String.valueOf(d));
		}
	}
}
