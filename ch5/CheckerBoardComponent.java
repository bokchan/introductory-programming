package ch5;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class CheckerBoardComponent extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		CheckerBoard cb = new CheckerBoard();
		cb.draw(g2);
		
	}
}
