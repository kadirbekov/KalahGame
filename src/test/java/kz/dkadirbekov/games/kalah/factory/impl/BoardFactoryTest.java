package kz.dkadirbekov.games.kalah.factory.impl;

import kz.dkadirbekov.games.kalah.factory.HoleFactory;
import kz.dkadirbekov.games.kalah.model.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by dkadirbekov on 27.11.2016.
 */
@RunWith(PowerMockRunner.class)
public class BoardFactoryTest {

    BoardFactoryImpl boardFactory;

    @Spy
    private HoleFactory holeFactory = new HoleFactoryImpl();

    Board board;
    Player player1, player2;
    List<Player> players;

    @Before
    public void prepare() {
        boardFactory = new BoardFactoryImpl(
                holeFactory);

        player1 = new Player(0);
        player2 = new Player(1);

        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
    }

    @Test
    public void testNewType_sixStonesSixHousesTwoPlayers() {
        Board.StoneNumber sixStoneHouse = Board.StoneNumber.SIX_STONE_HOUSE;
        Board.PitsNumber sixAlveolusBoard = Board.PitsNumber.SIX_PITS_BOARD;
        Board board = boardFactory.newType(
                players,
                sixStoneHouse,
                sixAlveolusBoard);
        List<Hole> holes = board.getHoles();
        for(int i = 0; i < holes.size(); i++) {
            Hole hole = holes.get(i);
            if(i <= sixAlveolusBoard.getValue()) {
                assertEquals(player1, hole.getPlayer());
            } else {
                assertEquals(player2, hole.getPlayer());
            }

            if(i % (sixAlveolusBoard.getValue() + 1) == sixAlveolusBoard.getValue()) {
                assertTrue(hole instanceof Store);
                assertTrue(hole.getStones().isEmpty());
            } else {
                assertTrue(hole instanceof Pit);
                assertEquals(sixStoneHouse.getValue(), hole.getStones().size());
            }

            assertEquals(board, hole.getBoard());
            assertEquals(holes.get(i == 0 ? holes.size() - 1 : i - 1), hole.getPreviousHole());
            assertEquals(holes.get(i == holes.size() - 1 ? 0 : i + 1), hole.getNextHole());
        }

    }

}
