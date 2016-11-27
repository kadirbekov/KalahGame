package kz.dkadirbekov.games.kalah.factory.impl;

import kz.dkadirbekov.games.kalah.factory.HoleFactory;
import kz.dkadirbekov.games.kalah.model.Board;
import kz.dkadirbekov.games.kalah.model.Hole;
import kz.dkadirbekov.games.kalah.model.Player;
import kz.dkadirbekov.games.kalah.model.Stone;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

/**
 * {@inheritDoc}
 * Created by dkadirbekov on 27.11.2016.
 */
@Service
public class HoleFactoryImpl implements HoleFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public Hole newType(int stoneNumber,
                        Player player,
                        Board board) {
        Hole hole = new Hole();
        hole.setPlayer(player);
        hole.setBoard(board);

        hole.setStones(new LinkedList<>());
        for (int i = 0; i < stoneNumber; i++) {
            hole.getStones().add(new Stone(hole));
        }

        return hole;
    }

}
