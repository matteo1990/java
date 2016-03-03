import java.sql.Date;

public class Commessa extends Documento {

	private int codice;
	private Date dataScadenza;
	
	
	
	public int getCodice() {
		return codice;
	}



	public void setCodice(int codice) {
		this.codice = codice;
	}



	public Date getDataScadenza() {
		return dataScadenza;
	}



	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}



	@Override
	public void stampa() {
		System.out.println("commessa");
	}

}
