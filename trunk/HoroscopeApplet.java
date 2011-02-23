

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//VS4E -- DO NOT REMOVE THIS LINE!
public class HoroscopeApplet extends JApplet implements ActionListener{
	private JTextField inputMonth;
	private JTextField inputDay;
	private JTextArea jtaHoroscope; 
	

	private static final long serialVersionUID = 1L;

	public void init() {
		try {
			EventQueue.invokeAndWait(new Runnable() {
			
				public void run() {
					initComponents();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void initComponents() {
		setSize(320, 240);
		JPanel container = new JPanel();
		GridLayout gLayout = new GridLayout(3,2);
		
		container.setLayout(gLayout);
		container.setSize(320, 50);
		JLabel lblMonth = new JLabel("Input month of birth");
		
		inputMonth = new JTextField();
		inputMonth.setSize(100, 10);
		JLabel lblDay = new JLabel("Input day of birth");
		inputDay = new JTextField();
		
		JPanel containerBtn = new JPanel();
		containerBtn.setLayout(new GridLayout(1,1));
		containerBtn.setSize(320, 25);
		JButton btn = new JButton("Show horoscope");
		btn.setSize(50, 25);
		btn.addActionListener(this);
		
		JPanel containerHoroscope = new JPanel();
		containerHoroscope.setLayout(new GridLayout(1,2));
		jtaHoroscope = new JTextArea();
		jtaHoroscope.setLineWrap(true);
		jtaHoroscope.setWrapStyleWord(true);
		jtaHoroscope.setSize(320, 100);
		containerHoroscope.add(jtaHoroscope);
		
		container.add(lblMonth);
		container.add(inputMonth);
		container.add(lblDay);
		container.add(inputDay);
		container.add(btn);
		
		getContentPane().setName("Horoscope");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(container);
		getContentPane().add(containerHoroscope);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int month = Integer.valueOf(inputMonth.getText());
		int day = Integer.valueOf(inputDay.getText());
		
		Signs.initStarSigns();
		String horoscope = Signs.getHoroscope(month, day);
		horoscope = unescapeXML(horoscope);
			
		jtaHoroscope.setText(horoscope);
		
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
