package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot anders = new Robot();

	
	void go() {
	

		// 6. Make the robot go as fast as possible
		anders.setSpeed(10);
		anders.hide();
		anders.penDown();
		anders.setPenWidth(10);

		// 4. make a variable to hold the length of the triangle and set it to 50
			int Length = 50;

		// 7. Do the following (up to step 10) 60 times
			for (int i = 0; i < 60; i++) {
				
			
			

			// 9. Change the color of the pen to a random color
			anders.setRandomPenColor();
	
			// 8. Increase the length of the side by 10 pixels
			Length = (Length + 10);
	
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(Length);
	
			// 10. Turn the tortoise 6 degrees to the right
			anders.turn(6);
			}

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int Length) {
		for (int i = 0; i < 3; i++) {
			anders.move(Length);
			anders.turn(360/3);
			
		}
		
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
