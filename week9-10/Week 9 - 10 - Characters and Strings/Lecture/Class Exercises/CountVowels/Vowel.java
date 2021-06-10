/*
 *VowelApp.java
 *@author S Bonner
 *30 MArch 2021
 *Develop and application that allows the user to input a word.  The application will
 *count the number of vowels that are in the word, and output this number to the user.
 */

public class Vowel{

    private String word;
    private int vowel;

    public Vowel(){
      word = "";
      vowel = 0;
    }//closing bracket - constructor

    //set methods

    public void setWord(String word){
      this.word = word;
    }

    //compute methods
    public void compute(){
      String lwcWord = word.toLowerCase();
      for(int i = 0; i < word.length();i++){
        if(lwcWord.charAt(i)=='a'||lwcWord.charAt(i)=='e'||
        lwcWord.charAt(i)=='i'||lwcWord.charAt(i)=='o'||lwcWord.charAt(i)=='u'){
          vowel++;
        }
      }
    }

    //get methods
    public int getVowel(){
 		 return vowel;
 	  }

}//closing bracket - class
