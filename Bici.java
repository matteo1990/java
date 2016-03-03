import java.util.Scanner;

public class Bici{
	String modello;
	String nomeProprietario;
	int marcia;
	int velocita;


	
public Bici (String modello, String nomeProprietario) {
	this.modello = modello;
	this.nomeProprietario = nomeProprietario;
	}	
	
public Bici (String modello, String nomeProprietario, int marcia, int velocita) {
	this.modello = modello;
	this.nomeProprietario = nomeProprietario;
	this.marcia = marcia;
	this.velocita = velocita;
	}
	
public String getModello(){
	return modello;
	}

public String getNomeProprietario() {
	return nomeProprietario;
	}

public int getMarcia() {
	return marcia;
	}
	
public void cambiaMarcia (int marciaMod) {
	marcia = marcia + marciaMod;
	}

public int getVelocita() {
	return velocita;
	}

public void aumentaVelocita (int velocitaMod) {
	velocita = velocita + velocitaMod;
	}

public void stampaStato () {
	System.out.println(modello + " " + nomeProprietario + " " + velocita + " " + marcia);
	}
}


