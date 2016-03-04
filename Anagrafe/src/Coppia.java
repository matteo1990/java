
public class Coppia {

	private Persona persona;
	private Cane cane;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Cane getCane() {
		return cane;
	}

	public void setCane(Cane cane) {
		this.cane = cane;
	}
	
	public Coppia (Persona persona, Cane cane){
		this.persona = persona;
		this.cane = cane;
	}
	
	
}
