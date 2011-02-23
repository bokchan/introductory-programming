package ch1;

import javax.swing.JOptionPane;

public class P1_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.printf("Hello %s", name);
		System.exit(0);
	}
}
