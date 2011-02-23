package ch12.p2;

public class ReversePrinter2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Mississippi";
		Sentence s = new Sentence(input, 0, input.length());
		s.reverse();
		System.out.println(s.getReverse());
		
		System.out.println("Reverse Iteration");
		s.reverseIteration();
		System.out.println(s.getReverse());
		
		
		Sentence s2 = new Sentence(input, 0, input.length());
		System.out.println(s2.indexOf("sip"));

	}

}
