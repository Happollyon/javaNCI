// Created by Fagner Nunes 
//
//



package com.mkyong.inputDialog;

import javax.swing.JOptionPane;

public class Booking{

   public static void main(String args[]){
	// prompt for number of nights
	int nights = 0;
	nights = Integer.parseInt(JOptionPane.showInputDialog("enter how many nights you wish to stay."));
	// prompt for number of people
	int numOfPeople = 0;
	numOfPeople = Integer.parseInt(JOptionPane.showInputDialog("enter how many people will be staying with us. "));
	// Prompt for the type of room
	int roomType = 0;
	roomType = Integer.parseInt(JOptionPane.showInputDialog("Select the type of room you would like. Enter 1 for Superior, 2 for Delux, 3 for Super Amazing. "));
	

	int price=0;
	if(roomType==1)
	{
 		price = 100; 

	}else if(roomType == 2){
	
		price =130;
	
	}else if(roomType == 3)
	{
		price = 200;
	
	}

	System.out.println("The total cost is "+( numOfPeople * nights * price )+ "euros.");
	
	
   } 

}
