package ch5;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JComponent;

public class SpiralComponent extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;  
		Spiral s = new Spiral(new Point(300, 300));
		s.draw(g2);
	}
}
