package ch14.Review;

import java.util.LinkedList;

public class R14_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> staff = new LinkedList<String>();
		staff.addFirst("Harry");
		staff.addFirst("Diana");
		staff.addFirst("Tom");
		System.out.println(staff.removeFirst());
		System.out.println(staff.removeFirst());
		System.out.println(staff.removeFirst());
		
	}

}
