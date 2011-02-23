package ch12.p2;

public class Sentence {
	private String substring = "";
	private String prefix = "";
	private String suffix = "";
	private String substringReverse = "";
	int indexOf = 0;

	public Sentence(String text, int start, int end ) {
		this.substring =  text.substring(start, end);
		this.prefix = text.substring(0, start);
		this.suffix = text.substring(end, text.length());

	}

	public boolean reverse() {
		int length = substring.length(); 
		if (length == 0) {
			return false;

		} 
		substringReverse += substring.substring(length-1);
		substring = substring.substring(0, substring.length()-1);
		return reverse();

	} 

	public String getReverse() {
		return prefix + substringReverse + suffix;
	}

	public void reverseIteration() {


		for (int i =  substring.length() -1; i >=0; i-- ) {
			substringReverse += substring.substring(i, i);  
		}
	}

	public String getSubstring() {
		return this.substring;
	}
	
	public int indexOf(String s) {
		
		if (substring.length() < s.length()) {
			indexOf = -1;
			return indexOf;
		} 
		
		System.out.println(substring.substring(0, s.length()));
		
		if (s.equalsIgnoreCase(substring.substring(0, s.length()))) {
			return indexOf;
		} else {
			
			indexOf++;
			substring = substring.substring(1, substring.length());
			return indexOf(s);
		}
		
		
	}

}
