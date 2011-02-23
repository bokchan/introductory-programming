package ch7;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

import org.junit.Assert;
import org.junit.Test;

public class GeometryTest {

	@Test public void GeometryTest() {
		Ellipse2D.Double e = new Ellipse2D.Double(0, 0, 10, 3);
		System.out.println(Geometry.perimeterEllipse(e));
		Assert.assertEquals("29.886438371472803", Geometry.perimeterEllipse(e), 0.01);
	}
	
	@Test public void EllipsePointTest() {
		Ellipse2D.Double e = new Ellipse2D.Double(0, 0, 10, 3);
		Point2D.Double p = new Point2D.Double(0, 1.5);
		System.out.println(Geometry.isInside(p, e));
		System.out.println(Geometry.isOnBoundary(p, e));
	}
}