import java.util.Scanner;

public class Miabici {
  

  public static void main(String[] args) {
	 Scanner tastiera = new Scanner(System.in); 
	  
    Bici biciA = new Bici("BMX", "Matteo", 3, 30);
    Bici biciB = new Bici("MB", "Gigi", 5, 15);
    Bici biciC = new Bici("Graziella", "Graziella", 2, 23);
    
    biciA.stampaStato();
    biciB.stampaStato();
    biciC.stampaStato();
    
    System.out.println("Di quanto vuoi modificare?");
    biciA.aumentaVelocita(tastiera.nextInt());
    biciB.aumentaVelocita(tastiera.nextInt());
    biciC.aumentaVelocita(tastiera.nextInt());
    
    biciA.stampaStato();
    biciB.stampaStato();
    biciC.stampaStato();
    
    System.out.println("Di quanto vuoi modificare?");
    biciA.aumentaVelocita(tastiera.nextInt());
    biciB.aumentaVelocita(tastiera.nextInt());
    biciC.aumentaVelocita(tastiera.nextInt());
    
    biciA.stampaStato();
    biciB.stampaStato();
    biciC.stampaStato();
    
    if (biciA.getVelocita()>biciB.getVelocita() && biciA.getVelocita()>biciC.getVelocita()){
		System.out.println("Ecco le caratteristiche della bici più veloce: ");
		biciA.stampaStato();
		} else if (biciB.getVelocita()>biciA.getVelocita() && biciB.getVelocita()>biciC.getVelocita()){
		System.out.println("Ecco le caratteristiche della bici più veloce: ");
		biciB.stampaStato();
		} else {
		System.out.println("Ecco le caratteristiche della bici più veloce: ");
		biciC.stampaStato();
			}
    
    
      }
}
