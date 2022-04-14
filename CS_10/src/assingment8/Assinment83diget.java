package assingment8;
import java.util.Scanner;

/*
Program: Assinment8.java         
 Date: April 7, 2022
Author: Omar Karsan 
School: CHHS
Course: Computer Science 10
*/
public class Assinment83diget 
{
private static Scanner input;

public static void main(String[] args) 
{
	 input = new Scanner(System.in);

    //Values of each digit
    int hundreds = 0;
    int tens = 0;
    int ones = 0;

    //Prompt user to input 3 digit number           
    System.out.print("Enter your 3 digit number: ");
    int number = input.nextInt();

if (number <= 999 && number > 99)   // Checking condition for three digit number
{

    //Displays hundreds place digit
    hundreds = number / 100;
    System.out.printf("Hundreds place digit: " + hundreds);

    //Displays tens digit
    tens = (number - (hundreds*100)) / 10;  // compare with your code
    System.out.printf("\nTens place digit: " + tens);


    //Display ones digit
    ones = (number - (tens*10) - (hundreds*100));   // compare with your code
    System.out.printf("\nOnes place digit: " + ones);   
}
                     //Error if number is less or more then three digits
else                                                                    
{      
if (number > 999)
    System.out.println("\nError! To many digets(more then 3).");
    if (number < 100)
    System.out.println("Error! To little digets (less then 3).");
}



}
}
/* Screen Dump
Enter your 3 digit number:
Hundreds place digit:
Tens place digit:
Ones place digit:
Error! To many digets(more then 3).
Error! To little digets (less then 3)
*/

