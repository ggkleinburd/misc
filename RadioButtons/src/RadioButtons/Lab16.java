package RadioButtons;

import javax.swing.JFrame;

public class Lab16
{
	Lab16()
   {
   JFrame frame = new JFrame ("Score Calculator");
   frame.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
   frame.getContentPane().add(new ScorePanel());
   frame.pack();
   frame.setVisible(true);
   } // main
} // Lab16
