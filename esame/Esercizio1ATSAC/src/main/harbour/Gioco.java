package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {
	Porto porto;
	
	public Gioco(){}
	
	public Gioco(Porto p){
		this.porto = p;
	}
	public void attacco(Invasore[] invasori){
		int attacco = 0;
		for(Invasore i : invasori){
			attacco += i.potenzaFuoco();
		}
		porto.addMetriQuadriDistrutti((float)(attacco * 2.5));
	}
	public Boolean portoDistrutto(){
		if(porto.getDimensioneSqMetersNonDistrutta()>0)
			return false;
		return true;
	}
}
