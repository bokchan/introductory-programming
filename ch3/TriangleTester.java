package ch3;

import java.awt.geom.Point2D;

public class TriangleTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t =new Triangle.Builder()
		.corner1(new Point2D.Double(30,80))
		.corner2(new Point2D.Double(180,280))
		.corner3(new Point2D.Double(100,100)).build();

		
		System.out.println("The triangle has the following perimeter:\n" + t.perimeter());
		System.out.println("The triangle has the following area:\n"+t.area());
		t.draw();
		System.out.print(t.sideLength());
		System.out.println(t.angles());

	}

}
