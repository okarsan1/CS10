package credit5;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		

		 @SuppressWarnings("resource")
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter an interger:"); //user enters number
		 int secondint = userinput.nextInt(); //grab and store number
		 
		int answer = secondint % 2; // calculate if number equals zero

		 if (answer == 0) {
		  System.out.println(secondint + " is even"); //display "its even" if number equals zero
		 }
		 else {
		 System.out.println(secondint + " is odd"); //display "its odd" if number does not equal zero
		 }


	}

}
