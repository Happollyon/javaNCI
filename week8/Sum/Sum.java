/*
 *Sum.java
 *@author Frances Sheridan
 *14th Nov 2012
 */

 public class Sum{
	 private int num;
	 private int sum;

	 public Sum(){
		 num = 0;
		 sum = 0;
	 }

	 public void setNum(int num){
		 this.num = num;
	 }

	 public void compute(){
		 for(int i = 1; i < num; i++){
			 sum = sum+i;
		 }
	 }

	 public int getSum(){
		 return sum;
	 }
 }