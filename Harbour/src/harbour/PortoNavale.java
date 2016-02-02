package harbour;

public class PortoNavale {
	private String nome;
	private int imbarcazioni;
	private int dimensione;
	
	public PortoNavale(String nome, int imbarcazioni, int dimensione) {
		this.nome = nome;
		this.imbarcazioni = imbarcazioni;
		this.dimensione = dimensione;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getImbarcazioni() {
		return imbarcazioni;
	}
	public void setImbarcazioni(int imbarcazioni) {
		this.imbarcazioni = imbarcazioni;
	}
	public int getDimensione(){
		return this.dimensione;
	}
	public void setDimensione(int dimensione) {
		this.dimensione = dimensione;
	}

	public void  receiveDanno(int danno){
		dimensione -= danno * 1.5;
	}
	public boolean isAlive(){
		if(dimensione > 0)
			return true;
		return false;
	} 
	
}
