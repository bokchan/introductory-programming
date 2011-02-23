import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;


//VS4E -- DO NOT REMOVE THIS LINE!
public class InputMessageApplet extends JApplet implements ActionListener{

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
		JButton btn = new JButton("Press to start");
		btn.addActionListener(this);
		this.getContentPane().add(btn);
		
	}
	
	private void initApplet() {
		String input = JOptionPane.showInputDialog("Say something");
		JOptionPane.showMessageDialog(null, input);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		initApplet();
		
	}

}
