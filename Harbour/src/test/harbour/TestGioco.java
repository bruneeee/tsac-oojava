package test.harbour;

import static org.junit.Assert.*;

import org.junit.Test;

import harbour.Aereo;
import harbour.Gioco;
import harbour.Invasore;
import harbour.PortoNavale;
import harbour.Sottomarino;

public class TestGioco {
	
	private PortoNavale porto = new PortoNavale("",2,2000);
	private Invasore[] invasori = new Invasore[]{
			new Sottomarino("","",10,10),
			new Aereo("","",5,1)
	};
	private Gioco g = new Gioco(porto);
	
	@Test
	public void testOndata() {
		int count = 0;
		while(g.isAlive()){
			//System.out.println("Ondata: " + count);
			g.ondata(invasori);
			count++;
			//System.out.println("Vita : " + porto.getDimensione());
		}
		System.out.println("Resiste fino a: " + (count-1));
		assertEquals(8,count);
	}
	
	@Test 
	public void testGetPotenza(){
		int potenza = g.getPotenza(invasori);
		assertEquals(175,potenza);
	}

}
