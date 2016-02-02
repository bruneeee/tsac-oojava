package harbour;

public class Sottomarino extends Invasore{
	int stazza;
	int armamenti;
	public Sottomarino(String codice, String modello, int stazza, int armamenti) {
		super(codice, modello);
		this.stazza = stazza;
		this.armamenti = armamenti;
		this.p = stazza * armamenti;
	}
	
}
