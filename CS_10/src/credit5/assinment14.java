package credit5;
import java.util.Scanner;

public class assinment14 {
	public static void main(String Args[]) {
		System.out.print("Enter the Age: ");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		in.close();
		if (i >= 0 && i <= 5) {
			System.out.println("Toddler");
		} else if (i >= 6 && i <= 10) {
			System.out.println("Child");
		} else if (i >= 11 && i <= 12) {
			System.out.println("Preteen");
		} else if (i >= 13 && i <= 17) {
			System.out.println("Teen");
		} else if (i >= 18) {
			System.out.println("Adult");
		} else {
			System.out.println("Invalid input");
		}
	}
}