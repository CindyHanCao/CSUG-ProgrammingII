/**
 * 
 */
package moduleTwo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.time.LocalDate;
import java.time.Period;

/**
 * 
 */
public class birthDateFrame extends JFrame implements ActionListener{

	/**
	 * @param birth date label, birth date field, age label, age field, a panel for age calculation
	 * @author Cindy Cao
	 * Purpose: Take birth date as input, to calculate age.
	 * 
	 * */
	
   // Properties
   private static final long serialVersionUID = 1L;
   private JLabel bdLabel;     // Label for birth date
   private JLabel ageLabel;      // Label for age 
   private JTextField bdField;  // Displays birthday entered
   private JTextField ageField; // Displays calculated age amount
   private JPanel agePanel; // create a panel for age calculation


   /* Constructor creates GUI components and adds GUI components
	  using a GridBagLayout. */
   birthDateFrame() {
	  // Used to specify GUI component layout
	  GridBagConstraints layoutConst = null;
	  agePanel = new JPanel();

	  // Set frame's title
	  setTitle("Age Calculator");

	  bdLabel = new JLabel("Please Enter Your Birthday in YYYY-MM-DD format:");

	  // Set birthday and age fields 
	  bdField = new JTextField(15);
	  bdField.setEditable(true);
	  bdField.setText("1");
	  bdField.addActionListener(this);
	  
	  agePanel.add(bdLabel);
	  agePanel.add(bdField);

	  ageLabel = new JLabel("Your age is:");
	  ageField = new JTextField(15);
	  ageField.setEditable(false);
	  agePanel.add(ageLabel);
	  agePanel.add(ageField);
	  
	  JButton mybutton = new JButton("Calculating your age now.");
	  mybutton.addActionListener(this);

	  // Use a GridBagLayout
	  agePanel.setLayout(new GridBagLayout());
	  layoutConst = new GridBagConstraints();

	  // Specify component's grid location
	  layoutConst.gridx = 0;
	  layoutConst.gridy = 0;

	  // 10 pixels of padding around component
	  layoutConst.insets = new Insets(10, 10, 10, 10);

	  // Add component using the specified constraints
	  agePanel.add(bdLabel, layoutConst);

	  layoutConst = new GridBagConstraints();
	  layoutConst.gridx = 1;
	  layoutConst.gridy = 0;
	  layoutConst.insets = new Insets(10, 10, 10, 10);
	  agePanel.add(bdField, layoutConst);

	  layoutConst = new GridBagConstraints();
	  layoutConst.gridx = 0;
	  layoutConst.gridy = 1;
	  layoutConst.insets = new Insets(10, 10, 10, 10);
	  agePanel.add(mybutton, layoutConst);

	  layoutConst = new GridBagConstraints();
	  layoutConst.gridx = 0;
	  layoutConst.gridy = 2;
	  layoutConst.insets = new Insets(10, 10, 10, 10);
	  agePanel.add(ageLabel, layoutConst);

	  layoutConst = new GridBagConstraints();
	  layoutConst.gridx = 1;
	  layoutConst.gridy = 2;
	  layoutConst.insets = new Insets(10, 10, 10, 10);
	  agePanel.add(ageField, layoutConst);
	  
	  // add panel to frame
	  add(agePanel);
   }

   /* Method is automatically called when an event 
	occurs (e.g, Enter key is pressed) */
   @Override
   public void actionPerformed(ActionEvent event) {
	  String userInput;      // User specified US dollar

	  // Get user's birthday date input
	  userInput = bdField.getText();
	  
	  // convert date string to date object
	  LocalDate birthDate = LocalDate.parse(userInput);
	  
	  // get today's date
	  LocalDate today = LocalDate.now();
	  
	  // get the years' diff between 2 dates
	  int age = Period.between(birthDate, today).getYears(); 
	  
	  // Display calculated age 
	  ageField.setText(Integer.toString(age));
   }

   /* Creates a birthDateFrame and makes it visible */
   public static void main(String[] args) {
	  // Creates birthDateFrame and its components
	   birthDateFrame myFrame = new birthDateFrame();

	  myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  myFrame.pack();
	  myFrame.setVisible(true);
   }


}
