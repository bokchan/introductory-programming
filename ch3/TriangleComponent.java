package ch3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class TriangleComponent extends JComponent{
	private Triangle t ;

	
	public TriangleComponent(Triangle t) {
		this.t = t;	
	}
public void paintComponent(Graphics g) {
	
	Graphics2D g2 = (Graphics2D) g;
	Line2D.Double line = new Line2D.Double(t.getCorner1(), t.getCorner2());
	g2.draw(line);
	line = new Line2D.Double(t.getCorner2(), t.getCorner3());
	g2.draw(line);
	line = new Line2D.Double(t.getCorner3(), t.getCorner1());
	g2.draw(line);
	
	
}
}
