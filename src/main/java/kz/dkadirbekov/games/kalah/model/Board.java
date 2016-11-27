package kz.dkadirbekov.games.kalah.model;

import java.util.List;

/**
 * Created by dkadirbekov on 26.11.2016.
 */
public class Board {
    private PitsNumber pitsNumber;
    private StoneNumber stoneNumber;

    public enum PitsNumber {
        SIX_PITS_BOARD(6);

        private int value;

        PitsNumber(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum StoneNumber {
        SIX_STONE_HOUSE(6),
        FOUR_STONE_HOUSE(4);

        private int stoneNumber;

        StoneNumber(int stoneNumber) {
            this.stoneNumber = stoneNumber;
        }

        public int getValue() {
            return stoneNumber;
        }
    }

    public PitsNumber getPitsNumber() {
        return pitsNumber;
    }

    public void setPitsNumber(PitsNumber pitsNumber) {
        this.pitsNumber = pitsNumber;
    }

    public StoneNumber getStoneNumber() {
        return stoneNumber;
    }

    public void setStoneNumber(StoneNumber stoneNumber) {
        this.stoneNumber = stoneNumber;
    }

    private List<Hole> holes;

    public List<Hole> getHoles() {
        return holes;
    }

    public void setHoles(List<Hole> holes) {
        this.holes = holes;
    }

    /**
     * Searches for {@link Store} that belongs to {@link Player}
     *
     * @param player {@link Player}
     * @return {@link Store} that belongs to {@link Player}
     */
    public Store getPlayerStore(Player player) {
        return (Store) this.getHoles().stream()
                .filter(hole ->
                        hole instanceof Store)
                .filter(hole ->
                        player.equals(hole.getPlayer()))
                .findFirst()
                .get();
    }
}
