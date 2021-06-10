/*
 *VowelApp.java
 *@author S Bonner
 *30 MArch 2021
 *Develop and application that allows the user to input a word.  The application will
 *count the number of vowels that are in the word, and output this number to the user.
 */
import javax.swing.*;
 public class VowelApp{

   public static void main(String[] args) {

     String word;
     String repeat;
     int vowel;

       do{
         Vowel myVowel = new Vowel();
         word = JOptionPane.showInputDialog(null,"Please enter a word");
         if (word.isEmpty()){
           JOptionPane.showMessageDialog(null,"Please enter a valid word");
         } else {
           myVowel.setWord(word);
           myVowel.compute();
           vowel=myVowel.getVowel();
           JOptionPane.showMessageDialog(null,"There are "+vowel+" vowels in the word/words \""+word+"\"");
          }
          repeat = JOptionPane.showInputDialog(null,"Would you like to check another word? Enter yes or no ");

       } while(repeat.equalsIgnoreCase("yes"));


   }//closing bracket - main method
 }//closing bracket - class
