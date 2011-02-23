import javax.swing.*;               //Need to import all these files for it to work
import java.awt.event.*;
import java.awt.*;

public class ButtonTest extends JApplet  //Main class
{
     JButton button;               //sets variable button to a JButton
     public int Count = 0;     //makes public integer Count
     
     public void init()          //Function for initialization
     {
          button = new JButton("Click");          //Creates a new JButton that says "Click"
          Container window = getContentPane();// Gets size of window
          window.setLayout(new FlowLayout()); // Sets the button layout
          button.addActionListener(new ButtonListener()); //Adds a listener, so action can be performed if clicked
          button.setBackground(Color.yellow);   //Makes color yellow
          window.add(button);  //Makes button visible in the window
     }

     private class ButtonListener implements ActionListener  //The listener class
     {
          public void actionPerformed(ActionEvent push)  //If button is clicked...will run this
          {
               Count++;   //Adds 1 to Count
               button.setText(Integer.toString(Count));  //Changes text of button to the value of Count
          }
     }
}