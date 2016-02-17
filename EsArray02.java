import java.util.Scanner;

public class EsArray02{
	public static void main(String[] args){
	Scanner tastiera = new Scanner(System.in);
	
	System.out.println("Quanto lo vuoi lungo?");
	int[] arrayNum = new int[tastiera.nextInt()];
	int max = 0;
	int posmax = 0;
	
	
	for (int i=0; i<arrayNum.length; i++) {
		System.out.println("Dammi i numeri");
		arrayNum[i] = tastiera.nextInt();
		if (arrayNum[i]>max) {
			max=arrayNum[i];
			posmax = i;}
			
		}
		
	System.out.println(max + " è il più grande");
	System.out.println("la sua posizione è: " + posmax );
	
	}
}
