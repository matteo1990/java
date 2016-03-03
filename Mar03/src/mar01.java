
public class mar01 {


	public static void main(String[] args) {
		Documento[] docs = {
			new Fattura(),
			new Fattura(),
			new Preventivo(),
			new Commessa(),
			new DocumentoDiTrasporto(),
			new Ordine()
		};
		
		for(Documento d: docs){
			d.stampa();
		}
	}
}
