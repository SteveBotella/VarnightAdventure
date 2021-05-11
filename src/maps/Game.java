package maps;

import tools.Utils;
import ui.*;
import actors.Character;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private ArrayList<Case> cases;
    private Utils utils;
    private CharacterSheet characterSheet;

    private Scanner sc;
    private int controllerChoiceInt;
    private String controllerChoiceString;

    public Game(int caseNumber) {
        this.utils = new Utils();
        this.characterSheet = new CharacterSheet();
        this.sc = new Scanner(System.in);
        this.controllerChoiceInt = 1;
        this.controllerChoiceString = "";
        this.cases = new ArrayList<>();
        for (int i = 0 ; i < caseNumber; i++) {
            int roll = (int)(Math.random()*5+1);
            switch (roll) {
                case 1 :
                    cases.add(new Chest());
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
            }
        }
    }

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
        System.out.println("End");
    }
}
