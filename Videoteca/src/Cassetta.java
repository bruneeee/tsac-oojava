
public class Cassetta extends Supporto{
	@Override
	public int getPrezzo(int giorni){
		if(giorni > 0)
			return 100 + 200*(giorni-1);
		return 0;
	}
}
