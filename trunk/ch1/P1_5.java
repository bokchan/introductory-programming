package ch1;

public class P1_5 {

	static final String plus = "+";
	static final String minus = "-";
	static final String vLine = "|";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTicTacToeBoard();
		

	}
	
	public static void PrintTicTacToeBoard() {
		
		for (int row = 0; row < 7; row++) {
			if (row % 2 == 0) {
				StringBuilder sb = new StringBuilder();
				for (int col = 0; col < 13; col++) {
				
					if (col % 4 == 0) {
					sb.append(plus);
					
					}	else {
					sb.append(minus);
					}
				}
				PrintLine(sb.toString());
			} else {
				StringBuilder sb = new StringBuilder();
				for (int col = 0; col < 13; col++) {
					
						if (col % 4 == 0) {
						sb.append(vLine);
						
						}	else {
						sb.append(" ");
						}
					}
				PrintLine(sb.toString());
			}
			
		}
		
	}
	
	public static void PrintLine(String line) {
		
		System.out.println(line);
	}

}
