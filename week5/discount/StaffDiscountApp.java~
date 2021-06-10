/*
 *
 *
 *created by Fagner Nunes.
 */
import java.util.Scanner;
import javax.swing.*;

public class StaffDiscountApp{

	public static void main (String args[]){
	
		// declare variables
		double cost, discount, finalCost;
		// declare objects
		Discount myStaffDiscount;
		// create objects
		myStaffDiscount = new Discount();

		// input
		cost = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the cost"));
		myStaffDiscount.setCost(cost);
	
		// process
		
		myStaffDiscount.compute();
		// output
		discount = myStaffDiscount.getDiscount();
		finalCost = myStaffDiscount.getFinalCost();
		JOptionPane.showMessageDialog(null,"you get a discount of "+discount+" on that item and your final cost is "+finalCost);

	}
}
