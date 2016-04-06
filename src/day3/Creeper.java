package day3;

import javax.swing.JOptionPane;

public class Creeper {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog(null, "To recieve our newsletter, please enter your email address.");
		JOptionPane.showMessageDialog(null, "Please answer the follwing security questions.");
		String number = JOptionPane.showInputDialog(null, "What is your favorite number?");
		String name = JOptionPane.showInputDialog(null, "What is your last name?");
		String food = JOptionPane.showInputDialog(null, "What is your favorite food?");
		String nick = JOptionPane.showInputDialog(null, "What was your childhood nickname?");
		String pet = JOptionPane.showInputDialog(null, "What was the name of your first dog/cat?");
		String author = JOptionPane.showInputDialog(null, "What is your favorite author's last name?");
		String maiden = JOptionPane.showInputDialog(null, "What is your mother's maiden name?");
		JOptionPane.showMessageDialog(null, "Attempting to log into " + email + " with the password " + name + pet + number + "...");
		JOptionPane.showMessageDialog(null, "Attempting to log into " + email + " with the password " + pet + name + number + "...");
		JOptionPane.showMessageDialog(null, "Attempting to log into " + email + " with the password " + pet + number + name + "...");
		JOptionPane.showMessageDialog(null, "Attempting to log into " + email + " with the password " + food + nick + name + "...");
		JOptionPane.showMessageDialog(null, "Attempting to log into " + email + " with the password " + name + nick + pet + "...");
		JOptionPane.showMessageDialog(null, "Attempting to log into " + email + " with the password " + author + number + "...");
		JOptionPane.showMessageDialog(null, "Attempting to log into " + email + " with the password " + food + author + number + "...");
		JOptionPane.showMessageDialog(null, "Attempting to log into " + email + " with the password " + name + nick + author + number + food + pet + "...");
		JOptionPane.showMessageDialog(null, "Hacking unsuccessful. Your email is safe...");
		JOptionPane.showMessageDialog(null, "For now. :)");
	}

}
