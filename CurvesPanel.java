// Grace Lee

import java.awt.Graphics;
import javax.swing.JPanel;

public class CurvesPanel extends JPanel {

	private int NUM_STEPS;

	// constructor
	public CurvesPanel(int s) {
		NUM_STEPS = s;
	}

	@Override
	public void paintComponent(Graphics g) {

		// call paintComponent() to ensure that the panel displays correctly
		super.paintComponent(g);

		int width = getWidth(); // total width
		int height = getHeight(); // total height
		
		int vert_step; 
		int horiz_step;

		// loop until all lines are drawn
		for (int i=0; i<NUM_STEPS; i++) {

			vert_step = i*height/NUM_STEPS;
			horiz_step = i*width/NUM_STEPS;
		
			g.drawLine(0, vert_step, horiz_step, height);
			g.drawLine(horiz_step, height, width, height - vert_step);
			g.drawLine(width, height - vert_step, width - horiz_step, 0);
			g.drawLine(width - horiz_step, 0, 0, vert_step);
			
		} 
	} 
} // end class CurvesPanel