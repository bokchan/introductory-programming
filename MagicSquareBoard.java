

import java.applet.Applet;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class MagicSquareBoard extends Applet implements ActionListener {
	private JTextField testField; 
	private final int boardSize;
	private ArrayList<JTextField> fields = new ArrayList<JTextField>();
	private ArrayList<Integer> values ;
	private JLabel lbl;
	JButton btn;

	public MagicSquareBoard(int n) {
		boardSize = n;
	}

	public void drawBoard() {
		this.setSize(500,500);
		JPanel parent = new JPanel(new GridLayout(3, 1));
		JPanel board = new JPanel(new GridLayout(boardSize, boardSize));
		
		for (int i = 0; i < Math.pow(boardSize, 2); i++) {
			JTextField txField = new JTextField();
			board.add(txField);
			fields.add(txField);
		}
		
		btn = new JButton("Show result!");
		btn.addActionListener(this);
		lbl = new JLabel();
		
		parent.add(board);
		parent.add(lbl);
		parent.add(btn);
		
		
		
		this.add(parent);
		this.setVisible(true);
		try {
			UIManager.setLookAndFeel("com.incors.plaf.kunststoff.KunststoffLookAndFeel");
			
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception ex) {}
	
		}
	
	private boolean testInput(String i) {
		
		if (i.length() == 0) return false;
		
		Pattern p = Pattern.compile("^[0-9]*$");
		Matcher m = p.matcher(i);
		boolean isMatch = false;
		while (m.find()) {
			isMatch = true;
		} 
		return isMatch;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		values = new ArrayList<Integer>();
		MagicSquare sq = new MagicSquare(boardSize);
 		for (JTextField f : fields) {
 			String input = f.getText();
 			if (testInput(input)) {
 				values.add(Integer.valueOf(f.getText()));
 				sq.addInt(Integer.valueOf(f.getText()));
 			} else {
 				lbl.setText("Invalid input. Try again");
 			}
 		}
 		
 		if (sq.isMagic()) {
 			
 			this.setBackground(Color.YELLOW);
 			lbl.setText("Congratulations. You made a magic square");
 		} else {
 			lbl.setText("Too bad. Try again" );
 		}
	}
	
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
		drawBoard();
	}


}