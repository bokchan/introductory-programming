package ch8.p13;

import org.junit.Test;

public class DataSetTester {
	@Test public void DataSetTest() {
		DataSet ds = new DataSet(new StringMeasurer());
		ds.add("sdælkfuhs");
		ds.add("s");
		ds.add("ljhdslkjlkjshd");
		ds.add("gflfdsllsfdljsdfljsdfjsdf");
		
		System.out.println("Min:" + ds.getMinimum() );
		System.out.println("Max:" + ds.getMaximum() );
	}
}
