/*
*numbers.java
*@author L Murphy
*17th Aug 2014
*Repetition - Loops
*/

public class RepetitionExamples{
	public static void main(String args[]){

		/*
		*  for loop
		*/

		System.out.println("For loop:");
		for(int i = 1; i<=10; i=i+1){ //i++ is the same thing //or i=<101 is the same
			System.out.println(i);
		}

		/*
		*  for loop using Shortcut Arithmetic Operators
		*/

		System.out.println("For loop using Shortcut Arithmetic Operators:");
		for(int i = 1; i<=10; i++){ //i++ is the same thing //or i=<101 is the same
			System.out.println(i);
		}


		/*
		*  while loop
		*/

		System.out.println("While Loop:");
		int i = 1;
		while(i<=10){
			System.out.println(i);
			i = i+1;
		}

		/*
		*  while loop using Shortcut Arithmetic Operators
		*/

		System.out.println("While Loop using Shortcut Arithmetic Operators:");
		int a = 1;
		while(a<=10){
			System.out.println(a);
			a++;
		}

		/*
		*  do while loop
		*/

		System.out.println("do while loop:");
		int j = 1;
		do{
			System.out.println(j);
			j=j +1; //j+=1; same as j = i+1;
		}
		while(j<=10);


		/*
		*  do while loop using Shortcut Arithmetic Operators
		*/


		System.out.println("do while loopusing Shortcut Arithmetic Operators:");
		int b = 1;
		do{
			System.out.println(b);
			b++; //j+=1; same as j = i+1;
		}
		while(b<=10);


		}//main method closing bracket


	}//class closing bracket



