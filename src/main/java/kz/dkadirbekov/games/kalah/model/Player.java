package kz.dkadirbekov.games.kalah.model;

/**
 * Created by dkadirbekov on 26.11.2016.
 */
public class Player {
    private int index;
    private String name;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player() {
    }

    public Player(int index) {
        this.index = index;
        this.name = String.format("Player %d", index);
    }

    public Player(int index, String name) {
        this.index = index;
        this.name = name;
    }

    /**
     * Make move using {@link Pit}.
     * The {@link Stone stones} from {@link Pit} are distributed one by one in the {@link Pit houses}
     * and the players own {@link Store}, but not into the opponent's {@link Store}. <br/>
     * If the last {@link Stone stone} is dropped into an opponent's {@link Pit} or a non-empty {@link Pit} of the player,
     * the move ends without anything being captured.<br/>
     * If the last {@link Stone} falls into the player's {@link Store}, next {@link Game#turn} is also his.
     * If the last {@link Stone} is put into an empty {@link Pit} owned by the player, he captures all contents
     * of the opposite {@link Pit} together with the capturing piece and puts them in his {@link Store}.
     * If the opposite {@link Pit} is empty, nothing is captured. A capture ends the move.
     * @param pit
     */
    public void makeMove(Pit pit) {

    }
}
