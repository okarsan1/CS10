package credit5;
import java.util.Scanner;
public class assinment15 {

	public static void main(String[] args) {
		int n1,n2,op, a1,a2,a3,a4,a5;
		double a6;
		n1= (int)(10*Math.random()+1);
		n2= (int)(10*Math.random()+1);
		op= (int)(3*Math.random()+1);
		a1= n1+n2;
		a2= n1-n2;
		a3= n1*n2;
		a4= n1/n2;
		@SuppressWarnings("resource")
		Scanner input=new Scanner (System.in);
		if(op==1) {
			System.out.print(n1+ " + " + n2+ "=");
			a5=input.nextInt();
			if (a5==a1) {
				System.out.println("You got it right! Congratulations!!");
				a5=input.nextInt();
			}
			else System.err.print("You are Wrong :(");
		}else if(op==2) {
			System.out.print(n1 + " - "+ n2 + "=");
			a5=input.nextInt();
			if (a5==a2) {
				System.out.println("You got it right! Congratulations!!");
			}
			else System.err.print("You are Wrong :(");
		}else if(op==3) {
			System.out.println(n1 + " * "+ n2 + "=");
			a5=input.nextInt();
			if (a5==a3) {
				System.out.println("You got it right! Congratulations!!");
			}
			else System.err.print("You are Wrong :(");
		}else if(op==4) {
			System.out.println(n1 + " * "+ n2 + "=");
			a6=input.nextInt();
			if (a6==a4) {
				System.out.println("You got it right! Congratulations!!");
			}
			else System.err.print("You are Wrong :(");
                                   }else System.err.print("error");



	}

}


