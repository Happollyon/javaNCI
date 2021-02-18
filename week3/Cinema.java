/*
 *Cinema.java
 * 
 *author: Fagner Nunes
 *
 * */
import java.util.*;
public class Cinema{
// main method
	public static void main(String args []){
	final double ADULTCOST = 10;
	final double CHILDCOST = 5;
	final double OAPCOST =6;
	int adultAmount = 0;
	int childAmount = 0;
	int oapAmount = 0;
	int age = 0;
	String name="";
	double totalCost=0;

	// CREATE OBJECTS
	Scanner keyboard;
	keyboard = new Scanner(System.in);
	// Get inputs
	System.out.println("How many adults per tickets?");
	adultAmount = keyboard.nextInt();	
	
	System.out.println("How many child per tickets?");
	childAmount = keyboard.nextInt();	
	
	System.out.println("How many adults oap tickets?");
	oapAmount = keyboard.nextInt();

	
	System.out.println("What is your name?");
	name = keyboard.next();	
	
	System.out.println("What is your age?");
	age = keyboard.nextInt();	

	// process - calculation
	totalCost=(adultAmount*ADULTCOST)+(childAmount*CHILDCOST)+(oapAmount*OAPCOST);	
	//  Output
	System.out.println("hi, "+name+" your age is "+age+" you total is "+totalCost);
	}
}
