/*
 *Theatre3.java
 *author@L Murphy
 *10th Aug 2014
 *Switching statements - not only can we use If Statements, there is also switch statements that use switch, case and break
*/
import javax.swing.*;
public class Theatre3{
	public static void main(String args[]){


				//variables
				String day;


				//input
				day = JOptionPane.showInputDialog(null, "Please enter the day of the week");

				//.toLowerCase and the case name must be lower case for this to work or vica versa.


				//process and output
				switch(day.toLowerCase()){ // what variable are you pulling in
					case"monday":
					JOptionPane.showMessageDialog(null, "The admission is 5 euro");
					break;

				case "tuesday":
					JOptionPane.showMessageDialog(null, "The admission is 5 euro");
					break;

				case "wednesday":
					JOptionPane.showMessageDialog(null, "The admission is 5 euro");
					break;

				case "thursday":
					JOptionPane.showMessageDialog(null, "The admission is 5 euro");
					break;

				case "friday":
					JOptionPane.showMessageDialog(null, "The admission is 10 euro");
					break;

				case "saturday":
					JOptionPane.showMessageDialog(null,"The admission is 10 euro");
					break;

				case "sunday":
					JOptionPane.showMessageDialog(null, "The admission is 20 euro");
					break;

				default:
					JOptionPane.showMessageDialog(null, "That is not a valid day");
					break;
				}

	}//main method closing bracket
}//class closing bracket