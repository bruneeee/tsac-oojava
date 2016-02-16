package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Porto {
	float dimensioneSqMeters;
	float dimensioneDistrutta;
	
	public Porto(){}
	
	public int getDimensioneSqMeters() {
		return (int)dimensioneSqMeters;
	}
	public void setDimensioneSqMeters(int dimensioneSqMeters) {
		this.dimensioneSqMeters = dimensioneSqMeters;
	}
	public void addMetriQuadriDistrutti(double danni){
		if(dimensioneDistrutta + danni > dimensioneSqMeters)
			dimensioneDistrutta = dimensioneSqMeters;
		else
			dimensioneDistrutta += danni;
	}
	public float getDimensioneSqMetersNonDistrutta(){
		return dimensioneSqMeters - dimensioneDistrutta;
	}
}
