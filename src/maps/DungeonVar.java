package maps;

import tools.Utils;
import actors.Character;

public class DungeonVar {
    Utils utils = new Utils();

    int N = 64;
    int actualRoom = 0;
    int[] room = new int[N];

    public void gameStart(Character player1) {
        utils.storyText("After many days traveling across the dangerous forest, the lost villages",
                        "and enjoy your rest in 'lovely' Inn...");
        utils.waitSec(3,true, true);
        utils.storyText("After many days traveling across the dangerous forest, the lost villages",
                        "and enjoy your rest in 'lovely' Inn...");
        utils.storyText("You prepare yourself to enter...",
                        "!!! The Dungeon Var - No one been return !!!");

        player1.characterSheet();

        utils.rollDice();
    }
}
