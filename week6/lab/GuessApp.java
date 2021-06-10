/*
 * created by Fagner Nunes
 *
 */
 
import javax.swing.*;
import java.lang.Math; 
 public class GuessApp{
 
 	public static void main(String args[]){
	
		//variables
		int number;
		int guess;
		String message;

		// create obj
		Guess myGuess;
		// declare obj
		myGuess= new Guess();

		// randon number 
		number = (int) ((Math.random() * (10 - 0)) + 0);
		myGuess.setNumber(number);

		guess = Integer.parseInt(JOptionPane.showInputDialog(null,"please enter a number between 0-10"));
		myGuess.setGuess(guess);
		//compute
		
		myGuess.compute();
		message =  myGuess.getMessage();
		JOptionPane.showMessageDialog(null,message);

	
	}
 }		
