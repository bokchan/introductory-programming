package ch2;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Moth {
	private Point2D.Double position;
	
	public void setPosition(Point2D.Double p) {
		this.position = p;
		
	}
	public static class Builder {
		private Point2D.Double position;
		
		
		public Builder position(Point2D.Double pos) {position = pos; return this;}
		
		public Moth build() {
			return new Moth(this);
			
		}
	}
	
	public Moth(Builder builder) {
		position = builder.position;
	}
	
	public Point2D.Double getPosition() {
		return this.position;
	}
	
	public void moveToLight(Point2D.Double lightPoint) {
		double dx;
		double dy;
		
		dx = lightPoint.x - position.x;
		dy = lightPoint.y - position.y;
		setPosition(new Point2D.Double(position.x + dx/2, position.y + dy/2));
	}
	
	public void draw(Graphics2D g2) {
		
		Ellipse2D.Double moth = new Ellipse2D.Double(getPosition().x, getPosition().y, 5, 5);
		g2.fill(moth);
		g2.draw(moth);
	}
	
	public double DistanceToLightSource(Point2D.Double lightSource) {
		 return getPosition().distance(lightSource);
	}
}
