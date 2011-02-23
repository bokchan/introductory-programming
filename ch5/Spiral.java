package ch5;

import java.awt.Graphics2D;
import java.awt.Point;

/**
 * Assignment P5.19
 * @author Andreas
 *
 */
public class Spiral  {
	private Point startpoint;
	private SpiralComponent sc;

	public Spiral(Point point) {
		this.startpoint = point;
	}

	public void draw(Graphics2D g2) {
		
		Point p1 = startpoint;
		Point p2 = (Point) p1.clone();
		int distance = 10;
		
		int x = 1;
		int y = 0;
		
		while (x < 20) {
			p2 = (Point) p1.clone();

			// First line segment 
			p2.translate(x * distance, 0);
			drawLineSegment(g2, p1, p2);
			p1 = (Point) p2.clone();
			
			y++;
			// Second line segment
			
			p2 = (Point) p1.clone();
			// 
			p2.translate(0, y * -distance);
			drawLineSegment(g2, p1, p2);
			x++;
			
			// Third line segment 
			p1  = (Point) p2.clone();
			
			p2 = (Point) p1.clone();

			// 
			p2.translate(x * -distance, 0);
			drawLineSegment(g2, p1, p2);

			p1  = (Point) p2.clone();
			y++;
			
			// Third line segment 
			p1  = (Point) p2.clone();
			
			p2 = (Point) p1.clone();

			// 
			p2.translate(0, y * distance);
			drawLineSegment(g2, p1, p2);

			p1  = (Point) p2.clone();
			
			x++;
		}
		p2 = (Point) p1.clone();

		// First line segment 
		p2.translate(x * distance, 0);
		drawLineSegment(g2, p1, p2);
		p1 = (Point) p2.clone();
		
		
		// Second line segment
		
		p2 = (Point) p1.clone();
		// 
		p2.translate(0, y * -distance);
		drawLineSegment(g2, p1, p2);
		x++;

	

	}

	public SpiralComponent getComponent() {
		return this.sc;
	}

	public void drawLineSegment(Graphics2D g2, 
			Point sPoint, Point ePoint) {		
		g2.drawLine(
				(int) sPoint.getX(), 
				(int) sPoint.getY(), 
				(int) ePoint.getX(), 
				(int) ePoint.getY());

	}
}
