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
        System.out.println("\nEnter the size of the pizza(diameter): ");
        size = sc.nextDouble();
        
        // Calculate total cost
        cost = ((.05 * size * size) + 1 + .75);
        
        // Output the total
        System.out.println("Total cost: $" + cost);
    }
}