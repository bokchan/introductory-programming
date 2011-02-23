package ch2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class BullsEyeComponent extends JComponent{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4553833919952513328L;

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		BullsEye be = new BullsEye.Builder()
		.color1(Color.BLUE)
		.color2(Color.CYAN)
		.radius(100).width(20).build();
		
		be.draw(g2);
	}
}