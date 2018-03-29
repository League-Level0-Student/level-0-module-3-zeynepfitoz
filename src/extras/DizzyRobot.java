//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		robot.setSpeed(900);
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String dance=JOptionPane.showInputDialog("How dizzy do you want to make the robot in a scale of 1-10?");
 // 1. Use the dance method to make the robot spin.
	if(dance.equals("1")) {
		dance(1);
	}
	else if(dance.equals("2")) {
		dance(20);
	}
	else if(dance.equals("3")) {
		dance(30);
	}
	else if(dance.equals("4")) {
		dance(40);
	}
	else if(dance.equals("5")) {
		dance(500);
	}
	else if(dance.equals("6")) {
		dance(600);
	}
	else if(dance.equals("7")) {
		dance(700);
	}
	else if(dance.equals("8")) {
		dance(800);
	}
	else if(dance.equals("9")) {
		dance(900);
	}else if(dance.equals("10")) {
		dance(1000);
	}
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

