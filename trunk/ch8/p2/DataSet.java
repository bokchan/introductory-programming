package ch8.p2;

public class DataSet {
	private double sum;
	private Object maximum;
	private Object minimum;
	private int count;
	private Measurer measurer;

	/**
	 * Construcs an empty data set with a given measurer and filter 
	 * @param aMeasurer 
	 * @param aFilter
	 */
	public DataSet(Measurer aMeasurer) {
		sum = 0;
		count = 0;
		maximum = null;
		measurer = aMeasurer;
	}

	/**
	 * adds a data value to the data set 
	 * @param x a data value
	 */
	public void add(Object x) {

		sum = sum + measurer.measure(x);
		if (count == 0 || measurer.measure(maximum) < measurer.measure(x)){
			maximum = x;
		}
		if (count == 0 || measurer.measure(minimum) > measurer.measure(x)){
			minimum = x;
		}
		count++;
	}


/**
 * Gets the average of the added data
 * @return the average or 0 if no adata has been added  
 */
public double getAverage() {
	if (count == 0) return 0;
	else return sum / count;
} 

/**
 * Gets the largest of the added data 
 * @return the maximum or 0 if no data has been added
 */
public Object getMaximum() {
	return maximum;
}


public Object getMinimum() {
	return minimum;
}

/**
 * Get the count of objects in the dataset
 * @return the count of objects in the dataset
 */
public int getCount() {
	return count;
}
}
