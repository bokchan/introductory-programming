package ch4;

import java.util.Scanner;

public class P4_11_Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input month");
		int month = sc.nextInt();
		System.out.println("Input month");
		int day = sc.nextInt();
		
		P4_11 p = new P4_11();
		
		System.out.println(p.getSeason(month, day));
	}

}
