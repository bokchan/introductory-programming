package ch4;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CardDescriptionTester {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Input shorthand for a playing card");
		CardDescription cd = new CardDescription(input);
		System.out.println(cd.getDescription());
		
		String imagePath = System.getProperty("user.dir") + "\\src\\defaultpackage\\Images\\cards\\" + input.toLowerCase() + ".gif";
		System.out.println(imagePath);
		JFrame myAppFrame = new JFrame();
		Icon icon = new ImageIcon(imagePath);
		String aboutGreeting = cd.getDescription();

		JOptionPane.showMessageDialog(
		myAppFrame,
		aboutGreeting, 
		"Card Description", 
		JOptionPane.INFORMATION_MESSAGE,
		icon);
	}
}
