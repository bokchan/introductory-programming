package ch1;


public class P1_6 {
	static final String plus = "+";
	static final String minus = "-";
	static final String vLine = "|";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateStaircase();
	}
	
	/**
	 * 
	 */
	public static void CreateStaircase() {
		int whiteSpacesEven = 12;
		int whiteSpacesOdd = 12;
		
		
		for (int row = 0; row < 9; row++) {
			StringBuilder sb = new StringBuilder();
				if (row %2 == 0) {
				// Add whitespaces
					for (int col = 0; col < whiteSpacesEven; col++) {
						sb.append(" ");
					
					}
				
				// Add plus minus 
					for (int col = whiteSpacesEven; col < 16 ; col++)
					{
						if (col %4 == 0)
						{
							sb.append(plus);
							
						} else {
							sb.append(minus);
							
						}
						
					}
					// Append last +
					sb.append(plus);
	
					if (whiteSpacesEven != 0) {
						whiteSpacesEven -= 4; } else {whiteSpacesEven = 0;
					}
			
				PrintLine(sb.toString());
			} else {
				// Add whitespaces
				for (int col = 0; col < whiteSpacesOdd; col++) {
					sb.append(" ");
				
				}
				
				// Add vertical lines 
				for (int col = whiteSpacesOdd; col < 16 ; col++)
				{
					if (col % 4 == 0) {
						sb.append(vLine);
						
						}	else {
						sb.append(" ");
					}
					
				}
				// Append last vLine
				sb.append(vLine);
				PrintLine(sb.toString());
				
				if (whiteSpacesOdd != 0) {
					whiteSpacesOdd -= 4; } else {whiteSpacesOdd = 0;}		
			}
			 
		}
	} 
		
		
	
	public static void PrintLine(String line) {
		
		System.out.println(line);
	}

}
