/*
 * Created by Fagner Nunes.
 *
 * */


public class Guess{
	
	// Data members
	private int number;
	private String message;
	private int guess;
	//constructors 
	public Guess(){
	
		number = 0;
		message = "";
		guess = 0;
	}
	//set
	public void setNumber(int number){
	
		this.number = number;
	}
	public void setGuess(int guess){
	
		this.guess=guess;
	}
	//compute
	
	public void compute(){
		if(guess==number){
			
			message = "Congratualtions, you guessed correctly!";
		
		}else if (guess>number){
		
			message = "you guessed to high, sorry. The number was "+number;
		
		}else if(guess<number){
		
			message =  "you guessed to low, sorry. the number was " + number;
		}
	
	}

	// get 
	public String getMessage(){
	
		return message;
	}
	
}
