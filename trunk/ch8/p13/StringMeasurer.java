package ch8.p13;

public class StringMeasurer implements Measurer{

	public double measure(Object anObject) {
		// TODO Auto-generated method stub
		String s = (String) anObject;
		return s.length();
	}
	
}
