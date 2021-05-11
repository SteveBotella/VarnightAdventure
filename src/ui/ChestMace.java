package ui;

import actors.Character;
import actors.Weapon;

public class ChestMace extends Case {
    @Override
    public void run(Character player) {
        System.out.println("Chest Mace");
        if (player.getSkillOne().getName().equals("Mace")) {
            System.out.println("Already got a mace");
        } else if (player.getSkillOne().getName().equals("Sword")) {
            System.out.println("Your weapon is better");
        } else {
            player.setSkillOne(new Weapon("Mace"));
        }
    }
}
