package ch1;

import javax.swing.JOptionPane;

public class Project1_1 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("What is your name?");
		String action = JOptionPane.showInputDialog(null, "What do you want me to do?");
		JOptionPane.showMessageDialog(null, "I'am sorry " + name + ". I'm afraid I can't " + action);
		
		

	}

}
