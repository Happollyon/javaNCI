/*
 *ReplaceApp.java
 *@author F.Sheridan
 *19th Nov 2013
 */
 import javax.swing.JOptionPane;
 public class ReplaceApp{
	 public static void main(String args[]){

		 String name, newName;

		 Replace myReplace = new Replace();

		 name = JOptionPane.showInputDialog(null,"Enter your name");
		 myReplace.setName(name);

		 myReplace.compute();

		 newName = myReplace.getNewName();
		 JOptionPane.showMessageDialog(null,"Your new name is "+newName);


	 }
 }
