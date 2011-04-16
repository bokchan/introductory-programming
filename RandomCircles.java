
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;




public class RandomCircles {
	private int circleCount;
	private int frameW;
	private int frameH;


	public RandomCircles(int circleCount, int frameW, int frameH) {
		this.circleCount = circleCount;
		this.frameW = frameW;
		this.frameH = frameH;

	}
	public void draw(Graphics2D g2) {

		for (int i = 0; i < circleCount; i++) {
			Point2D leftCorner = getLocation();
			double diameter = 
				Math.random() * (
						Math.min(frameW, frameH) - 2 * Math.max(leftCorner.getX(), leftCorner.getY()));
			
			Ellipse2D.Double circle = 
				new Ellipse2D.Double(
						leftCorner.getX(), 
						leftCorner.getY(), 
						diameter, 
						diameter);
			g2.draw(circle);
		}
	}

	private Point2D.Double getLocation() {
		double x = Math.random() * frameW / 2;
		double y = Math.random() * frameH / 2;

		return new Point2D.Double(x, y);
	}
}

