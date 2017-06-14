package day3;

	 // Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;
	 
	public class birthdays {
	 
		public static void main(String[] args) {
		
			// 1. correct the birthdays for your family below
			String momsBirthday = "July 13";
			String dadsBirthday = "July 11";
			String myBirthday = "December 25";
			String jaredsBirthday = "April 10";
	 
			// 2. Find out which birthday the user wants and and store their response in a variable
			String birthday = JOptionPane.showInputDialog("Whose birthday do you want to know?");
		
			// 3. Print out what the user typed
					if (birthday.equals("mom")){
						JOptionPane.showMessageDialog(null, "Mom's birthday is " + momsBirthday);
					}
					else if (birthday.equals("dad")){
						JOptionPane.showMessageDialog(null, "Dad's birthday is " + dadsBirthday);
						
					}
					else if (birthday.equals("yours")){
						JOptionPane.showMessageDialog(null, "My birthday is " + myBirthday);
					}
					else if (birthday.equals("Jared")){
						JOptionPane.showMessageDialog(null, "Jared's birthday is " + jaredsBirthday);
					
						}
					    
					
					
					else {
						JOptionPane.showMessageDialog(null, "Sorry, I don't know that persons birthday.");
					}
			
			// 4. if user asked for "mom"
				//print mom's birthday
			// 5. if user asked for "dad"
				// print dad's birthday
			// 6. if user asked for your name
				// print myBirthday
			//7. otherwise print "Sorry, i don't remember that person's birthday!"
	 
		} 
	}



