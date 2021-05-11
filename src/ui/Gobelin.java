package ui;

import actors.Character;
import tools.Utils;
import ui.CharacterSheet;

import java.util.Scanner;

public class Gobelin extends Case {

    Character enemy;

    public Gobelin() {
        super();
        this.enemy = null;
    }

    @Override
    public void run(Character player) {
        System.out.println("Gobelin");
        this.enemy = new Character("Gobelin", " ", 6, 6, 1, 1, "Gobwin dawggewr", "Wrock throw", "Rwun Waway", "Whelp", 3, 0);
        fight(player, enemy);
    }
}
