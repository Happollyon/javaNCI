/*
 *
 * created by Fagner Nunes
 *
 * */
import javax.swing.*;
public class starSignApp{

	public static void main(String args[]){
	
	// variables 
	 int day;
	 String msg, month;
	// create obj
	starSign MySign;
	// declar obj
	MySign = new starSign();

	// inputs
	month = JOptionPane.showInputDialog(null,"enter the month you were born. ");
	day = Integer.parseInt(JOptionPane.showInputDialog(null,"enter the day you were born"));
	MySign.setDay(day);
	MySign.setMonth(month);
	
	// process
	MySign.compute();
	//output
	
	msg = MySign.getMessage();
	JOptionPane.showMessageDialog(null,msg);
	}
}
