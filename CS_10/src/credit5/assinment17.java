/*
Program: assinment17.java 

        
 Date: May 5, 2022
Author: Omar Karsan 
School: CHHS
Course: Computer Science 10
*/
package credit5;
import java.util.Scanner;
public class assinment17 {

	public static void main(String[] args)
	{
	@SuppressWarnings("resource")
	Scanner userinput = new Scanner(System.in);  // Create a Scanner object
	System.out.println("Enter your GPA or -1 to quit application"); //user enters number
	double gpa = userinput.nextDouble(); //grab and store number

	while ( gpa != -1) //create while loop
	{

	if ( gpa >= 3.8) //check gpa
	{
	System.out.println("summa cum laude \n"); //print sentence based on gpa


	}

	else if ( gpa > 3.65 && gpa < 3.8) //check gpa
	{
	System.out.println("magna cum laude \n"); //print sentence based on gpa
	}

	else if ( gpa > 3.5 && gpa < 3.65) //check gpa
	{
	System.out.println("cum laude \n"); //print sentence based on gpa
	}

	else
	{
	System.out.println("Sorry you did not qualify for honors distinction \n"); //print sentence based on gpa
	}

	System.out.println("Do you want to enter another GPA or you can type -1 to quit the application"); //user enters number
	gpa = userinput.nextDouble(); //grab and store number

	}

	System.out.println ("Thank you for using our program, have a great day!"); //closing sentence

	}
	}
/* Screen Dump

*/