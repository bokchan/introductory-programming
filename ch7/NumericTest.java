package ch7;

import org.junit.Assert;
import org.junit.Test;

public class NumericTest {
	@Test public void intPowerTest() {
		
		double EPSILON = 0.00;
		double expected = 4.0;
		Assert.assertEquals(expected, Numeric.intPower(2.0, 2), EPSILON);
	}
}
