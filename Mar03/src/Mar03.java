import java.util.Date;

public class Mar03 {

	
	public static void ordina(int[] array1){
		
		boolean inOrdine = false;
		while(!inOrdine){
			inOrdine = true;
			for(int i=0; i<array1.length-1; i++){
				if(array1[i]>array1[i+1]){
					int tmp = array1[i];
					array1[i] = array1[i+1];
					array1[i+1]=tmp;
					inOrdine = false;
				}
			}
		}
	}
		
		public static void ordina(Documento[] array1){
			
			boolean inOrdine = false;
			while(!inOrdine){
				inOrdine = true;
				for(int i=0; i<array1.length-1; i++){
					Date dataDoc1 = array1[i].getData();
					Date dataDoc2 = array1[i+1].getData();
					int test = dataDoc1.compareTo(dataDoc2);  //compareTo restituisce un valore. restituisce 0 se sono uguali. <0 se il secondo è < del primo. >0 se il secondo è > del primo.
					if(test > 0){
						Documento tmp = array1[i];
						array1[i] = array1[i+1];
						array1[i+1]=tmp;
						inOrdine = false;
					}
				}
			}
	}
		
	public static void ordina(Object[] array1, Confrontabile c){
			
			boolean inOrdine = false;
			while(!inOrdine){
				inOrdine = true;
				for(int i=0; i<array1.length-1; i++){
					if(c.confronta(array1[i], array1[i+1])> 0){
						Object tmp = array1[i];
						array1[i] = array1[i+1];
						array1[i+1]=tmp;
						inOrdine = false;
					}
				}
			}
	}
	
	public static void main(String[] args) {
	
		int[] temperature = {14, 3, 27, 21, 4, 1, 46};
		ordina(temperature);
		for (int i=0; i<temperature.length; i++){
			System.out.println(temperature[i]);
	}
		
		
		Documento[] docs = {
				new Fattura(),
				new Ordine(),
				new Preventivo()
		};
		
		CriterioPerNumero cpn = new CriterioPerNumero();
		ordina(docs, cpn);
		
		ordina(docs, new Confrontabile() {
			
			@Override
			public int confronta(Object o1, Object o2) {
				Documento d1 = (Documento)o1;
				Documento d2 = (Documento)o2;
				return d1.getNumero() - d2.getNumero();
			}
		});
		
		for(Object d: docs)
			((Documento)d).stampa();
	
	
	}
}
