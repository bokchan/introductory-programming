package ch1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class DrawnLetterComponent extends JComponent{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1556675187734336065L;

	public void paintComponent(Graphics g) {
		Graphics2D g2  = (Graphics2D) g;
		g2.setStroke(new BasicStroke(4.0f));
		
		double letterHeight = 50;
		double xOffset = 20;
		double yOffset = 20;
		double letterSpacing = 10;
		double letterWidth = 20;
			

		// Hello 
		
		//H
		g2.setColor(Color.red);
		
		Line2D.Double letter = new Line2D.Double(xOffset, yOffset, 20, 70);
		g2.draw(letter);
		
		g2.translate(letterWidth, 0);
		g2.draw(letter);
		
		letter.setLine(0, yOffset + (letterHeight/ 2), xOffset, yOffset + letterHeight / 2);
		g2.draw(letter);
		
		//E

		// Starting point for the new letter  
		xOffset += letterSpacing;
		
		g2.setColor(Color.BLUE);
		letter = new Line2D.Double(xOffset,
				yOffset, xOffset, yOffset + letterHeight);
		g2.draw(letter);
		letter = new Line2D.Double(xOffset, 
				yOffset, 
				xOffset + letterWidth, 
				yOffset);
		g2.draw(letter);
		g2.translate(0, letterHeight /2);
		g2.draw(letter);
		g2.translate(0, letterHeight /2);
		g2.draw(letter);
		
		// L 
		xOffset += letterWidth + letterSpacing;
		g2.translate(0, -letterHeight);
		g2.setColor(Color.YELLOW);
		letter = new Line2D.Double(xOffset, yOffset, xOffset, yOffset + letterHeight);
		g2.draw(letter);
		letter = new Line2D.Double(xOffset, yOffset + letterHeight,xOffset + letterWidth, yOffset + letterHeight);
		g2.draw(letter);
		
		// L
		xOffset += letterWidth + letterSpacing;
		g2.setColor(Color.GREEN);
		letter = new Line2D.Double(xOffset, yOffset, xOffset, yOffset + letterHeight);
		g2.draw(letter);
		letter = new Line2D.Double(xOffset, yOffset + letterHeight,xOffset + letterWidth, yOffset + letterHeight);
		g2.draw(letter);
		
		// O 
		xOffset += letterWidth + letterSpacing;
		g2.setColor(Color.CYAN);
		Ellipse2D.Double o = new Ellipse2D.Double(xOffset, yOffset, 20, 50);
		g2.draw(o);
			
				
		
		
	}  
}
