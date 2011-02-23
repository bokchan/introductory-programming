package ch14.Review;

import java.util.LinkedList;

public class R14_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> staff = new LinkedList<String>();
		staff.addFirst("Harry");
		staff.addLast("Diana");
		staff.addFirst("Tom");
		// {Tom, Harry, Diana}
		System.out.println(staff.removeLast());
		// Diana 
		System.out.println(staff.removeFirst());
		//Tom 
		System.out.println(staff.removeLast());
		// Harry 

		
	}

}
