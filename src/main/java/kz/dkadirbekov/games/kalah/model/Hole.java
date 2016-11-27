package kz.dkadirbekov.games.kalah.model;

import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * Created by dkadirbekov on 26.11.2016.
 */
public class Hole {

    private List<Stone> stones;
    private Hole nextHole;
    private Hole previousHole;
    private Player player;
    private Board board;

    public List<Stone> getStones() {
        return stones;
    }

    public void setStones(List<Stone> stones) {
        this.stones = stones;
    }

    public Hole getNextHole() {
        return nextHole;
    }

    public void setNextHole(Hole nextHole) {
        this.nextHole = nextHole;
    }

    public Hole getPreviousHole() {
        return previousHole;
    }

    public void setPreviousHole(Hole previousHole) {
        this.previousHole = previousHole;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Hole(Hole hole) {
        BeanUtils.copyProperties(hole, this);
    }

    public Hole() {
    }
}
