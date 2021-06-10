/*
*CalculatorApp
*@author S Bonner
*22nd Feb 2021
*
*This instantiable class is used to perform calculations on two numbers.
*It returns the sum, difference, Multiplication or division of those two numbers.
*/

public class CalculatorNumbers {

			// Data Members
			private double x, y;
	    private double sum;
	  	private double difference;
			private double multi;
			private double divis;

			//Constructor
			public CalculatorNumbers(){
				x=0;
				y=0;
			}
		     // setter Methods

		  public void setX(double x){
				this.x = x;
		  }
		  public void setY(double y){
				this.y = y;
		  }

				 //compute methods

			public void computeSum(){
				sum = x+y;
		  }
			public void computeDifference(){
				difference = x-y;
		  }
			public void computeMultiplication(){
				multi = x*y;
			}
			 public void computeDivision(){
		 		divis = x/y;
		  }

				// getter Methods

		  public double getSum(){
				 return sum;
		  }
		  public double getDifference(){
				 return difference;
		  }
			public double getMultiplication(){
				 return multi;
		  }
		  public double getDivision(){
				 return divis;
		  }

}//class closing bracket
