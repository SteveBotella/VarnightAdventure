package ui;

import actors.Character;

public class Gobelin extends CaseEnemy {

    Character enemy;

    public Gobelin() {
        super();
        this.enemy = null;
    }

    @Override
    public void run(Character player) {
        System.out.println("A Gobelin is facing you");
        this.enemy = new Character("Gobelin", "Gobelin", 6, 6, 1, 1, "Gobwin dawggewr", "Wrock throw", "Rwun Waway", "Whelp", 3, 0);
        fight(player, enemy);
    }
}
