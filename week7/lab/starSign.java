/*
 *
 *Created by Fanger Nunes.
 *
 *
 */
 
public class starSign{

// data members 
	private int day;
	private String month;
	private String message;
// constructor 
	public starSign(){
		day = 0;
		month = "";
		message = "";}
// set
	public void setDay(int day){
	
		this.day = day;
	}
	public void setMonth(String month){
	
		this.month = month;
	}
// compute
 	public void compute(){
	
		switch(month.toLowerCase())
		{	case"january":
				
				if(day>=1&&day<=19){
				 	message = "Capricorn";
				}else{
					message = "Aquarius";
				}
				break;
			case "february":
				if(day>=1&&day<=18){
					message = "Aquarius";
				}else{
					message = "Pisces";
				}
				
				break;	
			case "march":

				if(day>=1&&day<=20)
				{
					message = "Pisces";
				}else{
					message = "Aries";
				}
				break;
			case "april":
				if(day>=1&&day<=19)
				{
					message = "Aries";
				}else{
					message = "Taurus";
				}
				break;
							
			case "may":
				if(day>=1&&day<=20)
				{
					message = "Taurus";
				}else{
					message = "Gemini";
								}	
				break;
			case "june":
				if( day>=1 && day<=20 )
				{
					message = "Gemini";
				} else{
					message = "Cancer";
				}
				break;
			case "july":

				if(day >=1 && day<=22){
					
					message = "Cancer";
				}else{
					message = "Leo";
				}
				break;
			case "august":

				if( day>=1 && day<=22 )	
				{
					message = "Leo";
				}else
				{
					message = "Virgo";
				}
				break;
			case "september":
				if(day>=1&&day<=22)
				{	
					message="Virgo";
				}else{
					message = "Libra";
				}
					break;
			case "october":
				if(day>=1&&day<=22){
					
					message = "Libra";
				}else{
					message = "Scorpio";
				}	

				break;
			case "november":
				if(day>=1 && day <=21){
					message = "Scorpio";
				}else{
					message = "Sagittarius";
				}
				break;
			case "december":
				if(day>=1 && day <=21)
				{
					message = "Sagittarius";
				}else{
					message = "Capricorn";
				}
				break;	
		}
	
	}

	// get
	public String getMessage(){
	
		return message;
	}
}
