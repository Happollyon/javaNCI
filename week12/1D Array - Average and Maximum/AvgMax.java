/*
 *Avg.java
 *2nd Dec 2013
 *@author F.Sheridan
 */

 public class AvgMax{
	 //declare data members
	 private int arr[];
	 private int avg;
	 private int sum;
	 private int max;

	 //constructor
	 public AvgMax(){
		 arr = new int[5];
		 avg = 0;
		 sum = 0;
		 max = 0;
	 }

	 //set method
	 public void setArr(int arr[]){
		 this.arr=arr;
	 }

	 //compute method
	 public void compute(){
		 for(int i = 0; i < arr.length; i++){
		 	sum = sum + arr[i];
		 }
		 avg = sum/5;
	 }

	 public void computeMax(){
		 max = arr[0];
		 for(int i = 1; i < arr.length; i = i +1){
			 if(arr[i] > max){
				 max = arr[i];
			 }
		 }
	 }

	 //get method
	 public int getAvg(){
		 return avg;
	 }

	 public int getMax(){
		 return max;
	 }

 }
