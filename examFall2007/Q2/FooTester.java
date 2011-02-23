package examFall2007.Q2;

public class FooTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10; 
		while (n > 0) {
			System.out.println(500/n);
			n = foo(n);
		}
		
		System.out.println(500/n);

	}
	
	private static int foo(int n) {
		
		//return (n-1);
		if (n == 1) return -1; else
			return (n-1); 
	}

}
