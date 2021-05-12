package ui;

import actors.Character;
import actors.Item;
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

    /**
     * Base constructor
     */
    public Case() {
        this.sc = new Scanner(System.in);
        this.utils = new Utils();
        this.characterSheet = new CharacterSheet();
        this.skillChoice = 999;
    }

    /**
     * Call to play the event needed
     *
     * @param player Character calling this event by opening the Case
     */
    public void run(Character player) {
        System.out.println("");
    }

    /**
     * The fight system
     * Player & enemy play each turn
     *
     * @param player Character for the player
     * @param enemy Character for the enemy
     */
    public void fight(Character player, Character enemy) {
        int turn = 1;
        while (player.getHp() > 0 && enemy.getHp() > 0) {
            System.out.println("Start Turn " + turn);
            getCharacterSheet().paperSheet(player);
            System.out.println("Versus");
            getCharacterSheet().paperSheet(enemy);
            ;
            this.setSkillChoice(getSc().nextInt());
            switch (getSkillChoice()) {
                case 1:
                    player.getSkillOne().itemEvent("damage", player, enemy, player.getSkillOne(), getUtils());
                    break;
                case 2:
                    player.getSkillTwo().itemEvent("damage", player, enemy, player.getSkillTwo(), getUtils());
                    break;
                case 3:
                    player.getSkillThree().itemEvent("damage", player, enemy, player.getSkillThree(), getUtils());
                    break;
                case 4:
                    if (player.getSkillFour().getNumber() >= 1) {
                        player.getSkillFour().itemEvent("health", player, enemy, player.getSkillFour(), getUtils());
                        player.getSkillFour().setNumber(player.getSkillFour().getNumber() - 1);
                    } else {
                        System.out.println("No more item ! Let's fight...");
                        player.setSkillFour(new Item(" "));
                        player.getSkillThree().itemEvent("damage", player, enemy, player.getSkillThree(), getUtils());
                    }
                    break;
            }
            getCharacterSheet().paperSheet(enemy);
            System.out.println("Versus");
            getCharacterSheet().paperSheet(player);
            if (enemy.getHp() <= 0) {
                System.out.println(player.getName() + " win the fight !");
                player.setGold(player.getGold() + getUtils().rollGold(enemy));
            } else {
                enemy.getSkillOne().itemEvent("damage", enemy, player, enemy.getSkillOne(), getUtils());
                System.out.println("End Turn " + turn);
                turn++;
                if (player.getHp() <= 0) {
                    System.out.println("Game Over");
                }
            }
        }
    }

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
