package harbour;

public class Aereo extends  Invasore{
	int alpha;
	int beta;
	public Aereo(String codice, String modello, int alpha, int beta) {
		super(codice, modello);
		this.alpha = alpha;
		this.beta = beta;
		
		this.p = alpha*10 + beta*25;
	}
	
}
