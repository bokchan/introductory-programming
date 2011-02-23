package ch4;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Circle {
	private double radius;
	private double area;

	private Point2D center;

	public double getArea() {
		area = radius * Math.pow(Math.PI, 2);
		return area;
	}

	public Circle(Point2D center, double radius) {
		this.radius = radius;
		this.center = center;
	}

	public Point2D getCenter() {
		return this.center;
	}

	public double getRadius() {
		return this.radius;
	} 
	
	public boolean intersects(Circle other) {
		double dxRadius = 
			this.getCenter().distance(other.getCenter());
		System.out.println(dxRadius);
		return this.getRadius() + other.getRadius() >= dxRadius;
	}
	
	public boolean isInside(Point2D p) {
		double dx = this.getCenter().distance(p);
		return dx <= this.getRadius();
		
	}

	public void fill(Graphics2D g2, Color fillColor) {
		g2.setColor(fillColor);
		Ellipse2D.Double circle = 
			new Ellipse2D.Double(
					this.center.getX()-this.getRadius(), 
					this.center.getY()-this.getRadius(), 
					2 * this.getRadius(), 2 * this.getRadius());
		g2.fill(circle);
	}
	
	public void draw(Graphics2D g2, Color color) {
		g2.setColor(color);
		Ellipse2D.Double circle = 
			new Ellipse2D.Double(
					this.center.getX()-this.getRadius(), 
					this.center.getY()-this.getRadius(), 
					2 * this.getRadius(), 2 * this.getRadius());
		g2.draw(circle);
	}
}
