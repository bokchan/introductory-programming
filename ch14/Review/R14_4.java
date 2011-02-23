package ch14.Review;

import java.util.LinkedList;
import java.util.ListIterator;

public class R14_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> staff = new LinkedList<String>();
		ListIterator<String> iterator = staff.listIterator();
		iterator.add("Tom");
		iterator.add("Diana");
		iterator.add("Harry");
		iterator = staff.listIterator();

		if (iterator.next().equals("Tom"))
			iterator.remove();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		} 

	}

}


