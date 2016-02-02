package harbour;

public class Gioco {
	private PortoNavale porto;
	
	public Gioco(PortoNavale porto) {
		this.porto = porto;
	}
	public PortoNavale getPorto() {
		return porto;
	}
	public void setPorto(PortoNavale porto) {
		this.porto = porto;
	}

	public void ondata(Invasore[] invasori){
		for(Invasore i : invasori){
			porto.receiveDanno(i.getPotenza());
		}
	}
	public int getPotenza(Invasore[] invasori){
		int potenza = 0;
		for(Invasore i : invasori){
			potenza += i.getPotenza();
		}
		return potenza;
	}
	public boolean isAlive(){
		return porto.isAlive();
	}
	
	/*public static void main(String[] args){
		
	}*/

}
