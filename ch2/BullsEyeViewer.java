package ch2;

import javax.swing.JFrame;


public class BullsEyeViewer {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BullsEyeComponent be = new BullsEyeComponent();
		frame.add(be);
		frame.setVisible(true);
	}

}
