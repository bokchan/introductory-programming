package ch6;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Chart {
	private final int frameHeight;
	private final int frameWidth; 
	private ArrayList<Double> bars;

	public Chart(int frameW, int frameH) {
		frameHeight = frameH;
		frameWidth = frameW;
		bars = new ArrayList<Double>();
		bars.add(200.0);
		bars.add(150.0);
		bars.add(300.0);
		bars.add(-25.0);
	}

	public void addBarValue(double value) {
		bars.add(value);
	}

	private double getMax() {
		double max = 0;
		for (double value : bars) {
			max = Math.max(max, value);
		}
		return max;
	}

	public void draw(Graphics2D g2 ) {
		int barCounter = 1;
		double scale = (frameHeight / 2 )/ getMax();
		g2.setColor(Color.black);
		for (double value : bars) {
			Rectangle2D.Double bar = new Rectangle2D.Double();
			bar.width = 10;
			bar.x = barCounter * 50;
			if (value >= 0) {
				bar.y = frameHeight/2 -(value * scale);
				bar.height = value * scale;
			} else {
				bar.y = frameHeight/2;
				bar.height = Math.abs( value * scale);
			}

			g2.fill(bar);
			barCounter++;
		}

		Line2D.Double xAxis = 
			new Line2D.Double(
					new Point2D.Double(0, frameHeight/2), 
					new Point2D.Double(frameWidth, frameHeight/2));
		g2.draw(xAxis);

	}
}
