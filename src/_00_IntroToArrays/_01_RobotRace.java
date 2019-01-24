package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {

	static boolean notAtTop = true;
	static int winningNumber;

	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robots.length; i++) {
			robots[i].show();
			robots[i].setX(i * 155 + 150);
			robots[i].setY(550);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		Random ran = new Random();

		while (notAtTop == true) {
			for (int i = 0; i < robots.length; i++) {
				robots[i].setSpeed(10);
				int random = ran.nextInt(51);
				robots[i].move(random);
				if (robots[i].getY() < 60) {
					notAtTop = false;
					winningNumber = i;
					break;
				}
			}

		}
		// 7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "The winner is Robot " + (winningNumber + 1) + "! Let's have a party!");
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
