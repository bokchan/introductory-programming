package ch7;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Geometry {
	public static double sphereVolume(double r) {
		return 4 / 3 * Math.PI * Math.pow(r,3);

	}
	public static double sphereSurface(double r) {
		return 4 * Math.PI * Math.pow(r, 2);
	}

	public static double cylinderVolume(double r, double h) {
		return Math.PI * Math.pow(r,2 ) * h;

	}

	public static double cylinderSurface(double r, double h) {
		return 2 * Math.PI * r *  h;
	}

	public static double coneVolume(double r, double h) {
		return 1/3 * Math.PI * Math.pow(r,2) * h;

	}

	public static double coneSurface(double r, double h) {
		//pi a sqrt(a^2+h^2)
		return Math.PI * r * Math.sqrt( Math.pow(r, 2) + Math.pow(h, 2));
	}

	public static double perimeterEllipse(Ellipse2D.Double e) {
		// http://www.mathsisfun.com/geometry/ellipse-perimeter.html
		//http://groups.google.com/group/sci.math/msg/8a7094d1c0c0031f?pli=1
		double axisMajor =  e.getWidth();
		double axisMinor = e.getHeight();
		double sub1 = 4 * (axisMajor + axisMinor);
		double sub2 = Math.PI / 4;
		double sub3 = (4* axisMajor * axisMinor) / Math.pow((axisMajor + axisMinor),2);
				
		return sub1 * Math.pow(sub2, sub3);
	}

	public static double areaEllipse(Ellipse2D.Double e) {
		return Math.PI * e.getHeight() * e.getWidth();

	}
	
	public static boolean isInside(Point2D.Double p, Ellipse2D.Double e) {
		
		return e.contains(p);
		
	}
	
	public static boolean isOnBoundary(Point2D.Double p, Ellipse2D.Double e) {
		
		return e.intersects(p.getX(), p.getY(), 1, 1);
	}
}