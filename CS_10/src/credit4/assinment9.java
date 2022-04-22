package credit4;

import java.util.Scanner;
public class assinment9 {

	public static void main(String[] args) {
		 Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter an integer:"); //user enters number
		 int firstint = userinput.nextInt(); //grab and store number

		 Scanner input = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter a second interger:"); //user enters number
		 int secondint = userinput.nextInt(); //grab and store number


System.out.println(firstint + " / " + secondint + " = " + firstint / secondint +"\n"); // display answer and calculate equation
System.out.println(firstint + " % " + secondint + " = " + firstint % secondint + "\n"); // display out answer and calculate equation


System.out.println(secondint + " / " + firstint + " = " + secondint / firstint + "\n"); // display out answer and calculate equation
System.out.println(secondint + " % " + firstint + " = " + secondint % firstint + "\n"); // display out answer and calculate equation

}
	}


