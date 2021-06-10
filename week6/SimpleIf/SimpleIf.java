

import javax.swing.*;
public class SimpleIf{
    public static void main(String args[]){


      double number1,number2;

      number1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter a number")); //joption always takes in a string
      number2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter a number")); //joption always takes in a string


      if (number1 == number2) {
        JOptionPane.showMessageDialog(null,"Yes, Numbers are equal");
      } else {
        JOptionPane.showMessageDialog(null,"No, Numbers NOT are equal");
      }

    }//closing main method bracket
}// closeing class bracket
