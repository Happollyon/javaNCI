/*
*
*StringBufferMethods.java
*Authod: Sean Bonner
*Date: 12/04/2020
*/

public class StringBufferMethods {
  public static void main(String[] args) {

    //instantiate string and String Buffer object
    String myString = "Hello World";
    StringBuffer strBuff = new StringBuffer(myString);

    /*
    * example print of a string Buffer
    */

    System.out.println("String Buffer contains: "+strBuff+ "\n");

    /*
    * append()
    */

    strBuff.append(", Java is fun");
    System.out.println("append() Example: "+strBuff+ "\n");

    /*
    * insert()
    * Due to the previoud append() statement, the String Buffer now
    * contains the following "Hello World, Java is fun"
    */

    strBuff.insert(13,"its hard but ");
    System.out.println("insert() Example: "+strBuff+ "\n");

    //alternative to achieve the same result:
    //strBuff.insert(strBuff.indexOf("Java"),"its hard but ");
    //System.out.println("Insert Example: "+strBuff+ "\n");


    /*
    * toString()
    * Due to the previoud reverse() statement, the String Buffer now
    * contains the following: "dlroW iH"
    */
    myString = strBuff.toString();
    System.out.println("toString() example: "+myString);



  }//closing main method bracket
}//closing class bracket
