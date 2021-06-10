/*
 * created By Fagner Nunes
 *
 *
 * */

import java.util.Scanner;
import javax.swing.*;

public class TemperatureApp{
	public static void main(String args[]){
	
	 // declare variables 
	 double tempInput,average, fahrenheit;
	// declare objects
	 Temperature myTemp;
 	// create obj
	myTemp = new Temperature();
	
	// prompt user for input
	tempInput = Double.parseDouble(JOptionPane.showInputDialog(null, "plase enter value"));
	myTemp.setTemp1(tempInput);	
	
	tempInput = Double.parseDouble(JOptionPane.showInputDialog(null, "plase enter value"));
	myTemp.setTemp2(tempInput);	
	tempInput = Double.parseDouble(JOptionPane.showInputDialog(null, "plase enter value"));
	myTemp.setTemp3(tempInput);	
	tempInput = Double.parseDouble(JOptionPane.showInputDialog(null, "plase enter value"));
	myTemp.setTemp4(tempInput);	
	tempInput = Double.parseDouble(JOptionPane.showInputDialog(null, "plase enter value"));
	myTemp.setTemp5(tempInput);	
	tempInput = Double.parseDouble(JOptionPane.showInputDialog(null, "plase enter value"));
	myTemp.setTemp6(tempInput);	
	tempInput = Double.parseDouble(JOptionPane.showInputDialog(null, "plase enter value"));
	myTemp.setTemp7(tempInput);	

	myTemp.ComputeTempAverage();	
        average = myTemp.getAverage();
	fahrenheit = myTemp.getFah();	
		//output
	JOptionPane.showMessageDialog(null,"the average in celcius is "+average +" and in fahrenheit is "+ fahrenheit);
	}
}
