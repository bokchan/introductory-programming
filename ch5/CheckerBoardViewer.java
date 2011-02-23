package ch5;

import javax.swing.JFrame;

public class CheckerBoardViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckerBoardComponent cbc = new CheckerBoardComponent();
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.add(cbc);
		frame.setVisible(true);
	}

}
