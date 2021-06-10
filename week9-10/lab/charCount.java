/*
 * created by Fagner Nunes
 *
 * */

public class charCount{

	// Data members
	private String input;
	private int spaces;
	private int vowels;
	private int consonants;

	// constructors
	public charCount(){
	
		spaces = 0;
		vowels = 0;
		consonants = 0;
		input = new String();
	}

	// set 
	public void setInput(String input){
	
	
		this.input = input;
	}

	// Compute
	
	public void compute()
	{
		for(int i = 0; i<input.length();i++)
		{
			if(input.charAt(i)==' ')
			{
				spaces = spaces +1;
			}else if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
			{	
				vowels = vowels + 1;
			}else{
			
				consonants = consonants +1;
			
			}
		}
	
	}

	// get 
	public int getVowels(){
	
		return vowels;
	}
	public int getConsonants(){
		return consonants;
	}
	public int getSpaces(){
		
		return spaces;
	}

}
