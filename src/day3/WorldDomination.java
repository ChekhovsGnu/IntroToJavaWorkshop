package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		Integer answer = JOptionPane.showConfirmDialog(null, "Do you know how to code?");
		if (answer.equals(0)) {
			JOptionPane.showMessageDialog(null, "You will rule the world.");
		} else {
			JOptionPane.showMessageDialog(null, "Good luck washing dishes.");
		}
	}
}
