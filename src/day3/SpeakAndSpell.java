package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak & Spell was introduced at the summer
 * Consumer Electronics Show in June 1978, making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you would make this program. Allow them to
 * code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {
	public static void main(String[] args) {
		speak("spell league, as in the league of amazing programmers");
		String answer = JOptionPane.showInputDialog("Spell the word");
		if (answer.equalsIgnoreCase("league")) {
			speak("Correct.");
		} else {
			speak("Wrong. League is spelled L E A G U E");
		}
		speak("spell talc, as in talc is one of the softest minerals");
		answer = JOptionPane.showInputDialog("Spell the word");
		if (answer.equalsIgnoreCase("talc")) {
			speak("Correct.");
		} else {
			speak("Wrong. talc is spelled T A L C");
		}
		answer = JOptionPane.showInputDialog("Spell the word");
		if (answer.equalsIgnoreCase("cryptic")) {
			speak("Correct.");
		} else {
			speak("Wrong. Cryptic is spelled C R Y P T I C");
		}
		speak("spell quadriplegic, as in the accident made him a quadriplegic");
		answer = JOptionPane.showInputDialog("Spell the word");
		if (answer.equalsIgnoreCase("rhythm")) {
			speak("Correct.");
		} else {
			speak("Wrong. Quadriplegic is spelled Q U A D R I P L E G I C");
		}
		speak("spell the quick brown fox jumped over the lazy dog, as in yesterday the quick brown fox jumped over the lazy dog when I wasn't looking");
		answer = JOptionPane.showInputDialog("Spell the words");
		if (answer.equalsIgnoreCase("The quick brown fox jumped over the lazy dog")) {
			speak("Correct.");
		} else {
			speak("Wrong. The quick brown fox jumped over the lazy dog is spelled T H E space Q U I C K space B R O W N space F O X space J U M P E D space O V E R space T H E space L A Z Y space D O G");
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
