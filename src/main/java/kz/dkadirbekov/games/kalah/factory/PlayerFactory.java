package kz.dkadirbekov.games.kalah.factory;

import kz.dkadirbekov.games.kalah.model.Player;

/**
 * Factory that is responsible for returning instance of {@link Player}
 * Created by dkadirbekov on 26.11.2016.
 */
public interface PlayerFactory {

    Player newInstance(int playerIndex);
}
