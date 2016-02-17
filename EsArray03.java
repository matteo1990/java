import java.util.Scanner;

public class EsArray03{

	
	public static void main(String[] args){
	
			Scanner tastiera = new Scanner(System.in);
			int[] arrayNum = {44,11,5,8,10,3};
			show(arrayNum);
			max(arrayNum);
			min(arrayNum);
			
		
	}
	
	public static void show(int [] a) {

			System.out.println("Gli elementi dell'array sono: ");
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			}
	
		}
		
	public static void max(int [] a) {
			int max = 0;
			
		for (int i=0; i<a.length; i++){
			if (a[i]>max){
				max = a[i];
				}
			}
		System.out.println("Il maggiore è: " + max);
		}
		
	public static void min(int [] a) {
			int min = a[0];
			
		for (int i=0; i<a.length; i++){
			if (a[i]<min){
				min = a[i];
				}
			}
		System.out.println("Il minore è: " + min);
		}
		
}
