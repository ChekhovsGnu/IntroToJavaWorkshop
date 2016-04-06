package day3;

import javax.swing.JOptionPane;

public class StephenHawking {

	public static void main(String[] args) {

		for (int i = 0; i < 50; i++) {
			String words = JOptionPane.showInputDialog("Plese enter a sentence");
			speak(words);
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
