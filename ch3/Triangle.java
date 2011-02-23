package ch3;

import java.awt.geom.Point2D;

import javax.swing.JFrame;


public class Triangle extends Shape{
	private Point2D.Double corner1 = new Point2D.Double();
	private Point2D.Double corner2 = new Point2D.Double();
	private Point2D.Double corner3 = new Point2D.Double();
	
	public static class Builder {
		private Point2D.Double _corner1;
		private Point2D.Double _corner2;
		private Point2D.Double _corner3;
		
		public Builder corner1(Point2D.Double point1) { _corner1 = point1; return this; }
		public Builder corner2(Point2D.Double point2) { _corner2 = point2; return this; }
		public Builder corner3(Point2D.Double point3) { _corner3 = point3; return this; }
		public Triangle build() {
			return new Triangle(this);
			
		}
	}	
	
	
	
	public Triangle(Builder builder) {
		corner1 = builder._corner1;
		corner2 = builder._corner2;
		corner3 = builder._corner3;	
	}
	
	public Point2D.Double getCorner1() {
		return corner1;
	}

	public Point2D.Double getCorner2() {
		return corner2;
	}

	public Point2D.Double getCorner3() {
		return corner3;
	}

	public double area() {
		// area = 1/2 * width * height 
		return corner1.distance(corner2) * corner1.distance(corner3) / 2;
		
	} 
	public double perimeter() {
		return corner1.distance(corner2) + corner2.distance(corner3) + corner3.distance(corner1);	
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(300, 300) ;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TriangleComponent tComp = new TriangleComponent(this);
		frame.add(tComp);
		frame.setVisible(true);
	}
	
	public String sideLength() {
		StringBuilder sb = new StringBuilder();
		sb.append("The triangle has the following sidelengths:\n");
		sb.append(corner1.distance(corner2) + "\n");
		sb.append(corner2.distance(corner3) + "\n");
		sb.append(corner3.distance(corner1) + "\n");
		
		return sb.toString();
	}
	
	public String angles() {
		StringBuilder sb = new StringBuilder();
		sb.append("The triangle has the following angles:\n");
		sb.append(
		calculateAngle(
				corner1.distance(corner2), 
				corner2.distance(corner3),
				corner1.distance(corner3)));
		sb.append("\n");
		sb.append(
				calculateAngle(
				corner2.distance(corner3), 
				corner3.distance(corner1),
				corner2.distance(corner1)));
		sb.append("\n");
		sb.append(
				calculateAngle(
				corner3.distance(corner1), 
				corner1.distance(corner2),
				corner3.distance(corner2)));
		sb.append("\n");
		return sb.toString();
	}
	
	public double calculateAngle(double lenA, double lenB, double lenC) {	
		double cosA =  
				(Math.pow(lenB,2) + Math.pow(lenC, 2) - Math.pow(lenA, 2)) / 
				(2 * lenB * lenC);
		
		return Math.acos(cosA)*180/Math.PI;
		
	}
}
