package ch2;

import javax.swing.JFrame;

public class GrowSquarePrinterViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		
		GrowSquarePrinter gsp = new GrowSquarePrinter();
		frame.add(gsp);
		
		frame.setVisible(true);
		System.out.print(gsp.getX());

	}

}
