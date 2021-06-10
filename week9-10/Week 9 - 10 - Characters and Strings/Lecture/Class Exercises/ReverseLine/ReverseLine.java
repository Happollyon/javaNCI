/*
 *ReverseApp.java
 *@author L Murphy
 *18th Nov 2013
 */
 import javax.swing.JOptionPane;
 public class ReverseLine{
	 public static void main(String args[]){
		 String word;
		 int len;

		 word = JOptionPane.showInputDialog(null, "Enter a word");
		 len = word.length();

		 for(int i= len-1; i >= 0; i = i -1){
			 System.out.println(word.charAt(i));
		 }


	 }
 }
