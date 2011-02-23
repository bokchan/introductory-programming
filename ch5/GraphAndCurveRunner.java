package ch5;

import javax.swing.JFrame;

public class GraphAndCurveRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphAndCurveComponent component = new GraphAndCurveComponent();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.add(component);
		frame.setVisible(true);
	}

}
