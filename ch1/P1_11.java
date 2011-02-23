package ch1;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class P1_11 {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL imgLoc = new URL("http://profile.ak.fbcdn.net/profile-ak-snc1/v22941/391/93/n639440714_5921.jpg");
		JOptionPane.showMessageDialog(null, "Hi", "Chan", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imgLoc));
		System.exit(0);
				
		

	}

}
