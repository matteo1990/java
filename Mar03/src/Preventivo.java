import java.util.Date;


public class Preventivo extends Documento {
	private Date dataScadenza;

	public Date getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	@Override
	public void stampa() {
		System.out.println("preventivo");
		
	}
	
	
}
