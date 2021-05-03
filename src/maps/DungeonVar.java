package maps;

import actors.Character;
import tools.Utils;
import ui.CharacterSheet;

import java.util.Scanner;

public class DungeonVar {
    Utils utils = new Utils();
    CharacterSheet characterSheet = new CharacterSheet();

    Scanner sc = new Scanner(System.in);
    int controllerChoiceInt = 999;
    String controllerChoiceString = "";

    int N = 64;
    Object[] room = new Object[N];

    public void gameStart(Character player1) {
        player1.setWorldLocation(0);

        utils.waitSec(3, true, true);
        utils.storyText("-----     CHAPTER I     -----",
                "-----    Dungeon Var    -----");

        while (controllerChoiceInt != 0) {
            this.controllerChoiceInt = sc.nextInt();
            if (controllerChoiceInt == 0) {
                utils.waitSec(1, false, false);
                utils.storyText("After many days traveling across the dangerous forest, the lost villages",
                        "and enjoy your rest in 'lovely' Inn...");
            } else if (controllerChoiceInt == 9) {
                characterSheet.characterSheet(player1);
            }
        }
        controllerChoiceInt = 999;

        while (controllerChoiceInt != 0) {
            this.controllerChoiceInt = sc.nextInt();
            if (controllerChoiceInt == 0) {
                utils.storyText("You prepare yourself to enter...",
                        "!!! The Dungeon Var - No one been return !!!");
            } else if (controllerChoiceInt == 9) {
                characterSheet.characterSheet(player1);

            }
        }
        controllerChoiceInt = 999;

        while (controllerChoiceInt != 0) {
            this.controllerChoiceInt = sc.nextInt();
            if (controllerChoiceInt == 0) {
                utils.storyText("The sun is falling, night is coming, a cold wind run into your clothes",
                        "An abandoned Castle is front of you. It stink monsters... Or cheese maybe.");
            } else if (controllerChoiceInt == 9) {
                characterSheet.characterSheet(player1);
            }
        }
        controllerChoiceInt = 999;
        while (player1.getHp() > 0 && player1.getWorldLocation() < 64) {
            while (controllerChoiceInt != 0) {
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    System.out.println("You are in level " + player1.getWorldLocation());
                    System.out.println("(Roll the dice to move your character inside the dungeon)");
                    utils.askToRoll();
                } else if (controllerChoiceInt == 9) {
                    characterSheet.characterSheet(player1);
                }
            }
            controllerChoiceInt = 999;

            while (controllerChoiceInt != 0) {
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    int diceResult = utils.rollDice(6);
                    player1.setWorldLocation(player1.getWorldLocation() + diceResult);
                } else if (controllerChoiceInt == 9) {
                    characterSheet.characterSheet(player1);
                }
            }
            controllerChoiceInt = 999;
        }

        player1.setWorldLocation(64);
        System.out.println("You are in level " + player1.getWorldLocation());
        System.out.println("You raid the Dungeon succefully");
    }
}
