package ch2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class GrowSquarePrinter extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(100, 100, 50, 50);
		g2.draw(box);
		//System.out.printf("The rectangle has x-coordinate: %s and y-coordinate: %s", box.x, box.y );
		System.out.println(box);
		box.grow((int)box.getWidth()/ 2, (int)box.getHeight()/2);
		box.translate((int)box.getWidth()/ 4, (int)box.getHeight()/4);
		g2.draw(box);
		System.out.println(box);
		
		
	}

}
