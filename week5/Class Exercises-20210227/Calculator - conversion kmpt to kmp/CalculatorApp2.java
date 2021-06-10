/*
*CalculatorApp
*@author S Bonnery
*22nd Feb 2021
*
*This calculator applicaiont accepts two numbers as input. It then calls the calculator instantiable class and calculates the sum, difference, multiplication and division of those two numbers.
*In addition, this application also acceps a speed in KMph as an input. It will then convert this to MPh using the SpeedConversion instantiable class.
*All four calculations and speed conversion are output to the user.
*JOptionPane is used throughout the application
*/
import javax.swing.*;

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
                double KMph;
                double MPh;
                String KMphInput;

                // declare/create objects
                CalculatorNumbers myCalc;
                SpeedConversion myConv;

				        //initialise object
                myCalc = new CalculatorNumbers();
                myConv = new SpeedConversion();

                //prompt user for numerical input
                xInput = JOptionPane.showInputDialog(null,"Please enter the first value");
				        x = Double.parseDouble(xInput); //convert text input back to numbers

                yInput = JOptionPane.showInputDialog(null,"Please enter the second value");
				        y = Double.parseDouble(yInput); //convert text input back to numbers

                //prompt user for speed in KMph input
                KMphInput = JOptionPane.showInputDialog(null,"Please enter a speed in KMph");
				        KMph = Double.parseDouble(KMphInput); //convert text input back to numbers


                // set inputs, do computations, return answers for numerical computations
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

                //set input, do computations, return answers for speed SpeedConversion
                myConv.setKMph(KMph);
                myConv.computeMPh();
                MPh = myConv.getMph();

                //output result - using df.format() to round the calculation resultes
        		JOptionPane.showMessageDialog(null,"Non rounded result:\nThe sum of " + x + " and " + y + " is " +sum+"\nThe difference of " + x + " and " + y + " is " +difference+"\nThe Multiplication of "+x+" and "+y+" is "+multi+"\n The division of "+x+" by "+y+" is "+divis);
                JOptionPane.showMessageDialog(null,"Non-rounded Speed conversion:\n A speed of "+KMph+"KMph converted to MPh is: "+MPh+"MPh");

        }//main method closing curly bracket

}//class closing curly bracket
