package ch11.p16;

/**
 * Andreas Bok Andersen Mandatory Assignment due 23/11/2010
 * 
 *
 */
public  class RecursiveFibonacciHelper {
	private static long[] fibArray;

	/**
	 * 
	 * @param n The number of Fibonacci numbers to be calculated 
	 */
	public static void runLoopFibonacci(int n) {
		
		
		for (int i = 1; i <= n; i++)
		{
			long f = fibLoop(i);
			//System.out.println("fib(" + i + ") = " + f);
		}

	}
	
	/**
	 * 
	 * @param n The number of Fibonacci numbers to be calculated 
	 */
	public static void runRecursiveFibonacci(int n) {
		fibArray = new long[n];
		for (int i = 1; i <= n; i++)
		{
			long f = fibRecursive(i);
			//System.out.println("fib(" + i + ") = " + f);
		}

	}
	
	/**
	 * 
	 * @param n The number of Fibonacci numbers to be calculated 
	 */
	public static void runRecursiveBufferedFibonacci(int n) {
		fibArray = new long[n];

		for (int i = 1; i <= n; i++)
		{			 
			long f = fibRecursiveBuffered(i);
			//System.out.println("fib(" + i + ") = " + f);
		}                    
	}
	
	/**
	 * Calculates a Fibonacci number using recursion 
	 * @param n
	 * @return
	 */
	private static long fibRecursive(int n)
	{	
		
		if (n <= 2) {
			fibArray[n-1] = 1;
			return 1;
		}
		else  {
			return fibRecursive(n-2) + fibRecursive(n-1); 	
		} 
	}


	/**
	 * Calcutes a Fibonacci number using recursion and an array for 
	 * already calculated numbers 
	 * @param n
	 * @return Return the i'th fibonacci number 
	 */
	private static long fibRecursiveBuffered(int n)
	{	
		if (n <= 2) {
			fibArray[n-1] = 1;
			return 1;
		}
		else  {
			fibArray[n-1] = fibRecursiveBuffered(n-1);
			return fibArray[n-2] + fibArray[n-1]; 	
		} 
	}

	/**
	 * Calculates a Fibonacci number using a loop 
	 * @param n  
	 * @return Return the i'th Fibonacci number 
	 */
	private static long fibLoop(int n)
	{  
		if (n <= 2) { return 1; }
		long olderValue = 1;
		long oldValue = 1;
		long newValue = 1;
		for (int i = 3; i <= n; i++)
		{  
			newValue = oldValue + olderValue;
			olderValue = oldValue;
			oldValue = newValue;
		}
		return newValue;
	}
}
