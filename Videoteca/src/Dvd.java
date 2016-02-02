
public class Dvd extends Supporto{
	
	@Override
	public int getPrezzo(int n){
		if(n>0){
			if(n<=2)
				return 150*n;
			return 300+200*(n-2);
		}
		return 0;
	}
}
