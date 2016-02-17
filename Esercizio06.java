import java.util.Scanner;

public class Esercizio06 {
	public static void main (String[] args) {
		Scanner tastiera = new Scanner (System.in);
			System.out.println("Indica il primo numero");
			int num1 = tastiera.nextInt();
			System.out.println("Indica il secondo numero");
			int num2 = tastiera.nextInt();
			System.out.println("Indica il terzo numero");
			int num3 = tastiera.nextInt();
			
			if ((num1*num1)+(num2*num2) == (num3*num3))
			{
				System.out.println("è una terna pitagorica");
			} else {
				System.out.println("non è una terna pitagorica");
				}	
 }
}
