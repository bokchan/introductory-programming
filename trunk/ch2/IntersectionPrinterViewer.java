package ch2;

import javax.swing.JFrame;

public class IntersectionPrinterViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		IntersectionPrinter i = new IntersectionPrinter();
		frame.add(i);
		frame.setVisible(true);	
	}

}
