package Pizzasite;
import java.util.Scanner;
public class pizzasite 
{
public static void main(String[] args) 
{
		   // Declare variables
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        double size = 0.0;
        double cost = 0.0;
        
        // Display instructions
        System.out.println("Enter the size of the pizza in inches: ");
        size = sc.nextDouble();
        
        // Calculate total cost
        cost = ((.05 * size * size) + 1 + .75);
        
        // Output the total
        System.out.println("\nTotal cost: $" + cost);
    }
}