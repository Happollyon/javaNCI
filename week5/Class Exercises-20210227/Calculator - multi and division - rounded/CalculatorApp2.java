/*
*CalculatorApp
*@author S Bonner
*22nd Feb 2021
*
*This calculator applicaion accepts two numbers as input. It then calls the calculator instantiable class and calculates the sum, difference, multiplication and division of those two numbers.
*All four calculations and speed conversion are output to the user.
*As an additional extra, this application also rounds the results down to two decimal places using the DecimalFormat object
*JOptionPane is used throughout the application
*/
import java.util.Scanner;
import javax.swing.*;
import java.text.DecimalFormat;

public class CalculatorApp2{
        public static void main(String args[]){

                // declare variables
                double x;
                double y;
                String xInput;
                String yInput;
                double sum;
                double difference;
                double multi;
                double divis;

                // declare/create objects
                CalculatorNumbers myCalc;

		        //initialise object
                myCalc = new CalculatorNumbers();

                //prompt user for input
                xInput = JOptionPane.showInputDialog(null,"Please enter the first value");
		        x = Double.parseDouble(xInput); //convert text input back to numbers

                yInput = JOptionPane.showInputDialog(null,"Please enter the second value");
		        y = Double.parseDouble(yInput); //convert text input back to numbers

                // set inputs, do computations, return answers
                myCalc.setX(x);
                myCalc.setY(y);
                myCalc.computeSum();
                myCalc.computeDifference();
                myCalc.computeMultiplication();
                myCalc.computeDivision();
                sum = myCalc.getSum();
                difference = myCalc.getDifference();
                multi = myCalc.getMultiplication();
                divis = myCalc.getDivision();

                //round numbers to two decimal places
                //declare and initialise decimal format object
                DecimalFormat df = new DecimalFormat("###.##");

                //output result - using df.format() to round the calculation resultes
        		JOptionPane.showMessageDialog(null,"Non rounded result:\nThe sum of " + x + " and " + y + " is " +sum+"\nThe difference of " + x + " and " + y + " is " +difference+"\nThe Multiplication of "+x+" and "+y+" is "+multi+"\n The division of "+x+" by "+y+" is "+divis+"\n\n\nRounded result:\nThe sum of " + x + " and " + y + " is " +df.format(sum)+"\nThe difference of " + x + " and " + y + " is " +df.format(difference)+"\nThe Multiplication of "+x+" and "+y+" is "+df.format(multi)+"\n The division of "+x+" by "+y+" is "+df.format(divis));


	      }//main method closing curly bracket

}//class closing curly bracket
