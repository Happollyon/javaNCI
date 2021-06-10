/*
 *GreenBottles.java
 *@author L Murphy
 *11th Sep 2014
 */

 public class GreenBottlesForLoop{
	 public static void main(String args[]){
		 for(int i = 10; i >0;i=i-1){
			 System.out.println(i+" Green bottles hanging on a wall");
			 System.out.println(i+" Green bottles hanging on a wall");
			 System.out.println("But if one green bottle should accidently fall");
			 if((i-1)==0){
				 System.out.println("There'd be no Green bottles hanging on the wall");
			 }
			 else{
			 	System.out.println("There'd be "+(i-1)+" Green bottles hanging on the wall\n");
			}
		 }
	 }
 }
