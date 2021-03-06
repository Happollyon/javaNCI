/*
 *IncorrectWordNoVowelApp.java
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
import javax.swing.*;
 public class IncorrectWordNoVowelApp{

   public static void main(String[] args) {

     String word;
     String repeat;
     String message;
     int vowel;

       do{
         IncorrectWordNoVowel myVowel = new IncorrectWordNoVowel();
         word = JOptionPane.showInputDialog(null,"Please enter a word");
         if (word.isEmpty()){
           JOptionPane.showMessageDialog(null,"Please enter a valid word");
         } else {
           myVowel.setWord(word);
           myVowel.compute();
           message=myVowel.getMessage();
           JOptionPane.showMessageDialog(null,message);
          }
          message=myVowel.getMessage();
     } while (message.contains("Sorry"));

   }//closing bracket - main method
 }//closing bracket - class
