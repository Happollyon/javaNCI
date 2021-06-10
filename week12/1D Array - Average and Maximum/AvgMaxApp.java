/*
 *AvgApp.java
 *2nd Dec 2013
 *@author F.Sheridan
 */
import javax.swing.JOptionPane;
 public class AvgMaxApp{
	 public static void main(String args[]){
		 //declare variables
		 int avg, max;
		 int arr[] = new int[5];

		 //declare & create objects
		 AvgMax myAvg = new AvgMax();

		 //input
		 for(int i = 0; i < 5; i = i +1){
		 	arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
		 }
		 myAvg.setArr(arr);

		 //process
		 myAvg.compute();
		 myAvg.computeMax();

		 //output
		 avg= myAvg.getAvg();
		 max = myAvg.getMax();
		 JOptionPane.showMessageDialog(null,"Average is "+ avg);
		 JOptionPane.showMessageDialog(null,"Maximum is "+ max);


	 }
 }