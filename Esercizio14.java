import java.util.Scanner;

public class Esercizio14{
	public static void main(String [] args){
	Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Gimme a number!");
		
		int mult=1;
		int num;
		num = tastiera.nextInt();
		for (int i=1; i<=num; i++){
			
			mult = mult*i;
		}
		
		System.out.println(mult);
		}
	}
