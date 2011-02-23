package ch5;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class GraphAndCurveComponent extends JComponent{
public void paintComponent(Graphics g) {
	Graphics2D g2 = (Graphics2D) g;
	GraphAndCurve gac = new GraphAndCurve();
	gac.draw(g2);
}
}
