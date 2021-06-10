:wq/*
*Cinema.java
*author@ L Murphy
*6th Aug 2014
*/

public class Cinema{


	//Data members
	private int age;
	private String message;

	//Constructors
	public Cinema(){
		age = 0;
		message = "";
			}

	//Set
	public void setAge(int age){
		this.age = age;
	}


	//Compute
	public void compute(){
		if (age <= 5 || age >=60){ //or
			message = "Your admission is free";
		}
		else if (age >= 5 && age <= 14){
			message = "Your cost is 5";
		}
		else{
			message = "Your cost is 10 euros";
		}

	}



	//Get
	public String getMessage(){
		return message;
	}


}




