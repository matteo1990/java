import java.util.Scanner;

public class Esercizio09 {
	public static void main (String[] args) {
		Scanner tastiera = new Scanner (System.in);
		System.out.println("Dammi un intero");
		int num1 = tastiera.nextInt();
		System.out.println("Ancora uno!");
		int num2 = tastiera.nextInt();
		while (num1>num2) {
			System.out.println("Scegli un altro numero come primo");
			num1 = tastiera.nextInt();
			}
				 
			for (int i=num1; i<num2; i++) {
				if (i % 2 == 0) {
			System.out.println (i) ;
				}
			}
			
		}
}

