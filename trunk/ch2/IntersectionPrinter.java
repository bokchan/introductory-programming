package ch2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class IntersectionPrinter extends JComponent {

	
	public void paintComponent(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g;
		Rectangle r1 = new Rectangle(10, 10, 30, 50);
		Rectangle r2 = new Rectangle(100, 20, 50, 30);
		g2.draw(r1);
		g2.draw(r2);
		System.out.println(r1);
		System.out.println(r2);
		
		
		System.out.println(IsIntersection(r1, r2));
	}
	
	public boolean IsIntersection(Rectangle r1, Rectangle r2) {
		Rectangle intersection = r1.intersection(r2);
		System.out.println(intersection);
		return intersection.height > 0 && intersection.width > 0 ? true : false ;
	}
}
