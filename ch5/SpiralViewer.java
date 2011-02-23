package ch5;

import javax.swing.JFrame;

public class SpiralViewer {
	public static void main(String[] args) {
		SpiralComponent sc = new SpiralComponent();
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.add(sc);
		frame.setVisible(true);
	}
}
