/*
 *
 * Created by Fagner Nunes
 *
 * */

import javax.swing.*;

public class charCountApp{

	public static void main( String args[]){
	
		// variables
		String input;
		// create obj
		charCount myChar;
		// declare obj

		myChar = new charCount();

		input = JOptionPane.showInputDialog(null, "please enter a string. ");

		myChar.setInput(input);
		// compute
		
		myChar.compute();

		// output
		
		JOptionPane.showMessageDialog(null, "you text has "+myChar.getSpaces()+" spaces and "+ myChar.getVowels() + " vowels and "+ myChar.getConsonants() + " consonants.");
	}


}
