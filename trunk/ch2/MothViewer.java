package ch2;

import javax.swing.JFrame;

public class MothViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MothComponent moth= new MothComponent();
		
		frame.add(moth);
		frame.setVisible(true);		
	}

}
