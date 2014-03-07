package RadioButtons;

import javax.swing.JFrame;

public class Project3
{
   Project3()
   {
   JFrame frame = new JFrame ("Loan Calculator");
   frame.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
   LoanPanel panel = new LoanPanel();
   frame.getContentPane().add(panel);
   frame.pack();
   frame.setVisible(true);
   }
} // Project3