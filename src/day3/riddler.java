package day3;

import javax.swing.JOptionPane;

public class riddler {
		 
		public static void main(String[] args) {
	 
			// 1. Make a variable to hold the score
				int score = 0;
				
	 
			// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
				String riddle1 = JOptionPane.showInputDialog("Why did the gum cross the road?");
	 
			// 4. If they got the answer right, pop up "correct!" and increase the score by one
				if (riddle1.equals("Because it was stuck to the chickens foot.")){
					JOptionPane.showMessageDialog(null, "Correct! Good job!");
					score++;
				    }
					else {
						JOptionPane.showMessageDialog(null, "Sorry, the correct answer is: because it was stuck to the chickens foot!");
					}
				
				String riddle2 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
				if (riddle2.equals("A stamp.")){
					JOptionPane.showMessageDialog(null, "Correct!");
					score++;
				}
				else {
					JOptionPane.showMessageDialog(null, "Sorry, the correct answer is: a stamp.");
				}
				
	 
			// 5. Otherwise, say "wrong" and tell them the answer
	 
			// 6. Add some more riddles
	 
			// 2. Make a pop up to show the score.
			
		}
	

}
