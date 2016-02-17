import java.util.Scanner;

public class Esercizio04{
	public static void main (String[] args) {
		Scanner tastiera=new Scanner(System.in);
			System.out.println("indica il primo numero");
			int num1 = tastiera.nextInt();
			System.out.println("indica il secondo numero");
			int num2 = tastiera.nextInt();
			System.out.println("indica il terzo numero");
			int num3 = tastiera.nextInt();
			System.out.println("La media dei tre numeri è " + (num1+num2+num3)/3);
		
		}
	
	
	}
