package ch11.p16;

import java.util.Scanner;

/**
 * Andreas Bok Andersen Mandatory Assignment due 23/11/2010
 This program tests the calculation of 
 Fibonacci numbers using three methods: 
 iteration, recursion and recursion with an array.
 */
public class RecursiveFibonacci
{

	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = in.nextInt();

		if (n > 92) { 
			System.out.println("the n'th Fibanocci exceeds bounds for datatype long");
			System.exit(0);
		} 

		
		StringBuilder sb = new StringBuilder(); 

		System.out.println("Generating Fibonacci numbers using loop");
		long start = System.nanoTime(); 
		RecursiveFibonacciHelper.runLoopFibonacci(n);
		long end = System.nanoTime();
		
		sb.append(String.format("It took %s milliseconds to generate the first %s Fibonacci numbers using a iteration\n", 
				(end-start)/1000000, n ));
		
		System.out.println("Generating Fibonacci numbers using recursion");
		start = System.nanoTime(); 
		RecursiveFibonacciHelper.runRecursiveFibonacci(n);
		end = System.nanoTime();
		
		sb.append(String.format("It took %s milliseconds to generate the first %s Fibonacci numbers using recursion\n", 
				(end-start)/1000000, n ));
		
		System.out.println("Generating Fibonacci numbers using recursion buffered");
		start = System.nanoTime(); 
		RecursiveFibonacciHelper.runRecursiveBufferedFibonacci(n);
		end = System.nanoTime();
		
		sb.append(String.format("It took %s milliseconds to generate the first %s Fibonacci numbers using recursion with buffer\n", 
				(end-start)/1000000, n ));
		
		System.out.println(sb.toString());
	}
 
}