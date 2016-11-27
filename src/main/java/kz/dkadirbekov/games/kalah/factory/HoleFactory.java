package kz.dkadirbekov.games.kalah.factory;

import kz.dkadirbekov.games.kalah.model.*;
import org.springframework.stereotype.Service;

/**
 * Factory that is responsible for returning instance of {@link Hole}
 * Created by dkadirbekov on 27.11.2016.
 */
@Service
public interface HoleFactory {

    /**
     * Creates {@link Hole} with {@code stoneNumber} of {@link Stone stones}.<br/>
     * {@link Hole#player} = {@code player}<br/>
     * {@link Hole#board} = {@code board}
     *
     * @param stoneNumber number of {@link Stone stones} in the generated {@link Hole}
     * @param player {@link Player} for whom the hole is related
     * @param board {@link Board} where the hole is located
     * @return new generated {@link Hole}
     */
    Hole newType(int stoneNumber,
                 Player player,
                 Board board);

}
