package ch2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class MothComponent extends JComponent{

	public void paintComponent(Graphics g) {
		Point2D.Double light = new Point2D.Double(100, 400);
		Graphics2D g2 = (Graphics2D) g;
		
		Moth m = new Moth.Builder()
		.position(new Point2D.Double(50, 5))
		.build();
		m.draw(g2);
		while (m.DistanceToLightSource(light) > 0) {
		m.moveToLight(light);
		m.draw(g2);
		}
		
	}
}
