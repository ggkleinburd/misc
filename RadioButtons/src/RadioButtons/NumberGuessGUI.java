package RadioButtons;



//Revoke event registration
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class NumberGuessGUI extends JFrame implements ActionListener
{
JTextField  input;
JLabel  output;
int k;
public NumberGuessGUI(String t)
{
setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
setTitle(t);
setLayout(new FlowLayout());
Random   x = new Random();
k = x.nextInt(10) + 1;
add(new JLabel("Enter a number between 1 and 10"));
input = new JTextField(20);
add(input);
input.addActionListener(this);  // Event registration
output = new JLabel("");
add(output);
} // constructor

public static void run() 
  {
  NumberGuessGUI frameX =  new NumberGuessGUI("Number Guessing Game");
  frameX.pack();
  frameX.setVisible(true);
  } // main

public void actionPerformed(ActionEvent e)
{
 if (e.getSource() == input) 
    {
    int ui = Integer.parseInt(input.getText());
    if (k == ui)
       output.setText("You got it!");	
    else
       output.setText("The number is: " + k);	
    input.removeActionListener(this);  // Revoke Event registration
    input.setEditable(false);  // disable the text box
    }
 } // actionPerformed
} // GUINumberGame7