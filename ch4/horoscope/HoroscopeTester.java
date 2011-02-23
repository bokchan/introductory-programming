package ch4.horoscope;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class HoroscopeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input month of birth");
		int month = sc.nextInt();
		System.out.println("Input day of birth");
		int day = sc.nextInt();

		Signs.initStarSigns();
		String horoscope = Signs.getHoroscope(month, day);
		horoscope = unescapeXML(horoscope);


		String imagePath = System.getProperty("user.dir") +
		"\\src\\ch4\\horoscope\\images\\" +
		Signs.getSign().getName().toLowerCase() + ".gif";

		Icon icon =  new ImageIcon(imagePath);
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		JTextArea jta = new JTextArea();
		jta.setPreferredSize(new Dimension(300,300));
		jta.setText(horoscope);
		jta.setLineWrap(true);

		JLabel imgLabel = new JLabel(icon); 

		frame.add(imgLabel);
		frame.add(jta);
		frame.pack();
		frame.setFont(new Font("Helvetiva", Font.PLAIN, 14));


		frame.setVisible(true);
	}

	public static String unescapeXML(String str) {
		if (str == null || str.length() == 0)
			return "";

		StringBuffer buf = new StringBuffer();
		int len = str.length();
		for (int i = 0; i < len; ++i) {
			char c = str.charAt(i);
			if (c == '&') {
				int pos = str.indexOf(";", i);
				if (pos == -1) { // Really evil
					buf.append('&');
				} else if (str.charAt(i + 1) == '#') {
					int val = Integer.parseInt(str.substring(i + 2, pos), 16);
					buf.append((char) val);
					i = pos;
				} else {
					String substr = str.substring(i, pos + 1);
					if (substr.equals("&amp;"))
						buf.append('&');
					else if (substr.equals("&lt;"))
						buf.append('<');
					else if (substr.equals("&gt;"))
						buf.append('>');
					else if (substr.equals("&quot;"))
						buf.append('"');
					else if (substr.equals("&apos;"))
						buf.append('\'');
					else
						// ????
						buf.append(substr);
					i = pos;
				}
			} else {
				buf.append(c);
			}
		}
		return buf.toString();
	}

}

