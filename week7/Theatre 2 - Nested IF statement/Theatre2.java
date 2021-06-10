/*
*Theatre2.java
*author@L Murphy
*10th Aug 2014
*Nested If Statements - comparing two things together i.e. age and day of the week
*/
import javax.swing.*;
public class Theatre2{
	public static void main(String args[]){

		//Declare variables
		String day;
		int age;

		//Input
		day = JOptionPane.showInputDialog(null, "Please enter the day");
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age"));



		//Process and output
		if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Thursday")){
			if(age<10 || age>65){
				JOptionPane.showMessageDialog(null,"The admission if free");
			}else{
				JOptionPane.showMessageDialog(null,"The admission is 10 euro");
			}
		}

		else if (day.equalsIgnoreCase("Friday") || day.equalsIgnoreCase ("Saturday") || day.equalsIgnoreCase ("Sunday")){
			if(age<10 || age>65){
				JOptionPane.showMessageDialog(null, "The admission is 10 euro");
			}
			else{
				JOptionPane.showMessageDialog(null, "The admission is 20 euro");
			}
		}

		else{
				JOptionPane.showMessageDialog(null,"That is not a valid day");
		}

	}//main method closing bracket
}//class closing bracket

