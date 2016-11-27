package kz.dkadirbekov.games.kalah.factory.impl;

import kz.dkadirbekov.games.kalah.model.Board;
import kz.dkadirbekov.games.kalah.model.Hole;
import kz.dkadirbekov.games.kalah.model.Player;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by dkadirbekov on 27.11.2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class HoleFactoryTest {

    @InjectMocks
    HoleFactoryImpl holeFactory;

    Player player;
    Board board;

    @Before
    public void prepare() {
        player = new Player();
        board = new Board();
    }

    @Test
    public void testNewType() {
        Hole result = holeFactory.newType(6, player, board);
        assertEquals(board, result.getBoard());
        assertEquals(player, result.getPlayer());
        assertEquals(6, result.getStones().size());
        result.getStones().forEach(
                stone -> assertEquals(result, stone.getHole()));
    }
}
