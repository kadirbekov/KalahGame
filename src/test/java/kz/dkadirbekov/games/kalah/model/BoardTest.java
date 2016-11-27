package kz.dkadirbekov.games.kalah.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by dkadirbekov on 27.11.2016.
 */
public class BoardTest {

    @Test
    public void testGetPlayerStore() {
        Player player1 = new Player(0);
        Player player2 = new Player(1);

        Pit pit1 = new Pit();
        Pit pit2 = new Pit();
        Store store1 = new Store();
        store1.setPlayer(player1);
        Store store2 = new Store();
        store2.setPlayer(player2);

        List<Hole> holes = new ArrayList<>();
        holes.add(pit1);
        holes.add(pit2);
        holes.add(store1);
        holes.add(store2);

        Board board = new Board();
        board.setHoles(holes);

        assertEquals(store2, board.getPlayerStore(player2));
    }
}
