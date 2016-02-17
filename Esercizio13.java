import java.util.Scanner;

public class Esercizio13{
	public static void main (String [] args){
		Scanner tastiera = new Scanner(System.in);
		
		
		int min;
		System.out.println("Give me some numbers:");
		min = tastiera.nextInt();
		
		int num;
			for (int i=0; i<9; i++){
				num = tastiera.nextInt();
				if (num<min) {
					min = num;
					}
				}
		System.out.println(min + " is the smallest one");
			

		}
	}
