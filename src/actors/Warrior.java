package actors;

/**
 * Use to create a Warrior
 * This class extends Character
 *
 * @see Character
 */
public class Warrior extends Character implements Npc {

    /**
     * Use this constructor to create a base Warrior
     */
    public Warrior() {
        super("Warrior",
                "",
                5,
                10,
                5,
                10,
                "Bare Hands",
                "Bare Hands",
                "Bare Hands",
                "Bare Hands",
                0,
                0);
    }

    @Override
    public boolean isNpc() {
        return false;
    }
}
