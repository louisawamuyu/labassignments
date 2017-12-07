
package Operations;

import java.util.Scanner;


public class Calculations extends Arithmetic {
    
    
    {
 
      Scanner s = new Scanner(System.in);
      System.out.print("Enter first number: ");
      int firstNumber = s.nextInt();
      System.out.print("Enter second number: ");
      int secondNumber = s.nextInt();
      int difference = firstNumber - secondNumber;
      System.out.println("The result of addition was " + difference);
   }
    
}
