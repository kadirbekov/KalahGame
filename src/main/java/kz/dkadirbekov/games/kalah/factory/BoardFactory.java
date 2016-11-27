package kz.dkadirbekov.games.kalah.factory;

import kz.dkadirbekov.games.kalah.model.Board;
import kz.dkadirbekov.games.kalah.model.Player;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Factory that is responsible for creating {@link Board}
 * Created by dkadirbekov on 26.11.2016.
 */
@Service
public interface BoardFactory {

    Board newType(List<Player> players,
                  Board.StoneNumber boardType,
                  Board.PitsNumber pitsNumber);

}
