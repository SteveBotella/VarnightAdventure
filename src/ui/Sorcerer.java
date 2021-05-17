package ui;

import actors.Character;
import tools.Utils;
import ui.CharacterSheet;

import java.util.Scanner;

public class Sorcerer extends Case {
    Character enemy;

    public Sorcerer() {
        super();
        this.enemy = null;
    }

    @Override
    public void run(Character player) {
        System.out.println("A Sorcerer is casting a spell and look at you. It seems that it's not good...");
        this.enemy = new Character("Sorcerer", "Sorcerer", 9, 9, 2, 2, "Dark Magic", "Wrock throw", "Rwun Waway", "Whelp", 8, 4);
        fight(player, enemy);
    }
}
