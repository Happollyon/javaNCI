/*
 *SumApp.java
 *@author Frances Sheridan
 *14th Nov 2012
 */
 import javax.swing.JOptionPane;
 public class SumApp{
	 public static void main(String args[]){

		 int num, sum;
		 Sum mySum = new Sum();

		 num = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number"));
		 mySum.setNum(num);

		 mySum.compute();

		 sum = mySum.getSum();
		 JOptionPane.showMessageDialog(null, "The sum of all numbers from 1 to "+num+" is "+sum);
	 }
 }
