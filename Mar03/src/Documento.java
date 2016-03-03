import java.util.Date;

public abstract class Documento {
	private String nomeDest;
	private String cognomeDest;
	private String indirizzoDest;
	private Date data;
	private int numero;
	private String codiceFiscaleDest;
	private String partitaIvaDest;
	private String ragioneSocialeDest;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNomeDest() {
		return nomeDest;
	}
	public void setNomeDest(String nomeDest) {
		this.nomeDest = nomeDest;
	}
	public String getCognomeDest() {
		return cognomeDest;
	}
	public void setCognomeDest(String cognomeDest) {
		this.cognomeDest = cognomeDest;
	}
	public String getIndirizzoDest() {
		return indirizzoDest;
	}
	public void setIndirizzoDest(String indirizzoDest) {
		this.indirizzoDest = indirizzoDest;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getCodiceFiscaleDest() {
		return codiceFiscaleDest;
	}
	public void setCodiceFiscaleDest(String codiceFiscaleDest) {
		this.codiceFiscaleDest = codiceFiscaleDest;
	}
	public String getPartitaIvaDest() {
		return partitaIvaDest;
	}
	public void setPartitaIvaDest(String partitaIvaDest) {
		this.partitaIvaDest = partitaIvaDest;
	}
	public String getRagioneSocialeDest() {
		return ragioneSocialeDest;
	}
	public void setRagioneSocialeDest(String ragioneSocialeDest) {
		this.ragioneSocialeDest = ragioneSocialeDest;
	}

	
	public Documento(){
		data = new Date();
	}
	
	public Documento(Date data, int numero) {
		this.data = data;
		this.numero = numero;
	}
	public abstract void stampa();
	
	public int confronta(Documento documento) {
		return getNumero() - documento.getNumero();
		
	}


	
}
