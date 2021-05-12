package tools;

import ui.CharacterSheet;
import actors.Character;

import java.util.Scanner;

/**
 * Use this class to call methods when needed.
 *
 * This can be usefull to roll dice everywhere by just calling the method from here
 */
public class Utils {
    /**
     * Read the player inputs
     */
    private Scanner sc;

    /**
     * Read integer from player inputs
     */
    private int controllerChoiceInt;

    /**
     * Read string from player inputs
     */
    private String controllerChoiceString;

    /**
     * Base constructor
     */
    public Utils() {
        this.sc = new Scanner(System.in);
        this.controllerChoiceInt = 1;
        this.controllerChoiceString = "";
    }

    /**
     * Use to leave the app
     */
    public void exitGame() {
        System.out.println("Do you want to leave the game ?");
        System.out.println("             ----------                          ----------                  ");
        System.out.println("            |   Yes  > |                        |   No   > |                 ");
        System.out.println("             ----------                          ----------                  ");
        System.out.println("             1 (Numpad)                          2 (Numpad)                  ");
    }


    /**
     * Call a loading event for "x" secondes & enable/disable "loading" & "dots"
     *
     * @param second int Seconds to wait
     * @param loading boolean Display loading or not
     * @param dot boolean Display dot every second or not
     */
    public void waitSec(int second, boolean loading, boolean dot) {
        try
        {
            System.out.println();
            if (loading) {
                System.out.print("Loading ");
            }
            for (int i = 0; i < second; i++) {
                Thread.sleep(1000);
                if (dot) {
                    System.out.print(". ");
                }
            }
            System.out.println();
            System.out.println();
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Display text you want & let the player choosing to continue the game with a scanner
     *
     * @param lineOne String Text display in first line
     * @param lineTwo String Text display in second line
     * @param player Character To be able to display his character sheet
     * @param characterSheet CharacterSheet to display
     * @param controllerChoiceInt int Read input result when asking the player to make a choice
     * @param sc Scanner the scanner used
     *
     * @see CharacterSheet
     */
    public void storyText(String lineOne, String lineTwo, Character player, CharacterSheet characterSheet, int controllerChoiceInt, Scanner sc) {
        while (controllerChoiceInt != 0) {
            System.out.println("     " + lineOne + "            ");
            System.out.println("     " + lineTwo + "            ");
            System.out.println("             ----------                                                      ");
            System.out.println("            |   Next > |                                                     ");
            System.out.println("             ----------                                                      ");
            System.out.println("             0 (Numpad)                                                      ");
            controllerChoiceInt = sc.nextInt();
            if (controllerChoiceInt == 9) {
                characterSheet.paperSheet(player);
            }
        }
    }

    /**
     * Display peasant logo
     */
    public void logoPeasant() {
        System.out.println("           / /           ");
        System.out.println("            /\\/         ");
        System.out.println("           /             ");
        System.out.println("     ---------------     ");
    }

    /**
     * Display warrior logo
     */
    public void logoWarrior() {
        System.out.println("                         ");
        System.out.println("       O==|=======>      ");
        System.out.println("                         ");
        System.out.println("     ---------------     ");
    }

    /**
     * Display mage logo
     */
    public void logoMage() {
        System.out.println("            *            ");
        System.out.println("            /\\          ");
        System.out.println("          _/__\\_        ");
        System.out.println("     ---------------     ");
    }

    /**
     * Ask rolling to dice
     */
    public void askToRoll() {
        System.out.println("      Your turn to roll the dice...            ");
        System.out.println("             ----------                                                      ");
        System.out.println("            |   Roll > |                                                     ");
        System.out.println("             ----------                                                      ");
        System.out.println("             0 (Numpad)                                                      ");
    }

    /**
     * Roll dices "x" faces
     * @param face int Dice faces number
     * @return dice int The dice result value
     */
    public int rollDice(int face) {
        int dice = (int)(Math.random()*face+1);
        System.out.println("Dice " + face + " roll... " + dice + " !");
        System.out.println("             ----------                                                      ");
        System.out.println("            |   Next > |                                                     ");
        System.out.println("             ----------                                                      ");
        System.out.println("             0 (Numpad)                                                      ");
        return dice;
    }

    /**
     * Rand the damages
     *
     * @param damageMin int Damages can be deal at least
     * @param damageMax int Damages can be deal at most
     * @return dice int The dice result value
     */
    public int rollDamage(int damageMin, int damageMax) {
        int dice = (int)(Math.random()*damageMax+damageMin);
        return dice;
    }

    /**
     * Rand the gold
     *
     * @param enemy Character The enemy archetype
     * @return gold int The result value
     */
    public int rollGold(Character enemy) {
        int gold = (int)(Math.random()*enemy.getGold()+enemy.getMinGold());
        return gold;
    }
}
