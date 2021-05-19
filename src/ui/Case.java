package ui;

import actors.Character;
import tools.Utils;

import java.util.Scanner;

/**
 * Use to create Case that the player encounter
 *
 * @see maps.Game
 */
public abstract class Case {

    /**
     * Read the player inputs
     */
    private Scanner sc;

    /**
     * Tools enable to run dice & other usefull methods
     *
     * @see Utils
     */
    private Utils utils;

    /**
     * Character sheet with player informations
     *
     * @see CharacterSheet
     */
    private CharacterSheet characterSheet;

    /**
     * The player character
     *
     * @see Character
     */
    private Character player;

    /**
     * The character skill choice when it's his turn
     *
     * @see Character
     */
    private int skillChoice;
    private int controllerChoiceInt;

    /**
     * Base constructor
     */
    public Case() {
        this.sc = new Scanner(System.in);
        this.utils = new Utils();
        this.characterSheet = new CharacterSheet();
        this.skillChoice = 999;
        this.controllerChoiceInt = 999;
    }

    /**
     * Call to play the event needed
     *
     * @param player Character calling this event by opening the Case
     */
    public abstract void run(Character player);

    /**
     * The fight system
     * Player & enemy play each turn
     *
     * @param player Character for the player
     * @param enemy Character for the enemy
     */

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public Utils getUtils() {
        return utils;
    }

    public void setUtils(Utils utils) {
        this.utils = utils;
    }

    public CharacterSheet getCharacterSheet() {
        return characterSheet;
    }

    public void setCharacterSheet(CharacterSheet characterSheet) {
        this.characterSheet = characterSheet;
    }

    public Character getPlayer() {
        return player;
    }

    public void setPlayer(Character player) {
        this.player = player;
    }

    public int getSkillChoice() {
        return skillChoice;
    }

    public void setSkillChoice(int skillChoice) {
        this.skillChoice = skillChoice;
    }
}
