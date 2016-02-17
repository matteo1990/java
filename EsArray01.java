import java.util.Scanner;

public class EsArray01{
	public static void main(String[] args){
	Scanner tastiera = new Scanner(System.in);
	
	int sum = 0;
	int[] arrayNum = new int[5];
	
	for (int i=0; i<5; i++) {
		System.out.println("Give me a number:");
		arrayNum[i] = tastiera.nextInt();
		sum = sum + arrayNum[i];
		}
		
		System.out.println(sum);
	}
}
