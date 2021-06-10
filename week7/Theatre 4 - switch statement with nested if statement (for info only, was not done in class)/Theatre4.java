/*
 *Theatre4.java
 *author@Sean Bonner
 *11/03/2021
 *Switching statements - not only can we use If Statements, there is also switch statements that use switch, case and break.
 * Additionally, it is possible to use if statements within a switch statement.
*/
import javax.swing.*;
public class Theatre4{
	public static void main(String args[]){


				//variables
				String day;
				int age;


				//input
				day = JOptionPane.showInputDialog(null, "Please enter the day of the week");
				age = Integer.parseInt(JOptionPane.showInputDialog(null,"What is your age?"));

				//process and output
				//.toLowerCase and the case name must be lower case for this to work or vica versa.

				switch(day.toLowerCase()){ // what variable are you pulling in
					case"monday":
						if (age <= 15 || age >= 65) {
							JOptionPane.showMessageDialog(null, "The admission is free");
						}else {
							JOptionPane.showMessageDialog(null, "The admission is 10 euro");
						}
				break;

				case "tuesday":
						if (age <= 15 || age >= 65) {
							JOptionPane.showMessageDialog(null, "The admission is free");
						}else {
							JOptionPane.showMessageDialog(null, "The admission is 10 euro");
						}
				break;

				case "wednesday":
						if (age <= 15 || age >= 65) {
							JOptionPane.showMessageDialog(null, "The admission is free");
						}else {
							JOptionPane.showMessageDialog(null, "The admission is 10 euro");
						}
				break;

				case "thursday":
						if (age <= 15 || age >= 65) {
							JOptionPane.showMessageDialog(null, "The admission is free");
						}else {
							JOptionPane.showMessageDialog(null, "The admission is 10 euro");
						}
				break;

				case "friday":
						if (age <= 15 || age >= 65) {
							JOptionPane.showMessageDialog(null, "The admission is 10 euro");
						}else {
							JOptionPane.showMessageDialog(null, "The admission is 20 euro");
						}
				break;
				case "saturday":
						if (age <= 15 || age >= 65) {
							JOptionPane.showMessageDialog(null, "The admission is 10 euro");
						}else {
							JOptionPane.showMessageDialog(null, "The admission is 20 euro");
						}
				break;

				case "sunday":
						if (age <= 15 || age >= 65) {
							JOptionPane.showMessageDialog(null, "The admission is 10 euro");
						}else {
							JOptionPane.showMessageDialog(null, "The admission is 20 euro");
						}
				break;

				default:
					JOptionPane.showMessageDialog(null, "That is not a valid day");
				break;

			}//end of switch statement


	}//main method closing bracket
}//class closing bracket
