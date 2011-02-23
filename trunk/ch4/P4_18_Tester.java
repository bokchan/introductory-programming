package ch4;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class P4_18_Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P4_18 line1 = new P4_18(new Point2D.Double(2,2.1), new Point2D.Double(2,2.1));
		Line2D.Double line2 = 
			new Line2D.Double(new Point2D.Double(2.1, 5.3), 
					new Point2D.Double(1.1, -6.3));
		
		System.out.println(line1);
		System.out.println(line2);
		
		System.out.println("Line1 and Line2 intersects: " +  line1.intersects(line2));
		System.out.println("Line1 and Line2 are equal: " +  line1.equals(line2));
		System.out.println("Line1 and Line2 are parallel: " +  line1.isParallel(line2));
	}

}
