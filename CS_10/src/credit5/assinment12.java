/*
Program: assinment12.java         
 Date: April 27, 2022
Author: Omar Karsan 
School: CHHS
Course: Computer Science 10
*/
package credit5;
import java.util.Scanner;
public class assinment12 {

	public static void main(String[] args)
	{
	@SuppressWarnings("resource")
	Scanner grades = new Scanner(System.in);

	        int x = 0;

	        System.out.print("Enter a grade percentage:");
	        x = grades.nextInt();

	        if (x > 100 || x < 0){
	                System.out.println("Please put in a percent from 0 - 100!\n");
	        }

	        while (x > 100 || x < 0 ){

	            System.out.print("Enter a grade percentage:");
	            x = grades.nextInt();
	            if (x > 100 || x < 0){
	                System.out.println("Please put in a percent from 0 - 100!\n");
	            }
	        }
	        if (x <= 100 && x >= 90){
	             System.out.print("The corresponding letter grade is:A+");
	        }
	         if (x <= 89 && x >= 80){
	             System.out.print("The corresponding letter grade is:A");
	        }
	         if (x <= 79 && x >= 75){
	             System.out.print("The corresponding letter grade is:B+");
	        }
	         if (x <= 74 && x >= 70){
	             System.out.print("The corresponding letter grade is:B");
	        }
	         if (x <= 69 && x >= 65){
	             System.out.print("The corresponding letter grade is:C+");
	        }
	         if (x <= 64 && x >= 60){
	             System.out.print("The corresponding letter grade is:C");
	        }
	         if (x <= 59 && x >= 55){
	             System.out.print("The corresponding letter grade is:D+");
	        }
	         if (x <= 54 && x >= 50){
	             System.out.print("The corresponding letter grade is:D");
	        }
	         if (x <= 49 && x >= 0){
	             System.out.print("The corresponding letter grade is:F");
	        }
	        // so on and so forth down the grading scale
	}

	}
	/* Screen Dump

	*/