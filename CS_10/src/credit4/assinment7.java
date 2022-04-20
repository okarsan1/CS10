package credit4;
import java.util.Scanner;
/*
Program: assinment7.java         
 Date: April 7, 2022
Author: Omar Karsan 
School: CHHS
Course: Computer Science 10
*/
public class assinment7 {

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
Enter the change you have:
he change you provided is:
Quarters:
Dimes:
Nickels:
*/

