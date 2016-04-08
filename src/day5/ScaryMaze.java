package day5;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {

	BufferedImage maze;
	final int frameWidth = 1024;
	final int frameHeight = 800;

	ScaryMaze() throws Exception {
		maze = ImageIO.read(getClass().getResource("Maze.jpg"));
		new Robot().mouseMove(30, 100);
		addMouseMotionListener(this);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int bg = -10280815;
		int win = -2024162;
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		System.out.println(mouseColor);
		if (mouseColor == bg) {
			scare();
		}

		if (mouseColor == win) {
			JOptionPane.showMessageDialog(null, "Congrats, you've won!");
		}
	}

	private void scare() {
		System.out.println("BOO!");
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("BOO.wav"));
		sound.play();
		showScaryImage("spooky.jpg");
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("June's Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

}
