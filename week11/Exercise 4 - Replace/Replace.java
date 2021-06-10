/*
 *Replace.java
 *@author F.Sheridan
 *19th Nov 2013
 */

 public class Replace{
	 private String name;
	 private String newName;
	 private StringBuffer strBuff;

	 public Replace(){
		 name = " ";
		 newName = " ";
		 strBuff = new StringBuffer();
	 }

	 public void setName(String name){
		 this.name = name;
	 }

	 public void compute(){
		 for(int i = 0; i < name.length(); i++){


		   //System.out.println("loop char is: "+name.charAt(i) );
		   //System.out.println("strBuff char is: "+strBuff);
			 if(name.charAt(i)=='a'){
				 strBuff.append('*');
			 }
			 else{
				 strBuff.append(name.charAt(i));
			 }
		 }
		 newName = strBuff.toString();
	 }


	 public String getNewName(){
		 return newName;
	 }
 }
