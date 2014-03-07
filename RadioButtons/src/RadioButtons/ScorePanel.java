package RadioButtons;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ScorePanel extends JPanel
                        implements ActionListener
{
JLabel l1, l2, l3, l4, l5;
JTextField test1, test2, test3, avg, total;
JButton go, reset;
JPanel p1, p2, p3;
public ScorePanel()
 {
 l1 = new JLabel("Test #1");
 l2 = new JLabel("Test #2");
 l3 = new JLabel("Test #3");
 l4 = new JLabel("Average");
 l5 = new JLabel("Total");
 test1 = new JTextField(10);
 test2 = new JTextField(10);
 test3 = new JTextField(10);
 avg = new JTextField(10);
 total = new JTextField(10);
 go = new JButton("Calculate");
 reset = new JButton("Clear");
 p1 = new JPanel();
 p2 = new JPanel();
 p3 = new JPanel();
 p1.add(l1); p1.add(test1);
 p1.add(l2); p1.add(test2);
 p1.add(l3); p1.add(test3);
 p2.add(l4); p2.add(avg);
 p2.add(l5); p2.add(total);
 p3.add(go); p3.add(reset);
/*
 setLayout(new BorderLayout());
 add(p1, BorderLayout.NORTH);
 add(p2, BorderLayout.CENTER);
 add(p3, BorderLayout.SOUTH);
*/
 setLayout(new GridLayout(3, 1));
// setLayout(new GridLayout(1, 3));
 add(p1); add(p2); add(p3);
 p1.setBackground(Color.yellow);
 p3.setBackground(Color.blue);
 go.addActionListener(this);
 reset.addActionListener(this);
 avg.setEditable(false);
 total.setEditable(false);
 }

public void actionPerformed(ActionEvent x)
  {
//  avg.setText(test1.getText());
//  avg.setText("Hey");
  if (x.getSource() == go)
     {
     if (test1.getText().trim().length() < 1)
        {avg.setText("WHAT???"); return;}
     int t = Integer.parseInt(test1.getText());
     t = t + Integer.parseInt(test2.getText());
     t = t + Integer.parseInt(test3.getText());
     total.setText(t + "");
     avg.setText(t / 3.0 + "");
     go.removeActionListener(this);
     }
  if (x.getSource() == reset)
     {
     go.addActionListener(this);
     test1.setText("");
     test2.setText("");
     test3.setText("");
     avg.setText("");
     total.setText("");
     }
  }

} // ScorePanel







