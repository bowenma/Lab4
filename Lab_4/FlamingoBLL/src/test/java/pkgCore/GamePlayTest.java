package pkgCore;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;

import pkgEnum.eGameType;

public class GamePlayTest {
	Table t = new Table();
	Player P1 = new Player("lady m",1);
	Player P2 = new Player("lady A",1);
	Player P3 = new Player("lady ab ",1);
	HashMap<UUID,Player> PlayersAtTable;
	GamePlayBlackJack Game = new GamePlayBlackJack(eGameType.BLACKJACK);
	
	
	@Test
	public void test() {
		t.AddPlayerToTable(P1);
		t.AddPlayerToTable(P2);
		t.AddPlayerToTable(P3);
		PlayersAtTable = t.getPlayersInTable();
		Game.AddPlayersToGame(PlayersAtTable);
		
		
		assertEquals(Game.getGamePlayers(),PlayersAtTable);
		assertEquals(P1.getPlayerID(),Game.GetPlayerInGame(P1).getPlayerID());
		
		
		Game.RemovePlayerFromGame(P3);
		
	
		assertEquals(null,Game.GetPlayerInGame(P3));
		
	}

}
