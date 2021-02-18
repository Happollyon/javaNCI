/*
 *
 *
 * Caluculator java 
 * Created by Fagner Nunes
 *
 * */

public class Calculator{

	private int x;
	private int y;
	private int sum;
	private int diff;

	// constructors
	public Calculator(){
	
		y = 0;
		x = 0;
	
	}
	// set methods
	public void setX(int x)
	{
		this.x =x ;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	 // comput methods
	public void computeSum(){
		sum = x+y;
	}
	public void computeDiff()
	{	
		diff = x-y;
	}
	// get methods
	public int getSum()
	{
		return sum;
	}
	public int getDiff()
	{
		return diff;
	}
}
