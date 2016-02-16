package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Sottomarino extends Invasore{
	int stazza;
	int nArmamenti;
	
	public int getStazza() {
		return stazza;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

	public int getnArmamenti() {
		return nArmamenti;
	}

	public void setnArmamenti(int nArmamenti) {
		this.nArmamenti = nArmamenti;
	}

	public int potenzaFuoco(){
		return Math.round((float)(stazza * nArmamenti)*25 /100);
	}
}
