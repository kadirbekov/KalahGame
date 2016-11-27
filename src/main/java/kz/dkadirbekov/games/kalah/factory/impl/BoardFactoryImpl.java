package kz.dkadirbekov.games.kalah.factory.impl;

import kz.dkadirbekov.games.kalah.factory.BoardFactory;
import kz.dkadirbekov.games.kalah.factory.HoleFactory;
import kz.dkadirbekov.games.kalah.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * {@inheritDoc}
 * Created by dkadirbekov on 26.11.2016.
 */
@Service
public class BoardFactoryImpl implements BoardFactory {

    private final HoleFactory holeFactory;

    @Autowired
    public BoardFactoryImpl(
            final HoleFactory holeFactory) {
        this.holeFactory = holeFactory;
    }

    @Override
    public Board newType(List<Player> players,
                         Board.StoneNumber stoneNumber,
                         Board.PitsNumber pitsNumber) {
        Board board = new Board();

        LinkedList<Hole> holes = new LinkedList<>();

        Hole previousHole = null;
        for (Player player : players) {
            for (int holeIndex = 0; holeIndex < pitsNumber.getValue(); holeIndex++) {
                Pit pit = new Pit(
                        holeFactory.newType(
                                stoneNumber.getValue(),
                                player,
                                board),
                        holeIndex);
                previousHole = addNewHole(
                        pit,
                        previousHole,
                        holes);
            }
            Store store = new Store(
                    holeFactory.newType(
                            0,
                            player,
                            board));
            previousHole = addNewHole(
                    store,
                    previousHole,
                    holes);
        }
        holes.getLast().setNextHole(holes.getFirst());
        holes.getFirst().setPreviousHole(holes.getLast());
        board.setHoles(holes);

        return board;
    }

    private Hole addNewHole(Hole newHole, Hole previousHole, List<Hole> holes) {
        if (previousHole != null) {
            previousHole.setNextHole(newHole);
            newHole.setPreviousHole(previousHole);
        }
        previousHole = newHole;
        holes.add(newHole);
        return previousHole;
    }

}
