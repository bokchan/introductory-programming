package ch6;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;


public class ChartComponent extends JComponent{
	private Chart chart;
	
	public ChartComponent(Chart c) {
		this.chart = c;
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		chart.draw(g2);
	}
}
