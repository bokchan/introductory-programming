package ch2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JComponent;

public class FourRectanglePrinter extends JComponent {
	//Declare class variables 
	private int x;
	private int y;
	private int dx;
	private int dy;
	private DRAWACTION drawAction;
	public enum DRAWACTION {FILL, LINE};
	private ArrayList<String> locations; 

	private Rectangle r;

	// Creating a static factory. from "Effective Java" by Joshua Bloch
	public static class Builder {
		
		// Declare local variables  
		private int _x;
		private int _y;
		private int _dx;
		private int _dy;
		private DRAWACTION _drawAction;

		// Set mutator methods for local variables  
		public Builder _x(int x) { _x = x ; return this;}
		public Builder _y(int y) { _y = y ; return this;}
		public Builder _dx(int dx) { _dx = dx ; return this;}
		public Builder _dy(int dy) { _dy = dy ; return this;}
		public Builder _drawAction(DRAWACTION drawAction) { 
			_drawAction = drawAction; return this; }

		// Build method returning a new FourRectanglePrinter 
		public  FourRectanglePrinter build() {
			return (new FourRectanglePrinter(this));
		}
	}	

	/**
	 *  Constructor for FourRectanglePrinter taking a Builder as argument 
	 *  
	 * @param builder of Type Builder
	 */
	public FourRectanglePrinter(Builder builder) {
		x = builder._x;
		y = builder._y;
		dx = builder._dx;
		dy = builder._dy;
		drawAction = builder._drawAction;
		
		r = new Rectangle(x, y, dx, dy);
		locations = new ArrayList<String>();
	}

	// This method draws and translates the rectangles  
	public void paintComponent(Graphics g ) {
		// Typecast of g to type Graphics2D
		Graphics2D g2 = (Graphics2D) g;	

		// Sets the color of the fill or line 
		g2.setColor(getColor());

		// Check whether the rectangle should be drawn or filled
		if (drawAction == DRAWACTION.LINE) g2.draw(r); else g2.fill(r);
		
		// Add locations to int array locations
		locations.add(r.getX() + "," +  r.getY());		

			// Sets the color of the fill or line
		g2.setColor(getColor());

		// Translate the previous rectangle 
		r.translate((int)r.getWidth(),0);

		// Check whether the rectangle should be drawn or filled
		if (drawAction == DRAWACTION.LINE) g2.draw(r); else g2.fill(r);
		
		//Add locations to int array locations
		locations.add(r.getX() + "," +  r.getY());

		g2.setColor(getColor());
		r.translate(0,(int) r.getHeight());
		if (drawAction == DRAWACTION.LINE) g2.draw(r); else g2.fill(r);
		locations.add(r.getX() + "," +  r.getY());

		g2.setColor(getColor());
		r.translate((int)-r.getWidth(),0);
		if (drawAction == DRAWACTION.LINE) g2.draw(r); else g2.fill(r);
		locations.add(r.getX() + "," +  r.getY());


		StringBuilder sb = new StringBuilder(); 
		int counter = 1;
		for (String entry : locations) {
			 sb.append(String.format("Location for Rectangle %s: {%s}\n", counter, entry));
			 counter++;
		 }
		System.out.println(sb.toString());
	}

	/**
	 * 
	 * @return returns a random color using Math.random  
	 */
	public Color getColor() {
		
		int R = (int) (Math.random()* 255);
		int G = (int) (Math.random()* 255);
		int B = (int) (Math.random()* 255);
		Color color = new Color(R, G, B); 
		return (color);
	}   
}
