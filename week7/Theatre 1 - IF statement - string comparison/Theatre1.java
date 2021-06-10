/*
*Theatre1.java
*author@L Murphy
*10th Aug 2014
*This lesson is about comparing stings - .equals is used for strings
*if you want it to accept upper and lower case use .equalsIgnoreCase
*/
import javax.swing.*;
public class Theatre1{
	public static void main(String args[]){


	//Declare variables
	String day;

	//input
	day = JOptionPane.showInputDialog(null, "Please enter the day of the week");


	//process & Output
	if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Thursday")){ //if the day equals monday - different for strings
		JOptionPane.showMessageDialog(null, "The cost is 5 euro");

	}
	else if(day.equalsIgnoreCase("Friday") || day.equalsIgnoreCase ("Saturday") || day.equalsIgnoreCase ("Sunday")){
		JOptionPane.showMessageDialog(null, "The cost is 10 euro");
	}
	else{
		JOptionPane.showMessageDialog(null,"That is not a valid day");
	}

	}//main method closing bracket
}//class closing bracket