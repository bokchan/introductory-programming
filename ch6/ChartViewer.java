package ch6;

import javax.swing.JFrame;

public class ChartViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chart c = new Chart(600,400);
		ChartComponent cp = new ChartComponent(c);
		
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(cp);
		frame.setVisible(true);
	}

}
