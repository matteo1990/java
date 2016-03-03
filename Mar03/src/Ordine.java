import java.util.Date;


public class Ordine extends Documento {

	private String nome;
	private Date dataScadenza;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}




	@Override
	public void stampa() {
		System.out.println("ordine");
		
	}

}
