package assignment6;
/*
Program: Assignment6.java         
 Date: April 7, 2022
Author: Omar Karsan 
School: CHHS
Course: Computer Science 10
*/
import java.util.Scanner;

public class Assignment6 {

	 public static void main(String[] args) {
		    try (Scanner myObj = new Scanner(System.in)) {
		    	System.out.println("What is your first name?,What is your last name?,What grade are you in?,What school do you attend?,What is your favourite hobby?");

				// String input
				String name  = myObj.nextLine();;
				String last  = myObj.nextLine();;
				String grade  = myObj.nextLine();;
				String school  = myObj.nextLine();;
				String hobby  = myObj.nextLine();;
				// Output input by user
				System.out.println("Hello, your first  name is\n" + name);
				System.out.println("And your last name is\n" + last);
				System.out.println("you are currently in grade\n" + grade);
				System.out.println("at\n" + school);
				System.out.println("Your favourite hobby is\n" + hobby);
	             
				
				
			} 
		  }
		}
/* Screen Dump

What is your first name?,What is your last name?,What grade are you in?,What school do you attend?,What is your favourite hobby?:

 */
