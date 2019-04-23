//8.18: DrawPanel.java
//Program that uses class MyLine
//to draw random lines.
import java.awt.*;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	
	private SecureRandom randomNumbers = new SecureRandom();
	private MyLine[] lines; //array of lines
	
	//Constructor, creates a panel with random shapes
	public DrawPanel() {
		
		setBackground(Color.white);
		
		lines = new MyLine[5 + randomNumbers.nextInt(5)];
		
		//Create lines
		for (int count = 0; count < lines.length; count++) {
			
			//Generate random coordiantes
			int x1 = randomNumbers.nextInt(300);
			int y1 = randomNumbers.nextInt(300);
			int x2 = randomNumbers.nextInt(300);
			int y2 = randomNumbers.nextInt(300);

			//Generate random color
			Color color = new Color(randomNumbers.nextInt(256),
				randomNumbers.nextInt(256), randomNumbers.nextInt(256));

			//Add the line to the list of lines to be displayed
			lines[count] = new MyLine(x1, y2, x2, y2, color);
		}
	}

	//For each shape array, draw the individual shapes
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		//Draw the lines
		for (MyLine lines : lines)
			lines.draw(g);
	}
}
