package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public abstract class Invasore{
	String modello;
	String Id;
	
	public Invasore(){
		
	}
	public abstract int potenzaFuoco();
	
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
}