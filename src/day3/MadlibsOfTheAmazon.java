package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String adj = JOptionPane.showInputDialog("Insert an adjective");

		// Get the user to enter a type of liquid
		String liq = JOptionPane.showInputDialog("Insert a liquid");

		// Get the user to enter a body part
		String bp = JOptionPane.showInputDialog("Insert a body part");

		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog("Insert a verb");

		// Get the user to enter a place
		String place = JOptionPane.showInputDialog("Insert a place");

		String story = "Piranhas are more " + adj + " during the day, so cross the river at night. Piranhas are attracted to fresh " + liq
				+ " and will mostlikely take a bite out of your " + bp + " if you " + verb
				+ ". Whatever you do, if you have an open wound, try to find another way to get back to the " + place + ". Good luck!";

		JOptionPane.showMessageDialog(null, story);

	}
}
