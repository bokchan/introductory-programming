package ch2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class OlympicRingsComponent extends JComponent{
	final static BasicStroke stroke = new BasicStroke(5.0f);
	public void paintComponent(Graphics g)
	{

		int  radius=25;
		Graphics2D g2 = (Graphics2D) g;

		g2.setStroke(stroke);
		Ellipse2D.Double circle = new Ellipse2D.Double(10, 10,2*radius, 2*radius);

		g2.setColor(Color.BLUE);
		
		g2.draw(circle);

		g2.setColor(Color.BLACK);
		g2.translate(2*radius, 0);
		g2.draw(circle);

		g2.setColor(Color.RED);
		g2.translate(2*radius, 0);
		g2.draw(circle);

		g2.setColor(Color.YELLOW);
		g2.translate(- 3 * radius, radius);
		g2.draw(circle);

		g2.setColor(Color.GREEN);
		g2.translate(2 * radius, 0);
		g2.draw(circle);



	}
}
