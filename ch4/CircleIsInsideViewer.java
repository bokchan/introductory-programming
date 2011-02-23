package ch4;

import java.awt.geom.Point2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CircleIsInsideViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input1 =  JOptionPane.showInputDialog("Input x coordinate");
		String input2 =  JOptionPane.showInputDialog("Input y coordinate");
		
		JFrame frame = new JFrame();
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Point2D point = new Point2D.Double(
				Double.valueOf(input1), 
				Double.valueOf(input2));
		
		CircleIsInside ci = new CircleIsInside(point);
		frame.add(ci.getComponent());
		frame.setVisible(true);

	}

}
