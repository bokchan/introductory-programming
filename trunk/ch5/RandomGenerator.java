package ch5;

public class RandomGenerator {
	private double sum;
	private double max; 
	
	private int count; 
	public RandomGenerator() {
		this.sum = 0;
		GenerateNumbers();
		
	}
	
	private void GenerateNumbers() {
		for (int i =0; i < 100; i++) {
			double number = Math.random() * 1000;
			if (count == 0 || max < number) max = number;
			sum+=number;
			count++;
		}
	}
	
	public double getAverage() {
		return sum/count;
		
	}
	
	public double getMax() {
		return max;
	}
}

