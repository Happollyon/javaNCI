/*
 *IncorrectWordNoVowel.java
 *@author S Bonner
 *30 MArch 2021
 *
 *Develop an application that prompts the user to enter a word that has no vowels in it.
 *The application should make use of loops and decision making and string methods to verify
 *the word entered has no vowels. The application should also use instantiable classes in
 *your solution.
 *
 *Note - this version of the application is incorrect. Can you figure out why? and how to fix it?
 */

public class IncorrectWordNoVowel{

    private String word;
    private String message;
    private int vowel;

    public IncorrectWordNoVowel(){
      word = "";
      message="";
      vowel = 0;
    }//closing bracket - constructor

    //set methods

    public void setWord(String word){
      this.word = word;
    }
    Tree
    Sean
    Computer
    //compute methods
    public void compute(){
      String lwcWord = word.toLowerCase();
      for(int i = 0; i <word.length();i++){
        if(lwcWord.charAt(i)=='a'||lwcWord.charAt(i)=='e'||lwcWord.charAt(i)=='i'||lwcWord.charAt(i)=='o'||lwcWord.charAt(i)=='u'){
          message="Sorry, that word has a vowel in it, try again";
        } else {
          message = "Great word, thats a vowel-less word!";
        }
      }
    }
    //get methods
    public String getMessage(){
     return message;
    }
}
//closing bracket - class
