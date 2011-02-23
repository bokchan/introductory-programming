package ch1;

import java.lang.reflect.Array;


public class P1_2 {
	static String  star = "*";
	enum Letters {A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, X, Y, Z};

	public static void main(String[] args) {
		
		String name = args[0];
				
		char[] arrLetters = name.toCharArray();
		
		for (int i = 0; i < name.length(); i++ ) {
			Array.set(arrLetters, i, arrLetters[i]);
			
			Letters letter = Letters.valueOf(Character.toString(arrLetters[i]));
			
			PrintLetter(letter);
		}			
	}
	
	/**
	 * @param letter
	 */
	
	/**
	 * @param letter
	 */
	/**
	 * @param letter
	 */
	/**
	 * @param letter
	 */
	/**
	 * @param letter
	 */
	/**
	 * @param letter
	 */
	public static  void PrintLetter(Letters letter) {
		StringBuilder sb = new StringBuilder();
		switch (letter) {
		case A : 
		sb.append(" " + star + star + star + star + star + "\n");
		sb.append(star).append(star).append("  ").append(star).append(star).append("\n");
		sb.append(star).append(star).append("  ").append(star).append(star).append("\n");
		sb.append(star + star + star + star + star + star).append("\n");
		sb.append(star).append(star).append("  ").append(star).append(star).append("\n");
		sb.append(star).append(star).append("  ").append(star).append(star).append("\n");
		sb.append("\n");
		PrintLine(sb.toString());
		break;
	
		case N :
			sb.append(star).append("   ").append(star + star).append("\n");
			sb.append(star + star).append("  ").append(star + star).append("\n");
			sb.append(star + star + star).append(" ").append(star + star).append("\n");
			sb.append(star + star).append(" ").append(star + star + star).append("\n");
			sb.append(star + star).append("  ").append(star + star).append("\n");
			sb.append(star + star).append("   ").append(star).append("\n");
			sb.append("\n");
			PrintLine(sb.toString());
			break;
		case D : 
			sb.append(star + star + star + star + star).append(" ").append("\n");
			sb.append(star + star).append("  ").append(star + star).append("\n");
			sb.append(star + star).append("  ").append(star + star).append("\n");
			sb.append(star + star).append("  ").append(star + star).append("\n");
			sb.append(star + star).append("  ").append(star + star).append("\n");
			sb.append(star + star + star + star + star).append(" ").append("\n");
			sb.append("\n");
			PrintLine(sb.toString());
			break;			
			
		case R : 
			sb.append(star + star + star + star + star).append(" ").append("\n");
			sb.append(star + star).append("  ").append(star + star).append("\n");
			sb.append(star + star).append("  ").append(star + star).append("\n");
			sb.append(star + star + star + star).append("  ").append("\n");
			sb.append(star + star).append("  ").append(star + star).append("\n");
			sb.append(star + star).append("  ").append(star + star).append("\n");
			
			sb.append("\n");
			PrintLine(sb.toString());
			break;
			
		case E : 
			sb.append(star + star + star + star + star + star).append("\n");
			sb.append(star + star).append("    ").append("\n");
			sb.append(star + star).append("    ").append("\n");
			sb.append(star + star + star + star + star).append(" ").append("\n");
			sb.append(star + star).append("    ").append("\n");
			sb.append(star + star + star + star + star + star).append("\n");
			
			
			sb.append("\n");
			PrintLine(sb.toString());
			break;
		case S : 
			sb.append(" ").append( star + star + star + star + star).append("\n");
			sb.append(star + star).append("    ").append("\n");
			sb.append(star + star).append("    ").append("\n");
			sb.append(star + star + star + star + star + star).append("\n");
			sb.append("    ").append(star + star).append("\n");
			sb.append(star + star + star + star + star).append(" ").append("\n");
			
			sb.append("\n");
			PrintLine(sb.toString());
			break;
		
	}
			
	} 
	
	public static  void PrintLine(String output) {
		System.out.print(output);
	}
}
