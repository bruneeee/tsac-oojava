package harbour;

public class Invasore {
	String codice;
	String modello;
	int p = 0;

	public Invasore(String codice, String modello) {
		this.codice = codice;
		this.modello = modello;
	}
	
	public int getPotenza(){
		return this.p;
	}
}
