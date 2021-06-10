/*
 *
 *Staff Discount.java
 *
 */

public class Discount{
	//  declare data members 
	
	private double cost;
	private double finalCost;
	private double discount;
	private final int DISC = 10;
	// Constructor 
	public Discount  (){
	
	 	cost = 0.0;
		 discount = 0.0;
 		 finalCost = 0.0;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	
	}

	public void compute(){
	
		discount = (cost/100)*DISC;
		finalCost = cost - discount;

	}
	public double getDiscount(){
		return discount;
	
	}
	public double getFinalCost(){

		return finalCost;
	
	}
}
