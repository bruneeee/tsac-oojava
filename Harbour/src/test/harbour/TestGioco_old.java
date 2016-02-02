package test.harbour;

import static org.junit.Assert.*;

import org.junit.Test;

import harbour.Aereo;
import harbour.Gioco;
import harbour.Invasore;
import harbour.PortoNavale;
import harbour.Sottomarino;

public class TestGioco_old {

	private PortoNavale porto = new PortoNavale("",2,20000);
	private Invasore[] invasori = new Invasore[]{
			new Sottomarino("","",10,10),
			new Aereo("","",5,1)
	};
	private Gioco g = new Gioco(porto,invasori);
	
	public void test() {
		int count = 0;
		while(g.isAlive()){
			System.out.println("Ondata: " + count++);
			g.ondata();
			//System.out.println("Vita : " + porto.getDimensione());
		}
		assertEquals(7,count);
	}

}
