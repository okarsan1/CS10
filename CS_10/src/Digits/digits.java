package Digits;
import java.util.Scanner;
/*
Program: digits.java         
 Date: April 7, 2022
Author: Omar Karsan 
School: CHHS
Course: Computer Science 10
*/
public class digits {
	public static void main(String[] args)
	{
	     @SuppressWarnings("resource")
		Scanner userinput = new Scanner(System.in);
	System.out.println("Enter the change you have: ");
	     int change = userinput.nextInt();
	     int quarters = change / 25;
	     int dimes = ((change % 25)/10);
	     int nickels = ((change % 25)%10)/5;
	     System.out.println("The change you provided is:" + change );
	     System.out.println("Quarters: " + quarters);
	     System.out.println("Dimes: " + dimes);
	     System.out.println("Nickels: " + nickels);
	}

	}

/* Screen Dump

*/

