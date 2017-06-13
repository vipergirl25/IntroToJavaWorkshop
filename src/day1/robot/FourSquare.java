package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot sammy = new Robot ();

	

	void go() {
		// 4. Make the robot move as fast as possible
		sammy.setSpeed(10);

		// 5. Set the pen width to 5
		sammy.setPenWidth(5);

		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {
			
		

			// 7. Set the pen color to random
		sammy.hide();
		sammy.setRandomPenColor();
		sammy.penDown();
		sammy.sparkle();
	
			// 1. Call the drawSquare() method
		drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
		sammy.turn(90);
		}

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		
		for (int i = 0; i < 4; i++) {
			sammy.turn(90);
			sammy.move(100);
			
		}

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
