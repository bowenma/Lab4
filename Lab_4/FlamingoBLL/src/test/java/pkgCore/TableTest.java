package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest {
	Table t = new Table();
	Player P1 = new Player("lady m",1);
	Player P2 = new Player("lady A",1);
	Player P3 = new Player("lady ab",1);
	@Test
	public void test() {
		
		t.AddPlayerToTable(P1);
		t.AddPlayerToTable(P2);
		t.AddPlayerToTable(P3);
		assertEquals(P1.getPlayerID(),t.GetPlayerFromTable(P1).getPlayerID());
		
		t.RemovePlayerFromTable(P3);
		assertEquals(null,t.GetPlayerFromTable(P3));
		
	}

}
