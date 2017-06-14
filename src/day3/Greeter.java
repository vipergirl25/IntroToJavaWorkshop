package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null,"Hi " + name + ", Goodbye, go get a puppy!");
	String puppy = JOptionPane.showInputDialog("What kind of puppy do you like?");
	JOptionPane.showMessageDialog(null, "Cool " + "I like " + puppy + " too!");
	String dogsorcats = JOptionPane.showInputDialog("Do you like dogs or cats better?");
	JOptionPane.showMessageDialog(null, "So you like " + dogsorcats + " better?" + " Cool."); 
	String vacation = JOptionPane.showInputDialog(null, "Where would you go if you could go anywhere in the world?");
	JOptionPane.showMessageDialog(null, "Awesome! " + vacation + " Sounds like a cool place to visit !");
			
}
}
