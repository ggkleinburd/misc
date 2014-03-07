package RadioButtons;

/**		
* The panel used to set up GUI objects.
* Used by Assignment3.
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;	

public class LoanPanel extends JPanel implements ActionListener
{
JLabel inputLabel1, inputLabel2, inputLabel3, outputLabel;
JTextField result;
JTextField inputValue1, inputValue2, inputValue3;
JButton push;

// Sets up GUI components.
public LoanPanel() // constructor
   {
   setLayout(new GridLayout(5, 1));
   inputLabel1 = new JLabel("Loan amount:");
   inputValue1 = new JTextField(10);
   JPanel p1 = new JPanel();
   p1.add(inputLabel1);
   p1.add(inputValue1);
   add(p1);

   inputLabel2 = new JLabel("Interest rate:");
   inputValue2 = new JTextField (10);
   JPanel p2 = new JPanel();
   p2.add(inputLabel2);
   p2.add(inputValue2);
   add(p2);

   inputLabel3 = new JLabel("Number of payments:");
   inputValue3 = new JTextField (10);
   JPanel p3 = new JPanel();
   p3.add(inputLabel3);
   p3.add(inputValue3);
   add(p3);

   outputLabel = new JLabel("Monthly payment: ");
   result = new JTextField(10);
   result.setEditable(false);
   JPanel p4 = new JPanel();
   p4.add(outputLabel);
   p4.add(result);
   add(p4);

   push = new JButton("Calculate");
   push.addActionListener(this);
   add(push);	
   JPanel p5 = new JPanel();
   p5.add(push);
   add(p5);
   } // constructor


// Event handling
//  Performs the loan payment calculation when the button is pushed.
public void actionPerformed (ActionEvent e)
     {
     double   LOANCONSTANT=1200.0;
     double loan=0.0, apr=0.0, payment=0.0;
     int n; // number of payments
     String text1 = inputValue1.getText().trim();
     String text2 = inputValue2.getText().trim();
     String text3 = inputValue3.getText().trim();
     loan = Double.parseDouble(text1);
     if (loan <= 0.0)
        {
        JOptionPane.showMessageDialog(null, "Loan amount must be > 0.0");	
        return;
        }
     apr = Double.parseDouble(text2);
     if (apr <= 0.0)
        {
        JOptionPane.showMessageDialog(null, "Interest rate must be > 0.0");	
        return;
        }
     n = Integer.parseInt(text3);
     if (n <= 0)
        {
        JOptionPane.showMessageDialog(null, "# of payments must be >= 1");	
        return;
        }
// Format the output in currency form
     NumberFormat  fmt1 = NumberFormat.getCurrencyInstance();
     payment=(loan * (apr/LOANCONSTANT) *(Math.pow(1.0+apr/LOANCONSTANT,n))) / 
		    	     (Math.pow(1.0+apr/LOANCONSTANT,n)-1.0);
     String temp = fmt1.format(payment);
     result.setText(temp);		// format $ money output
     } // actionPerformed
 
} // LoanPanel