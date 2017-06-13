package day1.tortoise;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {

	
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setSpeed(10);

		// 13. Set the speed to 8
		
		// 5. Make a variable to hold the X position of the Tortoise and set it to 10
		int Xpos = 10;
		
		// 6. Make a variable to hold the Y position of the Tortoise and set it to 440
				int Ypos = 440;
			
		
		// 7. Make a variable to hold the star size and set it to 15
				
				int Size = 15;
		
		// 11. Repeat the steps below, 30 times
				for (int i = 0; i < 30; i++) {
					
				
		
			// 9. Set the X position of the Tortoise to your variable
						Tortoise.setX(Xpos);
			
			// 10. Set the Y position of the Tortoise to your variable
						Tortoise.setY(Ypos);
			
			// 8. Call the drawStar() method with your star size variable
						drawStar(Size);
			
			// 12. Increase the X position by star size. See Figure 2.
						Tortoise.setX(Xpos + Size);
						
			
			// 14. decrease the Y position by star size. See Figure 3.
						Tortoise.setY(Ypos + Size);
			
			// 15. Increase the star size by 8
						drawStar(Size + 8);
			
			// 16. Turn the Tortoise 10 degrees
						Tortoise.turn(10);
			
			// 17. Make each star a different random color like in Figure 4. Hint: Use the Colors object.
						Colors.getRandomColor();
				} 

		
	}

	private static void drawStar(int starSize) {
		// 3. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show
		for (int i = 0; i < 5; i++) {
			
		
			// 1. Move the Tortoise the distance of the starSize variable
		Tortoise.move(starSize);
		
		

			
			
			// 2. Turn the Tortoise 144 degrees
		Tortoise.turn(144);
		}
			
	}
}



