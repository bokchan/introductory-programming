package ch14.Review;

import java.util.Stack;

public class R14_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> alphabet = new Stack<String>();
		alphabet.push("a");
		alphabet.push("b");
		alphabet.push("c");
		alphabet.push("d");
		Stack<String> alphabet2 = new Stack<String>();
		alphabet2.push(alphabet.pop());
		alphabet2.push(alphabet.pop());
		alphabet2.push(alphabet.pop());
		alphabet2.push(alphabet.pop());
		
		
		System.out.println(alphabet2.pop());
		System.out.println(alphabet2.pop());
		System.out.println(alphabet2.pop());
		System.out.println(alphabet2.pop());
		
		

	}

}
