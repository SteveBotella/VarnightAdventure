package maps;

import tools.Utils;
import ui.*;
import actors.Character;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Use to create the game board that the player interact with
 *
 * @see Case
 */
public class Game {

    /**
     * The generated grid
     *
     * @see Case
     */
    private ArrayList<Case> cases;

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
     * Scanner use to read player inputs
     */
    private Scanner sc;

    /**
     * int result for scanner
     */
    private int controllerChoiceInt;

    /**
     * string result for scanner
     */
    private String controllerChoiceString;

    /**
     *
     */
    private int nbGoblin;
    private int nbSorcerer;
    private int nbDragon;
    private int nbSword;
    private int nbMace;
    private int nbPotion;
    private int nbMediumPotion;
    private int nbLightningBolt;
    private int nbFireball;
    private int nbEmpty;

    /**
     * Base constructor to create the game
     *
     * @param caseNumber int number of cases to be generate
     *
     * @see Case
     */
    public Game(int caseNumber) {
        this.utils = new Utils();
        this.characterSheet = new CharacterSheet();
        this.sc = new Scanner(System.in);
        this.controllerChoiceInt = 1;
        this.controllerChoiceString = "";
        this.cases = new ArrayList<>();
        for (int i = 0 ; i < caseNumber; i++) { //TODO new rand system with choosing cases
            int roll = (int)(Math.random()*10+1);
            switch (roll) {
                case 1 :
                    cases.add(new ChestPotion());
                    break;
                case 2 :
                    cases.add(new Empty());
                    break;
                case 3 :
                    cases.add(new Gobelin());
                    break;
                case 4 :
                    cases.add(new Sorcerer());
                    break;
                case 5 :
                    cases.add(new Dragon());
                    break;
                case 6 :
                    cases.add(new ChestMediumPotion());
                    break;
                case 7 :
                    cases.add(new ChestSword());
                    break;
                case 8 :
                    cases.add(new ChestMace());
                    break;
                case 9 :
                    cases.add(new ChestLightningBolt());
                    break;
                case 10 :
                    cases.add(new ChestFireball());
                    break;
            }
        }
    }

    /**
     * Start the game
     *
     * @param player Character running the game
     * @param caseNumber int number of cases
     *
     * @see Case
     */
    public void gameStart(Character player, int caseNumber) {
        player.setWorldLocation(0);
        utils.waitSec(3, true, true);
        utils.storyText("-----     CHAPTER I     -----",
                "-----    Dungeon Var    -----",
                player,
                characterSheet,
                controllerChoiceInt,
                sc);

        utils.waitSec(1, false, false);
        utils.storyText("After many days traveling across the dangerous forest, the lost villages",
                "and enjoy your rest in 'lovely' Inn...",
                player,
                characterSheet,
                controllerChoiceInt,
                sc);

        utils.storyText("You prepare yourself to enter...",
                "!!! The Dungeon Var - No one been return !!!",
                player,
                characterSheet,
                controllerChoiceInt,
                sc);

        System.out.println("The sun is falling, night is coming, a cold wind run into your clothes");
        System.out.println("TAn abandoned Castle is front of you. It stink monsters... Or cheese maybe.");

        utils.storyText("You are in level " + (player.getWorldLocation() + 1),
                "(Roll the dice to move your character inside the dungeon)",
                player,
                characterSheet,
                controllerChoiceInt,
                sc);

        while (player.getWorldLocation() < (caseNumber - 1) && player.getHp() > 0) {
            int diceResult = utils.rollDice(6);
            player.setWorldLocation(player.getWorldLocation() + diceResult);
            if (player.getWorldLocation() > caseNumber) {
                player.setWorldLocation(caseNumber - 1);
            }
            cases.get(player.getWorldLocation()).run(player);
            utils.storyText("You are in level " + (player.getWorldLocation() + 1),
                    "(Roll the dice to move your character inside the dungeon)",
                    player,
                    characterSheet,
                    controllerChoiceInt,
                    sc);
        }

        if (player.getHp() > 0) {
            System.out.println("You raid the Dungeon succefully");
        }
        controllerChoiceInt = 999;
        System.out.println(" ");
        System.out.println("             -----------                         ----------                  ");
        System.out.println("            | Restart > |                       |  Quit >  |                 ");
        System.out.println("             -----------                         ----------                  ");
        System.out.println("             1 (Numpad)                          2 (Numpad)                  ");
        while (controllerChoiceInt != 1 && controllerChoiceInt != 2) {
            this.controllerChoiceInt = sc.nextInt();
            switch (controllerChoiceInt) {
                case 1:
                    player.setWorldLocation(0);
                    gameStart(player, 64);
                    break;
                case 2:
                    System.out.println("Leaving game...");
                    break;
                case 9:
                    characterSheet.paperSheet(player);
                    break;
            }
        }
    }
}
