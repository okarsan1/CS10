/*
Program: assinment16.java 
        
 Date: May 5, 2022
Author: Omar Karsan 
School: CHHS
Course: Computer Science 10
*/
package credit5;
import java.util.Scanner;
public class assignment16
{

  public static void main(String[] args) {

           int secretNumber;

           secretNumber = (int) (Math.random() * 19 + 1);          

           @SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

           int guess;

            {

                 System.out.print("Enter a guess (1-20): ");

                 guess = keyboard.nextInt();

                 if (guess == secretNumber)

                	 System.out.println("Computer?s Number is:"+secretNumber+"\nPlayer?s Number is:"+guess+"\nYou Won!");

                 else if (guess < secretNumber)

                       System.out

                                  .println("Computer?s Number is:"+secretNumber+"\nPlayer?s Number is:"+guess+"\nBetter luck next time.");

                 else if (guess > secretNumber)

                       System.out

                                  .println("Computer?s Number is:"+secretNumber+"\nPlayer?s Number is:"+guess+"\nBetter luck next time.");

           } while (guess != secretNumber);

     }
  

}
/* Screen Dump

*/