package ch5;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class GraphAndCurve {
	private Point2D.Double point1;
	private Point2D.Double point2;
	
	public GraphAndCurve() {
		
		
	}
	
	public void draw(Graphics2D g2) {
		int x2 = 1;
		Line2D.Double line = new Line2D.Double();
		for (int x1 = 0; x1 <= 400; x1++  ) {
			
			Point2D.Double point1 = getNewPoint(x1) ;
			System.out.println(point1);
			
			Point2D.Double point2 = getNewPoint(x2) ;
			System.out.println(point2);
			line = new Line2D.Double(point1, point2);
			g2.draw(line);
			x2++;
		}
		
		
		
		
	}
	
	public Point2D.Double getNewPoint(int x ) {
		double y;
		
		 y = (0.00005 * Math.pow(x, 3)) 
				- 0.03 * Math.pow(x, 2) 
				+ 4* x + 200;
		return new Point2D.Double(x, y);
	}
}
