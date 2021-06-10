/*
*author: sean bonner
*Date: 22/04/2021
*AvgApp.Java
*
*Develop an application to allow the user enter the rainfall recorded over 7 days and
*calculate the average. Use an array and instantable class in your solution.
*/

import javax.swing.*;
public class AvgApp{

  public static void main(String[] args) {
    //declare variables, array
    int arr[] = new int [7];
    int avg;
    //String message = "The average is: ";

    //declare objects
    Avg myAvg = new Avg();

    //input
    for (int i = 0 ; i < arr.length; i++){
      arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter rainfall for day "+(i+1)));
    }
    //process
    myAvg.setArr(arr);
    myAvg.compute();

    //output
    avg = myAvg.getAvg();
    JOptionPane.showMessageDialog(null,"The average rainfall is: "+avg);

  }

}
