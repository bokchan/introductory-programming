package ch2;

import java.awt.EventQueue;

import javax.swing.JApplet;

//VS4E -- DO NOT REMOVE THIS LINE!
public class BullsEyeApplet extends JApplet {

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
		BullsEyeComponent be = new BullsEyeComponent();
		this.getContentPane().add(be);
	}

}
