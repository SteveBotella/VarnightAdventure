package ui;

import actors.Character;
import tools.Utils;
import ui.CharacterSheet;

import java.util.Scanner;

public class Dragon extends Case {
    Character enemy;

    public Dragon() {
        super();
        this.enemy = null;
    }

    @Override
    public void run(Character player) {
        System.out.println("Dragon");
        this.enemy = new Character("Dragon", "Dragon", 15, 15, 4, 4, "Dragon Strike", "Wrock throw", "Rwun Waway", "Whelp", 15, 10);
        fight(player, enemy);
    }
}
