package examFall2008.Q3;



public class SleepExperiment {
	int[] alloweddigits;
	int[] input;
	int[] result;
	
	
	public SleepExperiment(int[] alloweddigits, int[] input) {	
		this.alloweddigits = alloweddigits;
		this.input = input;
		result = new int[input.length];
	}
	
	public int[] DoExperiment() {
		int tmp;
		for (int i = 0; i < input.length; i++) {
			if (i == 0) {
				tmp = compare(input[i], input[i+1]);
				
				
			} else {
				tmp = compare(result[i-1], input[i]);
			
				
			}
		
			result[i] = tmp;
		}
		
		return result;
	}
	
	public int compare(int i1, int i2) {
		
		if (i1 == i2) return i1; else {
			for (int i = 0; i < alloweddigits.length; i++) {
				if (alloweddigits[i] != i1 && alloweddigits[i] != i2) 
					return alloweddigits[i]; 
			}
		}
		
		return -1;
	}
}
