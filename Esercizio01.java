import java.util.Scanner;

public class Esercizio01 {
	public static void main (String[] args) {
		Scanner tastiera=new Scanner(System.in);
			System.out.println("in che anno sei nato?");
			int eta = tastiera.nextInt();
			System.out.println("in che anno siamo?");
			int anno = tastiera.nextInt();
			
			System.out.println(anno - eta);
 }
}
