// Grace Lee

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CurvesPanelTest {
	
	public static void main(String[] args) {
		
		// create new frame to hold the panel
		JFrame application = new JFrame();
		// prompt user for a number
		String input = JOptionPane.showInputDialog(application, "Please enter a number between 2 and 50 inclusive.");
		// parse string into int
		int s = Integer.parseInt(input);
		// while the input is invalid, prompt user again
		while (s < 2 || s > 50)	{
			input = JOptionPane.showInputDialog(application, "Invalid input. Please enter a number between 2 and 50 inclusive.");
			s = Integer.parseInt(input);
		}
		// set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// create a new CurvesPanel
		CurvesPanel panel = new CurvesPanel(s);
		// add the panel to the frame
		application.add(panel);
		// set the size of the panel
		application.setSize(600, 600);
		// make the frame visible
		application.setVisible(true);

	} // end main method

} // end class CurvesPanelTest