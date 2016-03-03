import java.sql.Date;


public class Fattura extends Documento{

	private Date dataScadenza;
	private float totale;
	
	public Fattura(){
		super();
		
		/*richiama il costruttore di default della classe parent*/
	}
	
	public Date getDataScadenza() {
		return dataScadenza;
	}
	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	public float getTotale() {
		return totale;
	}
	public void setTotale(float totale) {
		this.totale = totale;
	}

	@Override /*  da annotazioni aggiuntive al ns codice. ridefinisce un metodo della classe base, che qui non è abstract */
	public void stampa() {
		System.out.println("fattura");
	}


	

}
