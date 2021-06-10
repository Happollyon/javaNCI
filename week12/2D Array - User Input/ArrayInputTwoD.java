import javax.swing.*;
import java.util.*;

class ArrayInputTwoD{
	public static void main(String args[]){


		//declare and initilaize an int and string array
		String [][] myStrArr = new String [3][4];

    //in order to input into the String array, we need two loops. One for each Dimension
			//first loop - the 'rows'
			for (int rows = 0; rows < myStrArr.length; rows++){
				//second loop - the 'columns'
				for (int cols = 0; cols < myStrArr[rows].length; cols++){

					//accept input from user and stroe in the 2D array
					//We use +1 in the output because the index in an array starts at 0.
					myStrArr[rows][cols] = JOptionPane.showInputDialog(null, "Please enter a String for I:"+(rows+1)+"and also J: "+(cols+1));
					}
				}

				//print contents of the Array
				//Since this is a two dimension array - a for loop is need to print the contents of the outer array e.g. a set of inner arrays.
				for (int i = 0; i < myStrArr.length;i++){
					System.out.println(Arrays.toString(myStrArr[i]));
				}


	}

}
