package ch14.Programming;

import ch14.Programming.LinkedList.LinkedListIterator;

public class LinkedListTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList staff = new LinkedList();
		LinkedListIterator iterator = (LinkedListIterator) staff.listIterator();
		iterator.add("John");
		iterator.add("Peter");
		iterator.add("Tony");
		
		System.out.println(staff.size());
		

	}

}
