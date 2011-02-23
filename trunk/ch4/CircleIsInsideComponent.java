package ch4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class CircleIsInsideComponent extends JComponent {
	private ArrayList<Circle> circles = new ArrayList<Circle>();
	private Color fillColor; 
	private Graphics2D g2; 
	public CircleIsInsideComponent(ArrayList<Circle> circles, Color fillColor) {
		this.circles = circles;
		this.fillColor = fillColor;
	}
	
	public void paintComponent(Graphics g) {
		g2 = (Graphics2D) g;
		
		circles.get(0).draw(g2, fillColor);
		circles.get(1).fill(g2, fillColor);
	}
	
}

