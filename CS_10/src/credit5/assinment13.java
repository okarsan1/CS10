/*
Program: assinment13.java     
    
 Date: April 27, 2022
Author: Omar Karsan 
School: CHHS
Course: Computer Science 10
*/

	package credit5;
	import java.util.Scanner;
	public class assinment13 {

		public static void main(String[] args) 
		{
			@SuppressWarnings("resource")
			Scanner grades = new Scanner(System.in);

	        int x = 0;
	        System.out.print("Enter the number of copies to be printed:");
	        x = grades.nextInt();
	        
	        if (x > 10000 || x < 0){
	                System.out.println("Please put in a percent from 0 - 100!\n");
	        }

	        while (x > 10000 || x < 0 ){

	            System.out.print("Enter a grade percentage:");
	            x = grades.nextInt();
	            if (x > 10000 || x < 0){
	                System.out.println("Please put in a percent from 0 - 100!\n");
	            }
	        }
	        if (x <= 99 && x >= 0){
	        	 System.out.print("\nPrice per copy is:"+.30+"\n");
	             System.out.print("\nTotal cost is:"+x*.30);
	        }
	         if (x <= 499 && x >= 100){
	        	 System.out.print("\nPrice per copy is:"+.28+"\n");
	             System.out.print("\nTotal cost is:"+x*.28);
	        }
	         if (x <= 749 && x >= 500){
	        	 System.out.print("\nPrice per copy is:"+.27+"\n");
	             System.out.print("\nTotal cost is:"+x*.27);
	        }
	         if (x <= 1000 && x >= 750){
	        	 System.out.print("\nPrice per copy is:"+.26+"\n");
	        	  System.out.print("\nTotal cost is:"+x*.26);
	            
	        }
	         if (x <= 1000000000 && x >= 1001){
	        	 System.out.print("\nPrice per copy is:"+.25+"\n");
	             System.out.print("\nTotal cost is:"+x*.25);
	          
	        }
	        
	        }
	        // price per copy and total cost
		}
