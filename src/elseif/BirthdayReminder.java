
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 6th";
		String dadsBirthday = "Febraury 26th";
		String myBirthday = "January 14th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String answer= JOptionPane.showInputDialog("What birthday do you want?");
		// 3. Print out what the user typed
		if(answer.equals("mom")) {
			System.out.println(momsBirthday);
		}
		else if(answer.equals("dad")){
			System.out.println(dadsBirthday);
		}
		else if(answer.equals("mine")) {
			System.out.println(myBirthday);
		}
			else {
				System.out.println("Sorry, I do not remember that person's birthday");
			}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
