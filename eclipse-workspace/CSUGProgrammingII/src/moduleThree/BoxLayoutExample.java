/**
 * 
 */
package moduleThree;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 */
public class BoxLayoutExample {
	
	public static void main(String[] args) {
		// create a frame
		JFrame frame = new JFrame("BoxLayout Example");
		frame.setSize(500, 300);
		
		// create a panel
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		//create Buttons
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		
		// add Buttons to the panel
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		// add panel to the frame
		frame.add(panel);
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
