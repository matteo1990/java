import java.util.Scanner;

public class EsArray03{

	
	public static void main(String[] args){
	
			Scanner tastiera = new Scanner(System.in);
			int[] arrayNum = {11,44,5,8,10,3};
			
			show(arrayNum);
			max(arrayNum);
		
	}
	
	
	
	public static void show(int [] a) {

			System.out.println("Gli elementi dell'array sono: ");
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			}
	
		}
		
		
		
	public static int[] max(int [] a) {
			int max = 0;
			int posmax = 0;
			int min = a[0];
			int posmin = 0;
			
		for (int i=0; i<a.length; i++){
			if (a[i]>max) {
			max=a[i];
			posmax = i;}
			else if 
			(a[i]<min){
				min = a[i];
				posmin = i;
			}	
		}	
		System.out.println("Il maggiore è: " + max);
		System.out.println("La posizione del maggiore è: " + posmax);
		System.out.println("Il minore è: " + min);
		System.out.println("La posizione del minimo è" + posmin);
		
		a[posmax]=min;
		a[posmin]=max;
		
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			}
			
		return a;
		}
}

