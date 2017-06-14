package day3;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Slavetortoise {
	public static void main(String[] args) {
		Robot artist = new Robot();
		artist.hide();
		artist.penDown();
		artist.sparkle();
		artist.setPenWidth(10);
		artist.setRandomPenColor();
		artist.setSpeed(10);
		String Shape = JOptionPane.showInputDialog("What shape do you want to draw?");
		if (Shape.equals("circle")) {
			for (int i = 0; i < 100; i++) {

				for (int i1 = 0; i1 < 360; i1++) {

					artist.move(1);
					artist.turn(360 / 360);

				}
				artist.turn(150);
				artist.setRandomPenColor();
			}

		} else {
			for (int i = 0; i < 100; i++) {
				for (int i1 = 0; i1 < 20; i1++) {

					artist.move(20);

					artist.turn(360 / 20);

				}
				artist.setRandomPenColor();
				artist.move(10);
				artist.turn(100);

			}

		}

	}

}
