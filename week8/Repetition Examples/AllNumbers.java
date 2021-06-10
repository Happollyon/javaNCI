/*
*AllNumbers.java
*@author L Murphy
*12th Aug 2014
*/


public class AllNumbers{
	public static void main(String args[]){

		//variables
		int sum;
		sum = 0;


		//Display numbers from 0 to 10 inclusive
		System.out.println ("Display numbers 0 to 10");
		for(int i = 0;i<=10;i=i+1){
			System.out.println(i);
		}

		//Display numbers from 10 to 0 inclusive
		System.out.println ("Display numbers 10 to 0");
		for(int j = 10;j>-1;j=j-1){
			System.out.println(j);

			}

			//While loop that displays the following number
			System.out.println("Display numbers 10,20,30,40,50");
			int k=0;
			while(k<50){
				System.out.println(k);
				k=k+10;

				}

			//While loop that displays the following numbers 100,90,80,70,60
			System.out.println("Display numbers 100,90,80,70,60");
			int l =100;
			while(l>=60){
				System.out.println(l);
				l=l-10;
				}

			//for loop that calculates the sum of numbers between 1 and 10
			System.out.println ("Display the sum of 0 to 10");
			for(int m = 0; m<=10; m=m+1){
				sum= sum+m;
				}
					System.out.println(sum);


		}

}