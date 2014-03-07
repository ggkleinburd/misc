package RadioButtons;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Controller  extends JPanel implements ActionListener{

	 static String loanString = "Loan Calculator";
	 static String scoreString = "Score Calculator";
	 static String guessString = "Number Guessing Game";
	    
	public Controller(){
		 //Create the radio buttons.
        JRadioButton loanButton = new JRadioButton(loanString);
       loanButton.setMnemonic(KeyEvent.VK_L);
        loanButton.setActionCommand(loanString);
    //    loanButton.setSelected(true);

        JRadioButton scoreButton = new JRadioButton(scoreString);
        scoreButton.setMnemonic(KeyEvent.VK_S);
        scoreButton.setActionCommand(scoreString);

        JRadioButton guessButton = new JRadioButton(guessString);
        guessButton.setMnemonic(KeyEvent.VK_G);
        guessButton.setActionCommand(guessString);

        ButtonGroup group = new ButtonGroup();
        group.add(loanButton);
        group.add(scoreButton);
        group.add(guessButton);
        
       loanButton.addActionListener(this);
       scoreButton.addActionListener(this);
       guessButton.addActionListener(this);
		
       JPanel radioPanel = new JPanel(new GridLayout(0, 1));
       radioPanel.add(loanButton);
       radioPanel.add(scoreButton);
       radioPanel.add(guessButton);
       
       add(radioPanel, BorderLayout.LINE_START);
       setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
             
       
		
	}

	
	public void actionPerformed(ActionEvent e) {
       
		if(e.getActionCommand() == loanString){
			Project3 pj3 = new Project3();
			}
		else if(e.getActionCommand() == scoreString){
			Lab16 lab16 = new Lab16();
		}
		
		else if(e.getActionCommand() == guessString){
			NumberGuessGUI numberg = new NumberGuessGUI("test");
			numberg.run();
		}
		
		
		
    }
	
	public static void main(String args[]) {
        //Create and set up the window.
        JFrame frame = new JFrame("RadioButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new Controller();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
	
	
	
}
