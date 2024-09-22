package moduleTwo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CurrencyConverterFrame extends JFrame implements ActionListener {
   private static final long serialVersionUID = 1L;
   private JLabel dollarLabel;     // Label for US dollar
   private JLabel rmbLabel;      // Label for Chinese Yuan
   private JTextField dollarField;  // Displays amount entered
   private JTextField rmbField; // Displays calculated amount


   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   CurrencyConverterFrame() {
      // Used to specify GUI component layout
      GridBagConstraints layoutConst = null;

      // Set frame's title
      setTitle("Currency Converter");

      dollarLabel = new JLabel("US Dollar:");
      rmbLabel = new JLabel("Chinese Yuan:");

      // Set dollar and Chinese Yuan (rmb) fields 
      dollarField = new JTextField(15);
      dollarField.setEditable(true);
      dollarField.setText("1");
      dollarField.addActionListener(this);

      rmbField = new JTextField(15);
      rmbField.setEditable(false);

      // Use a GridBagLayout
      setLayout(new GridBagLayout());
      layoutConst = new GridBagConstraints();

      // Specify component's grid location
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;

      // 10 pixels of padding around component
      layoutConst.insets = new Insets(10, 10, 10, 10);

      // Add component using the specified constraints
      add(dollarLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(dollarField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(rmbLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(rmbField, layoutConst);
   }

   /* Method is automatically called when an event 
    occurs (e.g, Enter key is pressed) */
   @Override
   public void actionPerformed(ActionEvent event) {
      String userInput;      // User specified US dollar
      int dollarInput;        // dollar amount input

      // Get user's dollar amount input
      userInput = dollarField.getText();
      
      // Convert from String to an integer
      dollarInput = Integer.parseInt(userInput);

      // Display calculated Chinese Yuan
      // Used estimated conversion rate 1 dollar equals 7 Chinese Yuan
      rmbField.setText(Integer.toString(dollarInput * 7 ));
   }

   /* Creates a CurrencyConverterFrame and makes it visible */
   public static void main(String[] args) {
      // Creates CurrencyConverterFrame and its components
      CurrencyConverterFrame myFrame = new CurrencyConverterFrame();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}