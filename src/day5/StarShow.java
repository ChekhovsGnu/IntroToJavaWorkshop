package day5;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/*
 * Before beginning recipe: 1. ask students to find and explain the method in this recipe. 2. ask students how they
 * might use the method to make the picture in the laminated hand-outs.
 */

public class StarShow {

	Robot robot = new Robot("batman");

	void makeStars() {

		// 13. Set the speed to 8

		int xpos = (10);
		int ypos = (950);
		robot.setX(xpos);
		robot.setY(ypos);

		// 8. Make a variable to hold the star size and set it to 25
		int starsize = (25);
		for (int i = 0; i < 30; i++) {

			// 19. Set the pen width to i

			drawStar(starsize);

			// 14. Increase the X position by star size. See Figure 2.
			int xcur = robot.getX();
			int ycur = robot.getY();
			robot.setX(xcur + starsize);
			robot.setY(ycur + starsize);
			// 15. decrease the Y position by star size. See Figure 3.

			// 16. Increase the star size by 20

			// 17. Turn the robot 12 degrees

			// 18. Make each star a different random color like in Figure 4.
		}
	}

	private void drawStar(int starSize) {
		robot.penDown();

		for (int i = 0; i < 5; i++) {
			robot.move(starSize);
			robot.turn(144);
		}

	}

	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}
