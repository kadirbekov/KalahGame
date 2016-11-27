package kz.dkadirbekov.games.kalah.model;

/**
 * Created by dkadirbekov on 26.11.2016.
 */
public class Stone {

    private Hole hole;

    public Stone(Hole hole) {
        this.hole = hole;
    }

    public Hole getHole() {
        return hole;
    }

    public void setHole(Hole hole) {
        this.hole = hole;
    }
}
