package ch1;


public class P1_1 {

	/**
	 * @param args
	 */
	
	public P1_1() {} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		if (args.length == 0)  {
			throw new IllegalArgumentException("Please input name");
		}
		String name = args[0];
		
		String plus = "+";
		String vLine = "|";
		String minus = "-";

		for (int i=0; i < name.length()-1;i++) {
			minus += "-"; 
		}
		
		PrintLine(plus + minus.toString() + plus);
		PrintLine(vLine + name + vLine);
		PrintLine(plus + minus.toString() + plus);
	}
	
	public static  void PrintLine(String output) {
		System.out.println(output);
		
		
	}
	
	

}
