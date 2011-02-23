package ch12.p2;

public class ReversePrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		assert(args.length == 3);
		String text = args[0].toString();
		int start = Integer.valueOf(args[1].toString());
		int end = Integer.valueOf(args[2].toString());
		assert(end < text.length() && start > 0 && start <= end);
		Sentence s = new Sentence(text, start, end);
		s.reverse();
		System.out.println(s.getReverse());
		
		
	}

}
