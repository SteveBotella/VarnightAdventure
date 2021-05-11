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
        System.out.println("Sorcerer");
        this.enemy = new Character("Sorcerer", " ", 9, 9, 2, 2, "Gobwin dawggewr", "Wrock throw", "Rwun Waway", "Whelp", 3, 0);
        fight(player, enemy);
    }
}
