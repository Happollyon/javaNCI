/*
 *
 *
 * Created By Fagner Nunes.
 *
 * */

public class change {

	private StringBuffer bffr;
       	private String output;	
	private String input;
	private char first;
	private char last;
	private int size;
	// constructor
	public change(){
		first = 'a';
		output = " ";
		last= 'a';
		size = 0;
		bffr = new StringBuffer(" ");
		input = " ";
	}
	//setter
	public void setInput(String input){
		
		this.input = input;
	}

	// compute 
	public void compute(){
		size = input.length();
		first= input.charAt(0); 
		last = input.charAt(size - 1);
		System.out.println(last);
		for (int i = 0; i<size; i++){
		
			if(i==0){
			
				bffr.append(last);
			
			}else if (i==(size - 1)){
			
				bffr.append(first);
				
			}else{
			
				bffr.append(input.charAt(i));
			}
		
		}
		output = bffr.toString();
		
	}
	

	public String getName(){
	
		return output;
	}
}
