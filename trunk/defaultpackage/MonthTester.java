package defaultpackage;

import javax.swing.JOptionPane;

public class MonthTester {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("Input a number between 1 and 12");
	
	Month m = new Month(Integer.parseInt(input));
	System.out.println(m.getName());
}
}
