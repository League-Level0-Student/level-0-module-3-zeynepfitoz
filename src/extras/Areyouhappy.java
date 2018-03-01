package extras;

import javax.swing.JOptionPane;

public class Areyouhappy {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("Are you happy?");

		if (answer.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		} else if (answer.equals("No")) {
			String answer2 = JOptionPane.showInputDialog("Do you wanna be happy?");

			if (answer2.equals("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");

			}
			if (answer2.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
		}
	}

}