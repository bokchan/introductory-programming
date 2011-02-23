package ch7;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {

	@Test public void SimpleTester() {
		Simple s = new Simple();
		double expected = 9.0;
		Assert.assertEquals(expected, s.squareRoot(3.0), 0.0);
	}
}
