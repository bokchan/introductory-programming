package ch5;

import javax.swing.JFrame;

public class RandomCirclesRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomCirclesComponent rc = new RandomCirclesComponent();
		rc.setCircleCount(2000);
		rc.setFrameW(320);
		rc.setFrameH(240);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(320, 240);
		
		frame.add(rc);
		frame.setVisible(true);
	}

}
