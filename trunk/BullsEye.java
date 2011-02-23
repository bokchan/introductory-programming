import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class BullsEye {
	private final Color color1;
	private final Color color2;
	private final int radius;
	private final int width;

	public static class Builder {
		private Color color1 = Color.white;
		private Color color2 = Color.black;
		private int radius;
		private int width;

		public Builder color1(Color c) {color1 = c; return this;}
		public Builder color2(Color c) {color2 = c; return this;}
		public Builder radius(int r) {radius = r; return this;}
		public Builder width(int r) {width = r; return this;}
	      public BullsEye build() {
	          return new BullsEye(this);
	       }
	}
	private BullsEye(Builder builder) {
		color1 = builder.color1;
		color2 = builder.color2;
		radius = builder.radius;
		width = builder.width;
	}
	
	public void draw(Graphics2D g2) {
		
		int xInit = 0;
		int yInit = 0;
		int circleCounter = 0;
		for (int i = 2 * radius; i > 0; i-=width) {
			
			g2.setColor(this.color1);
			Ellipse2D.Double circle1 = new Ellipse2D.Double(xInit, 
					yInit,  
					(2 * radius) - (circleCounter * width) , 
					(2 * radius) - (circleCounter * width));
			g2.fill(circle1);
			
			circleCounter++;
			
			g2.setColor(this.color2);
			Ellipse2D.Double circle2 = new Ellipse2D.Double(
					xInit + width/2,
					yInit + width/2, 
					(2 * radius) - (circleCounter * width) , 
					(2 * radius) - (circleCounter * width));
			g2.fill(circle2);
			
			xInit += width;
			yInit += width;
			
			circleCounter++;
	
		}
				
	}

}
