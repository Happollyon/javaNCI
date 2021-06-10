/*
*CalculatorApp
*@author S Bonner
*22nd Feb 2021
*
*This instantiable class is used to perform a single calculation  to conver a speed in KMph to MPh
*/
public class SpeedConversion {

		// Data Members
		private double KMph;
		private double MPh;

		//Constructor
		public SpeedConversion(){
			KMph=0;
			MPh=0;
		}
	     // setter Methods

	  public void setKMph(double KMph){
			this.KMph = KMph;
	  }
			 //compute methods

		public void computeMPh(){
			MPh = KMph* 0.6213;
	  }

			// getter Methods

	  public double getMph(){
			 return MPh;
	  }

}//class closing bracket
