package ch14.Review;

import java.util.LinkedList;

public class R14_2 {
	public static void main(String[] args) {
		
		LinkedList<String> staff = new LinkedList<String>();
		staff.addFirst("Harry");
		staff.addFirst("Diana");
		staff.addFirst("Tom");
		System.out.println(staff.removeLast());
		System.out.println(staff.removeFirst());
		System.out.println(staff.removeLast());
	}
}
