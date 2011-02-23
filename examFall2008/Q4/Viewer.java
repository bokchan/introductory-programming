package examFall2008.Q4;

import javax.swing.JFrame;

public class Viewer{
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	public static void main (String[] args) {
		final Component component = new Component(FRAME_WIDTH, FRAME_HEIGHT);
		
		
		JFrame frame = new JFrame();
		
		frame.add(component);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}	
}
