package ch4;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class P4_18 {
	private Line2D line;

	public P4_18(Point2D p1, Point2D p2) {
		line = new Line2D.Double(p1, p2);	
	}

	public P4_18(Point2D p1, double slope ) {
		line = new Line2D.Double();
		Point2D.Double p2 = 
			new Point2D.Double(p1.getX() * slope, p1.getX() * slope);
	}

	public P4_18(double slope, double bIntercept) {
		Point2D.Double p1 = new Point2D.Double(0, bIntercept);
		Point2D.Double p2 = new Point2D.Double(1,slope + bIntercept);
		line = new Line2D.Double(p1, p2);
	}

	public P4_18(double x) {
		Point2D.Double p1 = 
			new Point2D.Double(x, 0);
		Point2D.Double p2 = 
			new Point2D.Double(x, 1);	
		line= new Line2D.Double(p1, p2);
	} 

	public boolean intersects(Line2D other) {
		return line.intersectsLine(other);

	} 

	public boolean equals(Line2D other) {
		return (line.contains(other.getP1()) && 
				line.contains(other.getP2()));
	} 

	public boolean isParallel(Line2D other) {
		double dy1 = line.getP2().getY() - line.getP2().getY();
		double dy2 = other.getP2().getY() - other.getP2().getY();
		double dx1 = line.getP2().getX() - line.getP2().getX();
		double dx2 = other.getP2().getX() - other.getP2().getX();
		return ((dy1/dx1) == (dy2 / dx2));
	}
}
