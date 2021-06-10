/*
*CinemaApp.java
*Author@L Murphy
*6th Aug 2014
*/
import javax.swing.*;
public class CinemaApp{

public static void main(String args[]){


	//Variables
	int age;
	int cost;
	String message;

	//Create Objects
	Cinema myCinema;

	//Declare Objects
	myCinema = new Cinema();


	//Input
	age = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age")); //joption always takes in a string
	myCinema.setAge(age);


	//Process
	myCinema.compute();


	//Output
	message = myCinema.getMessage();
	JOptionPane.showMessageDialog(null,message);

	}
}
