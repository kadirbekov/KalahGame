package kz.dkadirbekov.games.kalah.model;

/**
 * Created by dkadirbekov on 26.11.2016.
 */
public class Pit extends Hole {
    private int index;
    public Pit(Hole hole, int index) {
        super(hole);
        this.index = index;
    }

    public Pit() {
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
