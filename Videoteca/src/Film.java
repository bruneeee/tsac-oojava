
public class Film {
	String titolo;
	String regista;
	int annoProd;
	String attori;
	Supporto supporto;
	
	public Film(String titolo, String regista, int annoProd, String attori, Supporto supporto) {
		this.titolo = titolo;
		this.regista = regista;
		this.annoProd = annoProd;
		this.attori = attori;
		this.supporto = supporto;
	}
	
	public int getCosto(int giorni){
		return supporto.getPrezzo(giorni);
	}
}
