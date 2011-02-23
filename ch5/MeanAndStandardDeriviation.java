package ch5;

import java.util.List;

public class MeanAndStandardDeriviation {
	private int count; 
	private double average;
	private double standardDeriviation;
	private List<Double> inputs;
	private double sum =0;

	public MeanAndStandardDeriviation(List<Double> inputs) {

		super();
		this.inputs = inputs;

		for (Double d : inputs) {
			sum += d;
		}
		count = inputs.size();
		average = sum / count;
		standardDeriviation = computeStandardDeriviation();
	} 



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public double getAverage() {
		return average;
	}



	public void setAverage(double average) {
		this.average = average;
	}



	public double getStandardDeriviation() {
		return standardDeriviation;
	}



	public void setStandardDeriviation(double standardDeriviation) {
		this.standardDeriviation = standardDeriviation;
	}



	public List<Double> getInputs() {
		return inputs;
	}



	public void setInputs(List<Double> inputs) {
		this.inputs = inputs;
	}



	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	private double computeStandardDeriviation() {
		return  
		Math.sqrt(Math.pow(sum, 2) - (1/count * Math.pow(sum, 2))) /
		(count - 1);
	}
}
