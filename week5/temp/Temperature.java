/*
 *
 *Created by Fagner Nunes
 * */

public class Temperature{
	// Data members
	private double fahrenheit,temp1, temp2, temp3, temp4, temp5, temp6, temp7,average;
	// constructor
	public Temperature(){
		temp1 = temp2 = temp3=temp4 =  temp5 = temp6=  temp7 = 0.0;
	}
	// set method 
	public void setTemp1(double temp1){
		this.temp1 = temp1;
	}
	public void setTemp2(double temp2){
		this.temp2 = temp2;
	}
	public void setTemp3(double temp3){
		this.temp3 = temp3;
	}
	public void setTemp4(double temp4){
		this.temp4 = temp4;
	}
	public void setTemp5(double temp5){
		this.temp5 = temp5;
	}
	public void setTemp6(double temp6){
		this.temp6 = temp6;
	}
	public void setTemp7(double temp7){
		this.temp7 = temp7;
	}
	// compute 
	public void ComputeTempAverage()
	{
	      average = (temp1+temp2+temp3+temp4+temp5+temp6+temp7)/7; 
	      fahrenheit = (average * 1.8) + 32; 
	}
	// getter methods
	public double getAverage()
	{
		return average;
	}
	public double getFah()
	{
		return fahrenheit;
	}
}
