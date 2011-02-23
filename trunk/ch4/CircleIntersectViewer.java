package ch4;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CircleIntersectViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 =  JOptionPane.showInputDialog("Input radius for the first circle");
		String input2 =  JOptionPane.showInputDialog("Input radius for the second circle");
		
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CircleIntersect ci = new CircleIntersect(
					Double.valueOf(input1), 
					Double.valueOf(input2));
		frame.add(ci.getComponent());
		frame.setVisible(true);
		
	}

}
