import java.util.Scanner;

class Carpet {

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double width, length, cost;
		System.out.println("enter width in meters: ");
		width = keyboard.nextDouble();	
		System.out.println("enter length in meters: ");
		length= keyboard.nextDouble();
		System.out.println("enter the const per square meter in euros: ");
		cost = keyboard.nextDouble();
		System.out.println("room size is: "+ width * length);
		System.out.println("cost is: " + ((width *length ) * cost));	
	
	}

}
