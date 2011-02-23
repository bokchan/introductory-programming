
// An applet that appears on the page as a button that says
// "Click me".  When the button is clicked, an informational
// dialog box appears to say Hello from Swing.  This version
// uses an anonymous class as an ActionListener for the button.
// When this file is compiled, it produces two class files,
// HelloSwing2.class and HelloSwing2$1.class.  Both class
// files are required to use the applet.

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HelloSwing2 extends JApplet{
	JLabel imgLabel ;

   public void init() {
         // This method is called by the system before the applet
         // appears.  It is used here to create the button and add
         // it to the "content pane" of the JApplet.  An anonymous
            // class is used to create an ActionListener for the button.

      JButton bttn = new JButton("Click Me!");
      bttn.setSize(100, 20);
      imgLabel = new JLabel("Hey here is a card");
      imgLabel.setSize(100, 100);

      bttn.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                  // This method is called to respond when the user
                  // presses the button.  It displays a message in 
                  // a dialog box, along with an "OK" button which
                  // the user can click to dismiss the dialog box.
               String title = "Greetings";  // Shown in box's title bar.
               String message = "Another hello from Swing.";
               JOptionPane.showMessageDialog(null, message, title,
                                     JOptionPane.INFORMATION_MESSAGE);
               String imagePath = System.getProperty("user.dir") + "\\ch4\\Images\\cards\\2s.gif";
               System.out.println(imagePath);
        	   ImageIcon icon = new ImageIcon(imagePath);
        	 
        	   imgLabel.setIcon(icon);
               
           
            } // end actionPerformed()
         });

      getContentPane().add(bttn);
      getContentPane().add(imgLabel);
      

   } // end init()

  
       
} // end class HelloSwing
