
/*
 *NestedLoopsExample.java
 *@author: Sean Bonner
 *Date: 24/03/2021
 */

public class NestedLoopExamples {
  public static void main(String[] args) {

    int weeks = 3;
    int days = 7;


    /*
    * Nested for loops
    */
    // outer loop prints weeks
    System.out.println("Nested for loops \n\n");

    for (int i = 1; i <= weeks; ++i) {
      System.out.println("Week: " + i);

      // inner loop prints days
      for (int j = 1; j <= days; ++j) {
        System.out.println("  Day: " + j);
      }
    }


    /*
    * Nested for loop inside the while loop
    */

    System.out.println("\n\nNested for loop inside the while loop:\n\n");

      int a = 1;
    // outer loop
    while (a <= weeks) {
      System.out.println("Week: " + a);

      // inner loop
      for (int j = 1; j <= days; ++j) {
        System.out.println("  Days: " + j);
      }
      ++a;
    }

    /*
    * nested loops to create a numbers pattern
    */

    System.out.println("\n\nNested for loop inside the while loop:\n\n");

    int rows = 10;

        // outer loop
        for (int i = 1; i <= rows; ++i) {

          // inner loop to print the numbers
          for (int j = 1; j <= i; ++j) {
            System.out.print(j + " ");
          }
          System.out.println("");
        }

        /*
        * nested loops to create a * pattern
        */

        System.out.println("\n\nNested for loop inside the while loop:\n\n");

        int starRows = 5;

            // outer loop
            for (int i = 1; i <= starRows; ++i) {

              // inner loop to print the numbers
              for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
              }
              System.out.println("");
            }

  }//closing main method bracket
}//closing class bracket
