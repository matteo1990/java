import java.util.Scanner;

public class Esercizio12{
	public static void main (String [] args){
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Give me some numbers:");
		int sum = 0;
			for (int i=0; i<10; i++){
				System.out.println("Give me a number:");
				sum = sum + tastiera.nextInt();
				}
				System.out.println(sum/10);

		}
	}
