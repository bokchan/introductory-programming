package defaultpackage;

import java.awt.Rectangle;

import javax.swing.JFrame;


public class TranslateDemoViewer {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		Rectangle box = new Rectangle(0, 0, 0, 0);
		
		box.setBounds(10, 10, 10 ,10);
		
		
		//JOptionPane.showMessageDialog(frame, "Click ok to continue");
		//box.grow((int) box.getHeight()/ 2, (int) box.getWidth()/2 );
		
		//frame.setBounds(box);
		
		
		
		
				
	} 
	
}


