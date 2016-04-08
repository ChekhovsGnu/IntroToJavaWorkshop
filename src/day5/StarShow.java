package day5;

import org.jointheleague.graphical.robot.Robot;

public class StarShow {

	Robot robot = new Robot("batman");

	void makeStars() {

		robot.setSpeed(8);

		int xpos = (10);
		int ypos = (950);
		robot.setX(xpos);
		robot.setY(ypos);
		int starsize = (25);
		for (int i = 0; i < 30; i++) {
			robot.setPenWidth(i);
			drawStar(starsize);
			int xcur = robot.getX();
			int ycur = robot.getY();
			robot.setX(xcur + starsize);
			robot.setY(ycur - starsize);
			starsize = (starsize + 20);
			robot.turn(12);
		}
	}

	private void drawStar(int starSize) {
		robot.penDown();
		robot.setRandomPenColor();
		for (int i = 0; i < 5; i++) {
			robot.move(starSize);
			robot.turn(144);
		}

	}

	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}
