package ch4;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class CircleIsInside {
	Circle c1;
	Circle c2;
	Point2D point;
	CircleIsInsideComponent cp;
	
	
	public CircleIsInside(Point2D p) {
		
		this.point = p;
		c1 = new Circle(new Point2D.Double(200, 200), 100);
		c2 = new Circle(point, 5);
		ArrayList<Circle> circles = new ArrayList<Circle>();
		circles.add(c1);
		circles.add(c2);
		if (c1.isInside(p)) {
			cp = new CircleIsInsideComponent(circles, java.awt.Color.green);
			
		} else {
			cp = new CircleIsInsideComponent(circles, java.awt.Color.red);
			
		}
		
	}
	
	public JComponent getComponent() {
		return this.cp;
	}
}
