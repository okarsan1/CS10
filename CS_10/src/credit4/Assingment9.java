package credit4;
import java.util.Scanner;
/*
 Calculates and displays the area of a rectangle
 based on the width and length entered the user
*/
public class Assingment9 
{
	  public static void main(String[] args, Scanner keyboard) {
	        int num;
	        int sum;
	        int temp;

	        System.out.print("Enter an integer, positive or negative: ");
	        num = keyboard.nextInt();
	        System.out.println();

	        if (num < 0)
	            num = -num;

	        sum = 0;

	        while (num > 0) {
	            temp = num;
	            sum = sum + num % 10;           //Extracts the last digit and adds it to the sum
	            num = num / 10;                 //removes the last digit
	            System.out.print(temp % 10 + " ");
	        }

	        System.out.println(" and the sum is " + sum);
	    }
	}
