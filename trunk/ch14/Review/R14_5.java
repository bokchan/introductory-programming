package ch14.Review;

import java.util.LinkedList;
import java.util.ListIterator;

public class R14_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> staff = new LinkedList<String>();
		ListIterator<String> iterator = (ListIterator<String>) staff.listIterator();
		iterator.add("Tom");
		iterator.add("Diana");
		iterator.add("Harry");
		iterator = staff.listIterator();
		iterator.next();
		// p = Tom 
		iterator.next();
		// p = Diana
		iterator.add("Romeo");
		// Diana - p = Romeo - Harry 
		iterator.next();
		// p = Harry
		iterator.add("Juliet");
		// Harry - Julie 
		iterator =staff.listIterator();
		iterator.next();
		// p = Tom 
		iterator.remove();
		//First = Diana 
		while(iterator.hasNext() ) {
			System.out.println(iterator.next());
			// Diana Remoe Harry Juliet 
		}
		
		
		

	}

}
