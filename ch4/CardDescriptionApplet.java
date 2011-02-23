package ch4;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//VS4E -- DO NOT REMOVE THIS LINE!
public class CardDescriptionApplet extends JApplet implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JTextField txtInput;
	private JLabel result;

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

		JPanel container = new JPanel(new FlowLayout());
		JLabel lblInput = new JLabel("Input shortcard for card, ex 2S for two of spades");
		txtInput = new JTextField();
		txtInput.setSize(50, 20);
		JButton btnCard = new JButton("Show result");
		btnCard.addActionListener(this);

		result = new JLabel();

		container.add(lblInput);
		container.add(txtInput);
		container.add(btnCard);
		container.add(result);
		this.getContentPane().add(container);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		CardDescription cd = new CardDescription(txtInput.getText());

		URL imageURL = getClass().getClassLoader().getResource("images/cards/2s.gif");
		System.out.println(imageURL);
		String imagePath = System.getProperty("user.dir") + "\\ch4\\Images\\cards\\" + txtInput.getText().toLowerCase() + ".gif";
		Image img = Toolkit.getDefaultToolkit().getImage(imageURL);
		Icon icon = new ImageIcon(imagePath);
		
		String aboutGreeting = cd.getDescription();
		result.setText(aboutGreeting);
		result.setIcon(icon);
		Graphics g = this.getGraphics();
		g.drawImage(img, 20, 20, this);
		
	}

}
