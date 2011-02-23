package ch5;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class CheckerBoard {
	public CheckerBoard() {}

	public void draw(Graphics2D g2) {
		int sideLength = 80;
		int x = 0;
		int y = 0;
		int dx = 80;
		int dy = 80;


		for (int r = 0; r < 8; r++)  {
			if (r % 2 ==0 ) {
				for (int c = 0; c < 8; c++) {
					Rectangle2D.Double sq = new Rectangle2D.Double(c* dx,r*dy, sideLength, sideLength);

					if (c % 2 == 0) {
						g2.setColor(Color.white) ;
					}  else {
						g2.setColor(Color.black);
					}

					g2.fill(sq);
					x++;
				}
			} else {
				for (int c = 0; c < 8; c++) {
					Rectangle2D.Double sq = new Rectangle2D.Double(c* dx,r*dy, sideLength, sideLength);

					if (c % 2 == 0) {
						g2.setColor(Color.black) ;
					}  else {
						g2.setColor(Color.white);
					}

					g2.fill(sq);
					x++;
				}
			}
		}
	}
}
