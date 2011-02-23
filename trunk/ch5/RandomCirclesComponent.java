package ch5;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class RandomCirclesComponent extends JComponent{
	private int frameW; 
	private int frameH;
	private int circleCount;
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		RandomCircles rc = new RandomCircles(circleCount, frameW, frameH);
		rc.draw(g2);
	}

	public int getFrameW() {
		return frameW;
	}

	public void setFrameW(int frameW) {
		this.frameW = frameW;
	}

	public int getFrameH() {
		return frameH;
	}

	public void setFrameH(int frameH) {
		this.frameH = frameH;
	}

	public int getCircleCount() {
		return circleCount;
	}

	public void setCircleCount(int circleCount) {
		this.circleCount = circleCount;
	}
	
	
}
