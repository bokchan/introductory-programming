package examFall2008.Q4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class Component extends JComponent implements MouseListener{
	private Rectangle box; 
	private Color c; 
	public Component(int width, int height) {
		this.addMouseListener(this);
		box = new Rectangle(0,0,width, height);
		
	}
	
	public void paintComponent(Graphics g ) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(c);
		g2.fill(box);
	}
	
	public void setColor(Color c) {
		
		this.c = c;
		this.repaint();
	}
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setColor(Color.BLUE);
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setColor(Color.BLACK);
	}
}
