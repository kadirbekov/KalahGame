package kz.dkadirbekov.games.kalah.factory.impl;

import kz.dkadirbekov.games.kalah.factory.PlayerFactory;
import kz.dkadirbekov.games.kalah.model.Player;

/**
 * Created by dkadirbekov on 26.11.2016.
 */
public class PlayerFactoryImpl implements PlayerFactory {

    @Override
    public Player newInstance(int playerIndex) {
        Player player = new Player(playerIndex);
        return player;
    }

}
