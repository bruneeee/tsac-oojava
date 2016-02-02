
public class BluRay extends Supporto{
	@Override
	public int getPrezzo(int g){
		float s = 1f;
		for(int i=0;i<g-1;i++){
			s += s*(1+(0.1*(i+1)));
		}		
		return (int) s*100;	
	}
}
