/*
*author: sean bonner
*Date: 22/04/2021
*Avg.Java
*
*Develop an application to allow the user enter the rainfall recorded over 7 days and
*calculate the average. Use an array and instantable class in your solution.
*/

 public class Avg{

   //declare variables and array
   private int arr[];
   private int avg;
   private int sum;

   //constructor and initialise variables
   public Avg(){
     arr = new int[7];
     avg = 0;
     sum = 0;
   }

   //set methods with an array type
   public void setArr(int arr[]){
     this.arr=arr;
   }
   //compute methods
   public void compute(){
     for(int i = 0 ; i < arr.length; i++){
       sum = sum+arr[i];
     }
     avg=sum/arr.length;
   }
   //get method - return average to application class
   public int getAvg(){
     return avg;
   }
 }
