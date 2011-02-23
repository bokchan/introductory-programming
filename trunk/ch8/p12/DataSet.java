package ch8.p12;

public class DataSet {
	private double sum;
	private Object maximum;
	private int count;
	private Measurer measurer;
	private Filter filter;

	/**
	 * Construcs an empty data set with a given measurer and filter 
	 * @param aMeasurer 
	 * @param aFilter
	 */
	public DataSet(Measurer aMeasurer, Filter aFilter) {
		sum = 0;
		count = 0;
		maximum = null;
		measurer = aMeasurer;
		filter = aFilter;
	}

	/**
	 * adds a data value to the data set 
	 * @param x a data value
	 */
	public void add(Object x) {
		if (filter.accept(x)) {
			sum = sum + measurer.measure(x);
			if (count == 0 || measurer.measure(maximum) < measurer.measure(x) && 
					filter.accept(x)){
				maximum = x;
			}
			count++;
		}
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

	/**
	 * Get the count of objects in the dataset
	 * @return the count of objects in the dataset
	 */
	public int getCount() {
		return count;
	}
}
