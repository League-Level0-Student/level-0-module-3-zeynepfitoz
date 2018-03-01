//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {

		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.moveTo(200, 500);
		// 3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 1; i++) {
			String answer = JOptionPane.showInputDialog("What is your favorite color?");
			// 4. Use an if/else statement to set the pen color that the user requested
			if (answer.equals("Cyan")) {
				r2d2.setPenColor(Color.CYAN);
			} else if (answer.equals("Magenta")) {
				r2d2.setPenColor(Color.MAGENTA);
			} else if (answer.equals("Pink")) {
				r2d2.setPenColor(Color.PINK);
			} else if (answer.equals("Green")) {
				r2d2.setPenColor(Color.GREEN);
			} else if (answer.equals("Blue")) {
				r2d2.setPenColor(Color.blue);
			} else if (answer.equals("White")) {
				r2d2.setPenColor(Color.white);
			} else if (answer.equals("Yellow")) {
				r2d2.setPenColor(Color.yellow);
			} else if (answer.equals("Black")) {
				r2d2.setPenColor(Color.black);
			} else if (answer.equals("Dark Gray")) {
				r2d2.setPenColor(Color.DARK_GRAY);
			}

			// 5. If the user doesn’t enter anything, choose a random color
			else {
				r2d2.setRandomPenColor();
			}
			// 6. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10
			r2d2.setPenWidth(10);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			for (int Z = 0; Z < 5; Z++) {
				r2d2.move(100);
				r2d2.turn(360 / 5);
			}

		}
	}
}
