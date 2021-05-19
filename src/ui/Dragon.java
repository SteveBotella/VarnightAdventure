package ui;

import actors.Character;

public class Dragon extends CaseEnemy {
    Character enemy;

    public Dragon() {
        super();
        this.enemy = null;
    }

    @Override
    public void run(Character player) {
        System.out.println("A Dragon ? Really ?... Nah... I'm just tired.");
        System.out.println("Shhhh ! A DRAGON !!!");
        this.enemy = new Character("Dragon", "Dragon", 15, 15, 4, 4, "Dragon Strike", "Wrock throw", "Rwun Waway", "Whelp", 15, 10);
        fight(player, enemy);
    }
}
