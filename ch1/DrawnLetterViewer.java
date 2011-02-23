package ch1; 

import javax.swing.JFrame;

public class DrawnLetterViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawnLetterComponent o = new DrawnLetterComponent();
		frame.add(o);
		frame.setVisible(true);
		
	}

}
