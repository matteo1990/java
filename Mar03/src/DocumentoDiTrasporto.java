
public class DocumentoDiTrasporto extends Documento {

	private String vettore;
	
	public String getVettore() {
		return vettore;
	}

	public void setVettore(String vettore) {
		this.vettore = vettore;
	}



	@Override
	public void stampa() {
		System.out.println("trasporto");
	}

}
