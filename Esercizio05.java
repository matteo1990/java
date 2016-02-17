import java.util.Scanner;

public class Esercizio05 {
	public static void main (String[] args) {
		Scanner tastiera = new Scanner (System.in);
			System.out.println("Indica il primo numero");
			int num1 = tastiera.nextInt();
			System.out.println("Indica il secondo numero");
			int num2 = tastiera.nextInt();
			System.out.println("Indica il terzo numero");
			int num3 = tastiera.nextInt();
			
			
			if (num1>num2 && num1>num3) {
				System.out.println(num1 + " è il maggiore");
			} else if (num2>num1 && num2>num3) {
				System.out.println(num2 + " è il maggiore");
			} else {
				System.out.println(num3 + " è il maggiore");
				}
			 
		
		}

}
