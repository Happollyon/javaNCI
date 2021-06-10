/*
*LastLetter.java
*Authod: Sean Bonner
*Date: 12/04/2020
*Summary: Develop an Application that will accept a word  from the user as input.
*The application should then delete the last letter of the word. The resulting
*string should be output to the user
*
*/
import javax.swing.*;
public class LastLetterRedacted{
  public static void main(String[] args) {

    //declare variables and objects
    String input="";
    String output="";
    StringBuffer strBuff = new StringBuffer();

    //user input
    input = JOptionPane.showInputDialog(null,"Please enter a word");
    int size = input.length();
    //process
    for (int i = 0; i < size-1; i++){
      strBuff.append(input.charAt(i));
    }
    strBuff.insert(size-1, "<redacted>");
    output=strBuff.toString();

    //output
    JOptionPane.showMessageDialog(null,"With a letter deleted, your word is : "+output);


  }//closing main method bracket
}//closing class bracket
