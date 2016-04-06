package day3;

import javax.swing.JOptionPane;

public class Classy {
	int num = 7;

	public static void main(String[] args) {
		System.out.println("Greetings Human");
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		int test = JOptionPane.showConfirmDialog(null, "Your name is " + name + "?");
		if (test < 1) {
			JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
		}
		if (test > 0)
			JOptionPane.showMessageDialog(null, "Oh...");
	}

}
