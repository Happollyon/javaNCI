/*
 *WordNoVowelApp.java
 *@author S Bonner
 *30 MArch 2021
 *
 *Develop an application that prompts the user to enter a word that has no vowels in it.
 *The application should make use of loops and decision making and string methods to verify
 *the word entered has no vowels. The application should also use instantiable classes in
 *your solution.
 *
 */

public class WordNoVowel{

    private String word;
    private String message;
    private int vowel;

    public WordNoVowel(){
      word = "";
      message="";
      vowel = 0;
    }//closing bracket - constructor

    //set methods

    public void setWord(String word){
      this.word = word.toLowerCase();
    }

    //compute methods
    public void compute(){
      if(word.contains("a")||word.contains("e")||word.contains("i")||word.contains("o")||word.contains("u")){
          message="Sorry, that word has a vowel in it, try again";
        } else {
          message = "Great word, thats a vowel-less word!";
        }
      }
    //get methods
   public String getMessage(){
     return message;
    }

}//closing bracket - class

