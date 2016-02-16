package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Cacciabombardiere extends Invasore{
	int nArmamentiAlpha;
	int nArmamentiBeta;
	
	public Cacciabombardiere(){}
	public int potenzaFuoco(){
		return (nArmamentiAlpha + nArmamentiBeta)*40;
	}

	public int getnArmamentiAlpha() {
		return nArmamentiAlpha;
	}

	public void setnArmamentiAlpha(int nArmamentiAlpha) {
		this.nArmamentiAlpha = nArmamentiAlpha;
	}

	public int getnArmamentiBeta() {
		return nArmamentiBeta;
	}

	public void setnArmamentiBeta(int nArmamentiBeta) {
		this.nArmamentiBeta = nArmamentiBeta;
	}
}
