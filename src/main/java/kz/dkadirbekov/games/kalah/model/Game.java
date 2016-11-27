package kz.dkadirbekov.games.kalah.model;

import java.util.List;

/**
 * Created by dkadirbekov on 27.11.2016.
 */
public class Game {

    private List<Player> players;
    private Board board;
    private Player turn;

    public enum PlayersNumber {
        TWO_PLAYER_BOARD(2);

        private int playersNumber;

        PlayersNumber(int playersNumber) {
            this.playersNumber = playersNumber;
        }

        public int getValue() {
            return playersNumber;
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getTurn() {
        return turn;
    }

    public void setTurn(Player turn) {
        this.turn = turn;
    }
}
